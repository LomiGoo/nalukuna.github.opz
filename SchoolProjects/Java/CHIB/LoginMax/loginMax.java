import java.util.Scanner;

public class loginMax {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          String usrN, pass;
          int tries = 3;
          
          System.out.println("Login Authentication");
          System.out.println("");
          System.out.println("AVAILABLE TRIES : " + tries);
          
          System.out.print("ENTER USERNAME : ");
          usrN = s.nextLine();
          
          System.out.print("ENTER PASSWORD : ");
          pass = s.nextLine();
          
          System.out.println("");
          
          if(usrN.isEmpty() || pass.isEmpty()) {
               System.out.println("");
               tries = (tries - 1);
               System.out.println("AVAILABLE TRIES : " + (tries));
               System.out.print("FAILED, TRY AGAIN. ENTER USERNAME : "); 
               usrN = s.nextLine();
          
               System.out.print("FAILED, TRY AGAIN. ENTER PASSWORD : ");
               pass = s.nextLine();
          
               System.out.println("");
               
               if(usrN.isEmpty() || pass.isEmpty()) {
                    System.out.println("");
                    tries = (tries - 1);
                    System.out.println("AVAILABLE TRIES : " + (tries));
                    System.out.print("FAILED, TRY AGAIN. ENTER USERNAME : "); 
                    usrN = s.nextLine();
          
                    System.out.print("FAILED, TRY AGAIN. ENTER PASSWORD : ");
                    pass = s.nextLine();
          
                    System.out.println("");
                    
                    if(usrN.isEmpty() || pass.isEmpty()) {
                         System.out.println("");
                         tries = (tries - 1);
                         System.out.println("AVAILABLE TRIES : " + (tries));
                         System.out.print("FAILED, TRY AGAIN. ENTER USERNAME : "); 
                         usrN = s.nextLine();
          
                         System.out.print("FAILED, TRY AGAIN. ENTER PASSWORD : ");
                         pass = s.nextLine();
          
                         System.out.println("");
                              
                              if(usrN.isEmpty() || pass.isEmpty()) {
                                   System.out.println("");
                                   System.out.println("YOU HAVE REACHED LOGIN LIMIT : " + (tries));
                              } else {
                                   System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
                              }<
                    } else {
                         System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
                    }
               } else {
                    System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
               }
          } else {
               System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
          }
     }
}