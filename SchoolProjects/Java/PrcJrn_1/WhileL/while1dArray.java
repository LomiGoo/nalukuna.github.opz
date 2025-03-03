import java.util.Scanner;

public class while1dArray {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int num[] = {0, 1, 5, 10};
          int i = 0;
          
          System.out.print("Enter number to search : ");
          int res = s.nextInt();
          
          while(i < num.length) {
               if(res == num[i]) {
                    System.out.println("Number found at index : " + i);
               }
               i++;
          }
     }
}