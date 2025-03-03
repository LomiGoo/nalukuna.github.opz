import java.util.Scanner;

public class doWhile1dArray {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int num[] = new int[20];
          int i = 0;
          int res;
          int j = 0;
          
          do {
               System.out.print("Enter a number (-1 to stop) : ");
               res = s.nextInt();
               num[i] = res;
               i++;
          } while(res >= 0);
          System.out.println("i : " + i);
          System.out.print("Numbers entered : ");
          do {
               System.out.print(num[j] + ", ");
               j++;
          } while(j < (i - 2));
          System.out.print(num[j]);
          System.out.println();
     }
}