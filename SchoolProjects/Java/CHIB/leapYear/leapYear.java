import java.util.Scanner;

public class leapYear {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int year;
          
          System.out.println("LEAP YEAR CHECKER");
          System.out.print("enter year : ");
          year = s.nextInt();
          
          System.out.println("");
          
          if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
               System.out.println(year + " is a LEAP YEAR!");
          } else {
               System.out.println(year + " is NOT a LEAP YEAR!");
          }
     }
}