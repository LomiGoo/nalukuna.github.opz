import java.util.Scanner;

public class iLove {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          String name;
          int c = 1;
          System.out.print("Enter a name : ");
          name = s.nextLine();
          
          for(int i = 0; i < 10; i++) {
               System.out.println(c + ": i love " + name);
               c++;
          }
     }
}