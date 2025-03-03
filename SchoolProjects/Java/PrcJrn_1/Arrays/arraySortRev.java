import java.util.Arrays;

public class arraySortRev {
     
     public static void main(String[] args) {
          int num[] = {30, 68, 23, 19, 74, 98};
          
          Arrays.sort(num);
          System.out.println(Arrays.toString(num));
          int point = 0;
          int temp;
          for(int i = num.length - 1; i >= num.length / 2; i--) {
               temp = num[point];
               num[point] = num[i];
               num[i] = temp;
               point++;
          }
          System.out.println(Arrays.toString(num));
     }
}