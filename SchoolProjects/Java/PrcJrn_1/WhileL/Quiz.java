import java.util.Scanner;
public class Quiz {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          
          System.out.println("");
          System.out.println("Do you want to start Quiz?");
          System.out.println("choose a number to respond : ");
          System.out.println("1. YES");
          System.out.println("2. NO");
          System.out.println("");
          System.out.print("response : ");
          int resp = s.nextInt();
          
          while(resp <= 0 || resp > 2) {
               if(resp <= 0 || resp > 2)
               System.out.print("your response : ");
               resp = s.nextInt();
          }
          
          if(resp == 1) {
               
          } else {
               System.out.println("Goodbye!");
          }
          
     }
}