import java.util.Scanner;

public class forL {
     
     public static void main(String[] args) {
          
          for(int i = 0; i < 5; i = i + 2) {
               System.out.println(i);
          }
          
          System.out.println("");
          
          int i = 0;
          while(i < 5) {
               System.out.println(i);
               ++i;
          }
          
          System.out.println("");
          
          String subj[] = {"cp", "stats", "pr"};
          
          for(int x = 0; x < subj.length; x++) {
               System.out.println(subj[x]);
          }
          
          int num[] = {10, 20, 30, 40, 50};
          
          for(int y = 0; y < num.length; y++) {
               System.out.println(num[2] + num[3]);
               break;
          }
          
          System.out.println("");
          
          Scanner s = new Scanner(System.in);
          
          String names[] = new String[3];
          System.out.print("ENTER A NAME : ");
          names[0] = s.nextLine();
          
          System.out.print("ENTER SECOND NAME : ");
          names[1] = s.nextLine();
          
          for(int j = 0; j < names.length; j++) {
               System.out.println(names[j]);
          }
          
     }
}