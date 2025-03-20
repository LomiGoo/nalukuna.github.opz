import java.util.Scanner;
import java.util.Arrays;

public class wazzaa {

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int num[] = new int[50];
     int count = 0;
     int res;
     boolean run = true;
     int choice;
     System.out.println("WELCOME TO NUMBER ARRAY SWAPPER!");
     System.out.println("HERE ARE THE MENU KEYS FOR THE PROGRAM (1 - 2) :");
     System.out.println("1. number array swapper");
     System.out.println("2. String array swapper");
     System.out.println("3. Exit");
     
     do {
     System.out.print("\nenter your choice (1 - 3) : ");
     choice = s.nextInt();
     
     switch(choice) {
          case 1 :
               System.out.println("WELCOME TO NUMBER ARRAY SWAPPER!");
               System.out.println("HERE ARE THE MENU KEYS FOR THE PROGRAM (1 - 2) :");
               System.out.println("1. number array swapper");
               System.out.println("2. String array swapper");
               System.out.println("3. Exit");
               
     }
     } while(choice != 3);
     
          do {
               System.out.print("enter random numbers : ");
               res = s.nextInt();
               num[count] = res;
               count++;
               
               if (res == 0) {
                    System.out.println("Exiting... Done.");
                    run = false;
               }
               if(res == -1) break;
          } while (run == true);
          
          // if(run == false) break;
          
          count -= 1;
          int copyNum[] = Arrays.copyOfRange(num, 0, count);
          System.out.println("\n$ unsorted version : " + Arrays.toString(copyNum));
          Arrays.sort(copyNum);
          System.out.println("$ sorted version : " + Arrays.toString(copyNum));
     }
}