import java.util.Scanner;

public class Traffic_System {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          String red, yellow, green;

          System.out.print("ENTER TRAFFIC LIGHT COLOR (RED, YELLOW, GREEN): ");
          String ans = s.nextLine();

          switch(ans.toLowerCase()) {
               case "red" -> System.out.println("STOP!");
               case "yellow" -> System.out.println("SLOW DOWN!");
               case "green" -> System.out.println("GO!");
               default -> System.out.println("DID NOT CHOOSE A COLOR LIGHT!");
          }
     }
}