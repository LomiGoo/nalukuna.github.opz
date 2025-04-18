import java.util.Scanner;
import javax.swing.JOptionPane;

public class GrCompute {
     
    public static void println(String text) {
        System.out.println(text);
    }
     
    public static void print(String text) {
        System.out.print(text);
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        String subject[] = {"CompProg", "Practical Research", "Hope", "Statistics"};
        double grades[] = new double[4];
          
        JOptionPane.showMessageDialog(null, "WELCOME TO GRADE COMPUTE!");
        grades[0] = Double.parseDouble(JOptionPane.showInputDialog(subject[0]));
        grades[1] = Double.parseDouble(JOptionPane.showInputDialog(subject[1]));
        grades[2] = Double.parseDouble(JOptionPane.showInputDialog(subject[2]));
        grades[3] = Double.parseDouble(JOptionPane.showInputDialog(subject[3]));
          
        double genAve = (grades[0] + grades[1] + grades[2] + grades[3]) / 4f;
        
        if(genAve > 100) {
            message = "invalid grade!";
          } else if(genAve >= 98) {
            message = "WITH HIGHEST HONOR";
          } else if(genAve >= 95) {
            message = "WITH HIGH HONOR";
          } else if(genAve >= 90) {
            message = "WITH HONOR";
          } else if(genAve >= 75) {
            message = "PASSED";
          } else {
            message = "FAILED";
        } 
          
        JOptionPane.showMessageDialog(
            null, subject[0] + "   : " + grades[0] + "\n" +
            subject[1] + " : " + grades[1] + "\n" +
            subject[2] + " : " + grades[2] + "\n" +
            subject[3] + " : " + grades[3] + "\n" +
            "General Average : " + genAve + "\n\n" +
            message
        );
    }
}