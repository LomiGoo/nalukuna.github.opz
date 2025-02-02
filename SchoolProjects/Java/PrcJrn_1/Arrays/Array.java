import java.util.Scanner;

public class Array {
     
     public static void println(String text) {
          System.out.println(text);
     }
     
     public static void print(String text) {
          System.out.print(text);
     }
     
     public static void main(String[] args) {
     
     // ASSIGNED VALUES  
     String fruits[] = {"Apple", "Orange", "Mango", "Grapes"};
     
     // CHANGE VALUE INSIDE ARRAY
     fruits[3] = "avocado";
     
     // MAKE ARRAY LIMIT
     String colors[] = new String[5];

     // MANUALLY ASIGN VALUES FOR THE CREATED LIMIT
     colors[0] = "red";
     colors[1] = "orange";
     colors[2] = "yellow";
     colors[3] = "purple";
     colors[4] = "green";
     
     System.out.println("fruit : " + fruits[3] + " | " + colors[3]);
     
     Scanner sc = new Scanner(System.in);
     
     String games[] = new String[5];
     
     println("");
     println("Enter your top games : ");
     
     print("1. ");
     games[0] = sc.nextLine();
     
     print("2. ");
     games[1] = sc.nextLine();

     print("3. ");
     games[2] = sc.nextLine();
     
     print("4. ");
     games[3] = sc.nextLine();
     
     print("5. ");
     games[4] = sc.nextLine();
     
     println("");
     println("your most Favorite game was : " + games[0] + ", the less wanted game of yours was : " + games[4]);
     }
}