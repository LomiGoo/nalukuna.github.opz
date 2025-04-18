package StudentRegistration;
import java.util.Scanner;

public class Main {
    static String fname, lname;
    static int age;
    static int year;
    static String section;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long studentID;
        int counter = 0;
	    
        do {
        System.out.println("WECOME TO STUDENT REGISTRATION\n");
        System.out.print("How many register you want? : ");
        int quantityReg = exceptionHandler.invalidIntegerQuanInput();
        System.out.println();
        
            while(counter != quantityReg) {
                System.out.print("Enter First Name : ");
                fname = exceptionHandler.invalidStringInput();
                System.out.println();
                
                System.out.print("Enter Last Name : ");
                lname = exceptionHandler.invalidStringInput();
                System.out.println();
                
                System.out.print("Enter Age : ");
                age = exceptionHandler.invalidIntegerAgeInput();
                System.out.println();
                
                System.out.print("Enter Year : ");
                year = exceptionHandler.invalidIntegerYearInput();
                System.out.println();
                
                System.out.print("Enter Section : ");
                section = exceptionHandler.invalidStringInput();
                System.out.println();
                
                HashMapInfo.storeInfo();
                counter++;
            }
            if(counter == quantityReg) break;
        } while(true);
        
        do {
        System.out.print("enter student ID to display info : ");
        studentID = exceptionHandler.invalidLongIDInput();
        
            if(HashMapInfo.student.containsKey(studentID)) break;
            else System.out.println("Non-existent, Try Again.\n");
        } while(true);
        
        System.out.println();
        HashMapInfo.student.get(studentID).displayInfo();
        
        System.out.print("want to display all info? [1 for yes, 2 for no] : ");
        int ans = exceptionHandler.invalidIntegerAnsInput();
        
        switch(ans) {
            case 1 :
                System.out.println();
                for(long st : HashMapInfo.student.keySet()) {
                    System.out.println("#" + st);
                    HashMapInfo.student.get(st).displayInfo();
                }
            break;
            case 2 :
                System.out.println("Exiting... Done.");
            break;
        }
    }
}