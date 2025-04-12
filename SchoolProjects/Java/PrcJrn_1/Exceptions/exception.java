import java.util.Scanner;
import java.util.InputMismatchException;
public class exception {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    
    // BROAD EXCEPTION
        try {
            System.out.print("enter num :");
            num = s.nextInt();
        } catch(Exception e) {
            System.out.println("naga iror");
        } finally {
            s.nextLine();
        }
    
    int numz[] = {1, 2};
    int ans;
        try {
            System.out.print("pili index : ");
            ans = s.nextInt();
            System.out.println(numz[ans]);
        } catch(InputMismatchException e) {
            System.out.println("WRONG DATA TYPE");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("LAGPAS SA INDEX");
        } 
    }
}