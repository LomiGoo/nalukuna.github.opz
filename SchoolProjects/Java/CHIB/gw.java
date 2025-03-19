import java.util.Scanner;
import java.util.Arrays;

public class gw {

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int num[] = new int[20];
     int res;
     int count = 0;
     int i;
     int index = 0;
     boolean run = true;
     
     System.out.println("○ WELCOME TO EVEN NUMBERS CHECKER ○\n");
     System.out.println("HERE ARE THE MENU KEYS FOR THE PROGRAM :");
     System.out.println("》to exit program, enter 0");
     System.out.println("》compile for result, enter -1\n");
     do {
          System.out.print("enter random numbers to check for even : ");
          res = s.nextInt();
          num[count] = res;
          count++;
          
          if (res == 0) {
               System.out.println("Exiting... Done.");
               run = false;
          }
          if(res == -1) break;
     } while (run == true);
     
     //if(run == false) break;
     
     System.out.print("\nlist of num that you entered to be check for even : [");
     while(run == true) {
          System.out.print(num[index]);
          index++;
          if(num[index] == 0) run = false;
          else System.out.print(", ");
     } 
     System.out.print("]\n");
     
     boolean odd;
     System.out.println(index);
     System.out.print("\neven numbers compiled : [");
          for(i = 0; i < index - 1; i++) {
               odd = false;
               if(num[i] % 2 == 0) {
                    if(odd == true) {
                         System.out.print(", ");
                    }
                    System.out.print(num[i]);
                    odd = true;
               }
          }
          System.out.print(num[i] + "]");
     }
}
/*
6
0 - 
1 - 2
2 - 
3 - 4
4 - 
5 - 
*/