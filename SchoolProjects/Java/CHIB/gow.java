import java.util.Scanner;
import java.util.Arrays;

public class gow {

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int num[] = new int[50];
     int count = 0;
     int res;
     boolean run = true;
     
     System.out.println("WELCOME TO NUMBER ARRAY SORTER!");
     System.out.println("HERE ARE THE MENU KEYS FOR THE PROGRAM :");
     System.out.println("$ to exit program, enter 0");
     System.out.println("$ compile for result, enter -1\n");
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