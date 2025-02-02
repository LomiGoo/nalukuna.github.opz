import java.util.Scanner;

public class arrayInfo {
     
     public static void println(String text) {
          System.out.println(text);
     }
     
     public static void print(String text) {
          System.out.print(text);
     }
     
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          String email[] = new String[5];
          String userName[] = new String[5];
          String password[] = new String[5];
          
          println("enter your informations : ");
          print("");
          
          print("email : ");
          email[0] = sc.nextLine();
          print("username : ");
          userName[0] = sc.nextLine();
          print("password : ");
          password[0] = sc.nextLine();
          
          println("");
          
          email[1] = "nalukuna@gmail.com";
          userName[1] = "naluku";
          password[1] = "oopz";
          
          
          
          println("what info you wanna see? index 0 or 1?");
          print("your choice : ");
          int x = sc.nextInt();
          
          println("");
          
          if(x == 0) {
               int i = 0;
               
               println("this your whole info : ");
               println("username - " + userName[i]);
               println("email - " + email[i]);
               println("password - " + password[i]);
          } else {
               int i = 1;
               
               println("this your whole info : ");
               println("username - " + userName[i]);
               println("email - " + email[i]);
               println("password - " + password[i]);
          }
     }
}