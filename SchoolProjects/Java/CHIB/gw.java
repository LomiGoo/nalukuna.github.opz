import java.util.Scanner;
import java.util.Arrays;

public class gw {

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int num[] = new int[20];
     int res;
     int count = 0;
     int i;
     boolean run = true;
     
     System.out.println("○ WELCOME TO EVEN NUMBERS CHECKER ○\n");
     System.out.println("HERE ARE THE MENU KEYS FOR THE PROGRAM :");
     System.out.println("》to exit program, enter 0");
     System.out.println("》compile for result, enter -1\n");
     do {
          System.out.print("$ enter random numbers to check for even : ");
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
     
     count -= 1;
     int inputNums[] = Arrays.copyOfRange(num, 0, count);
     System.out.print("\nlist of num to be check for even : \n" + Arrays.toString(inputNums) + "\n");
     
     int evenNums[] = new int[20];
     int index = 0;
          for(int numbir : inputNums) {
               if(numbir % 2 == 0) {
                    evenNums[index] = numbir;
                    index++;
               }
          }
          int finalEvenNums[] = Arrays.copyOfRange(evenNums, 0, index);
          System.out.println("\nlist of even nums : \n" + Arrays.toString(finalEvenNums));
     }
}
