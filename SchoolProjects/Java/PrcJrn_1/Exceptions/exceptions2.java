import java.util.Scanner;
import java.util.InputMismatchException;

public class exceptions2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numInput = 0;
        boolean run = true;
        
        do {
            try {
            System.out.print("Input num : ");
            numInput = s.nextInt();
            break;
            } catch(InputMismatchException e) {
                System.out.println("WRONG DATATYPE, TRY AGAIN.\n");
                s.nextLine();
            }
        } while(run == true);
        numInput *= numInput;
        System.out.println("squared : " + numInput);
    }
}