import java.util.Scanner;

public class dailyExpenseRec {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          double num[] = new double[20];
          int i = 0;
          double res;
          int j = 0;
          
          do {
          System.out.print("Enter an expense (-1 to stop) : ");
               res = s.nextDouble();
               num[i] = res;
               i++;
          } while(res >= 0);
          
          System.out.println("i : " + i);
          System.out.print("Expenses recorded : ");
          
          do {
               System.out.print(num[j] + ", ");
               j++;
          } while(j < (i - 2));
          System.out.print(num[j]);
          System.out.println();
     }
}
