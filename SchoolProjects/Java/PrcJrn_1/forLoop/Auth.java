import java.util.Scanner; 

public class Auth {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          
          String usrN[] = {"ada wong", "tifa", "mai"};
          String pass[] = {"resi4", "finalfan", "kof"};
          
          System.out.println("Authentication - FINDING ACCOUNT");
          System.out.print("Enter Username : ");
          String ans = s.nextLine();
          
          System.out.print("Enter Password : ");
          String ans2 = s.nextLine();
          
          System.out.println("");
          
          boolean accEx = false;
          for(int i = 0; i < usrN.length && i < pass.length; i++) {
               if(ans.equalsIgnoreCase(usrN[i]) && ans2.equalsIgnoreCase(pass[i])) {
                    accEx = true;
                    break;
               }
          }
          if(accEx == true) {
               System.out.println("WELCOME USER " + ans + "!");
          } else {
               System.out.println("ACCOUNT NOT FOUND!");
          }
     }
}

