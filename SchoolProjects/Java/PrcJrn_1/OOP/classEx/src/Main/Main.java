package Main;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          phone p1 = new phone();
          phone p2 = new phone();
          
          p1.phone = "Samsung Note 9";
          p1.ram = 6;
          p1.mAh = 4000;
          
          System.out.println("Phone : " + p1.phone);
          System.out.println("RAM : " + p1.ram + "GB");
          System.out.println("Battery : " + p1.mAh + "mAh");
          System.out.println();
          
          System.out.print("enter phone name : ");
          p2.phone = s.nextLine();
          System.out.print("enter phone RAM : ");
          p2.ram = s.nextInt();
          System.out.print("enter battery : ");
          p2.mAh = s.nextInt();
          System.out.println();
          
          System.out.println("Phone : " + p2.phone);
          System.out.println("RAM : " + p2.ram + "GB");
          System.out.println("Battery : " + p2.mAh + "mAh");
     }
}