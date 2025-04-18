import java.util.Scanner;
import java.util.InputMismatchException;

public class convert {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("enter name : ");
        String name = s.nextLine();
        int age = inputMismatchE.intMismatchE();
        System.out.print("enter section : ");
        String section = s.nextLine();
        
        String age2 = String.valueOf(age);
        
        System.out.println(age + 100);
        System.out.println(age2 + 100);
    }
}

class inputMismatchE {
    static Scanner s = new Scanner(System.in);
    static int num;

    static int intMismatchE() {
        do {
            try {
                System.out.print("enter age : ");
                num = Integer.parseInt(s.nextLine());
                break;
            } catch(NumberFormatException e) {
                System.out.println("numbers only!\n");
            }
        } while(true);
        return num;
    }
}

/* 
IN ORDER TO PARSE THINGS, VALUE MUST BE STRING FIRST
TO CONVERT IT TO A SPECIFIC DATA TYPE.
*/