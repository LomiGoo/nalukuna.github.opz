 package com.mycompany.mavenproject1;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.awt.Desktop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class requestformController {

    // ================= TEXTFIELDS =================
    @FXML private TextField txtStudentName;
    @FXML private TextField txtLRN;
    @FXML private TextField txtEmail;
    @FXML private TextField txtContactNumber;
    @FXML private TextField txtOtherPurpose;

    // ================= COMBOBOX =================
    @FXML private ComboBox<String> cbLastYearLevel;
    @FXML private ComboBox<String> cbStudentStatus;

    // ================= DATE =================
    @FXML private DatePicker dpBirthDate;

    // ================= CHECKBOX =================
    @FXML private CheckBox chkCollege;
    @FXML private CheckBox chkEmployment;
    @FXML private CheckBox chkTransfer;
    @FXML private CheckBox chkScholarship;
    @FXML private CheckBox chkPersonalCopy;

    // ================= FILE =================
    private File selectedIDFile;

    // ================= INITIALIZE =================
    @FXML
    public void initialize() {

        cbLastYearLevel.getItems().addAll(
            "Grade 6", "Grade 7", "Grade 8",
            "Grade 9", "Grade 10", "Grade 11", "Grade 12"
        );

        cbStudentStatus.getItems().addAll(
            "Currently Enrolled",
            "Graduated",
            "Dropped",
            "Transferred"
        );

        chkCollege.setOnAction(e -> selectOnly(chkCollege));
        chkEmployment.setOnAction(e -> selectOnly(chkEmployment));
        chkTransfer.setOnAction(e -> selectOnly(chkTransfer));
        chkScholarship.setOnAction(e -> selectOnly(chkScholarship));
        chkPersonalCopy.setOnAction(e -> selectOnly(chkPersonalCopy));

        createTable();
    }

    private void selectOnly(CheckBox selected) {
        chkCollege.setSelected(selected == chkCollege);
        chkEmployment.setSelected(selected == chkEmployment);
        chkTransfer.setSelected(selected == chkTransfer);
        chkScholarship.setSelected(selected == chkScholarship);
        chkPersonalCopy.setSelected(selected == chkPersonalCopy);
    }

    // ================= BROWSE =================
    @FXML
    private void handleBrowse() {
        FileChooser fc = new FileChooser();
        fc.setTitle("Upload Student ID");
        fc.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("Image / PDF", "*.jpg", "*.png", "*.jpeg", "*.pdf")
        );

        selectedIDFile = fc.showOpenDialog(null);

        if (selectedIDFile != null) {
            showInfo("File selected: " + selectedIDFile.getName());
        }
    }

    // ================= SUBMIT =================
    @FXML
    private void handleSubmit() {

        clearAllStyles();

        if (txtStudentName.getText().isEmpty()) {
            markInvalid(txtStudentName);
            showError("Student Name is required.");
            return;
        }

        if (txtLRN.getText().isEmpty()) {
            markInvalid(txtLRN);
            showError("LRN is required.");
            return;
        }

        if (!isValidEmail(txtEmail.getText())) {
            markInvalid(txtEmail);
            showError("Invalid email format.");
            return;
        }

        if (txtContactNumber.getText().isEmpty()) {
            markInvalid(txtContactNumber);
            showError("Contact Number is required.");
            return;
        }

        if (cbLastYearLevel.getValue() == null) {
            markInvalid(cbLastYearLevel);
            showError("Select last year level.");
            return;
        }

        if (cbStudentStatus.getValue() == null) {
            markInvalid(cbStudentStatus);
            showError("Select student status.");
            return;
        }

        if (dpBirthDate.getValue() == null) {
            markInvalid(dpBirthDate);
            showError("Select birth date.");
            return;
        }

        if (!chkCollege.isSelected() && !chkEmployment.isSelected()
                && !chkTransfer.isSelected() && !chkScholarship.isSelected()
                && !chkPersonalCopy.isSelected() && txtOtherPurpose.getText().isEmpty()) {
            showError("Select at least one purpose.");
            return;
        }

        if (selectedIDFile == null) {
            showError("Please upload your Student ID.");
            return;
        }

        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Confirm Submission");
        confirm.setHeaderText("Submit Request Form?");
        confirm.setContentText("Please confirm all information is correct.");

        if (confirm.showAndWait().get() != ButtonType.OK) return;

        saveToDatabase();
        generatePDF();

        showSuccess("Request submitted successfully!\nPDF receipt is ready.");

        openPDFReceipt();
        resetForm();
    }

    // ================= DATABASE =================
    private void createTable() {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:requestform.db")) {
            String sql =
    "CREATE TABLE IF NOT EXISTS requests (" +
    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
    "student_name TEXT" +
    ")";
            con.prepareStatement(sql).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveToDatabase() {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:requestform.db")) {
            String sql =
    "INSERT INTO requests " +
    "(student_name, lrn, email, contact, year_level, status, birthdate, id_file) " +
    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtStudentName.getText());
            ps.setString(2, txtLRN.getText());
            ps.setString(3, txtEmail.getText());
            ps.setString(4, txtContactNumber.getText());
            ps.setString(5, cbLastYearLevel.getValue());
            ps.setString(6, cbStudentStatus.getValue());
            ps.setString(7, dpBirthDate.getValue().toString());
            ps.setString(8, selectedIDFile.getAbsolutePath());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= PDF =================
    // openPDFReceipt();
    private void generatePDF() {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("RequestReceipt.pdf"));
            doc.open();

            doc.add(new Paragraph("REQUEST FORM RECEIPT\n\n"));
            doc.add(new Paragraph("Name: " + txtStudentName.getText()));
            doc.add(new Paragraph("LRN: " + txtLRN.getText()));
            doc.add(new Paragraph("Email: " + txtEmail.getText()));
            doc.add(new Paragraph("Year Level: " + cbLastYearLevel.getValue()));
            doc.add(new Paragraph("Status: " + cbStudentStatus.getValue()));
            doc.add(new Paragraph("Birthdate: " + dpBirthDate.getValue()));
            doc.add(new Paragraph("Uploaded File: " + selectedIDFile.getName()));

            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void openPDFReceipt() {
        try {
            Desktop.getDesktop().open(new File("RequestReceipt.pdf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= UTILITIES =================
    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private void markInvalid(Control c) {
        c.setStyle("-fx-border-color:red; -fx-border-width:2;");
    }

    private void clearAllStyles() {
        txtStudentName.setStyle(null);
        txtLRN.setStyle(null);
        txtEmail.setStyle(null);
        txtContactNumber.setStyle(null);
        cbLastYearLevel.setStyle(null);
        cbStudentStatus.setStyle(null);
        dpBirthDate.setStyle(null);
    }

    private void resetForm() {
        txtStudentName.clear();
        txtLRN.clear();
        txtEmail.clear();
        txtContactNumber.clear();
        txtOtherPurpose.clear();

        cbLastYearLevel.setValue(null);
        cbStudentStatus.setValue(null);
        dpBirthDate.setValue(null);

        chkCollege.setSelected(false);
        chkEmployment.setSelected(false);
        chkTransfer.setSelected(false);
        chkScholarship.setSelected(false);
        chkPersonalCopy.setSelected(false);

        selectedIDFile = null;
    }

    private void showError(String msg) {
        new Alert(Alert.AlertType.ERROR, msg).showAndWait();
    }

    private void showSuccess(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }

    private void showInfo(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
    
    @FXML
    private void handleHome(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(
            getClass().getResource("/com/mycompany/mavenproject1/menu.fxml")
            );
            
            Stage stage = (Stage)((Node) event.getSource())
                    .getScene().getWindow();
            
            stage.setScene(new Scene(root));
        }catch (Exception e){
            e.printStackTrace();
        }
    
        }
    }
            
