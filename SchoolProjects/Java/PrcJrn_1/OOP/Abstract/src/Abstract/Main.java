package Abstract;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

     System.out.print("Name : ");
     String name = s.nextLine();
     
     System.out.print("Age : ");
     int age = s.nextInt();
     
     teacher e = new english(name, age);
     e.info();
     }
}