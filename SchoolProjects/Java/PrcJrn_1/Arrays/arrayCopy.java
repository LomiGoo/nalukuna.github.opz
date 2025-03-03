import java.util.Arrays;

public class arrayCopy {
     
     public static void main(String[] args) {
         int num[] = {30, 10, 90, 70};
         int copyNum[] = Arrays.copyOf(num, num.length);
         
         System.out.println(copyNum[1]);
     }
}