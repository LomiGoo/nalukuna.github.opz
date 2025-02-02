import java.util.Scanner;

public class userInput {
     public static void main(String[] args) {
        
          Scanner s = new Scanner(System.in);
          
          String words;
          
          System.out.print("enter : ");
          words = s.nextLine();
          System.out.println("meron luds");
          
          int x;
          int y;
          
          System.out.print("enter 1st num : ");
          x = s.nextInt();
          System.out.print("enter 2nd num : ");
          y = s.nextInt();
          
          System.out.println("added numbers : " 
          + x + " + " + y + " = " + (x + y));
     }
}