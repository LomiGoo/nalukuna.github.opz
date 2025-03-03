import java.util.Collections;
import java.util.Arrays;

public class arrayMaxMin {
     
     public static void main(String[] args) {
         Integer num[] = {30, 10, 90, 70};
         int max = Collections.max(Arrays.asList(num));
         int min = Collections.min(Arrays.asList(num));
         
         System.out.println("max : " + max);
         System.out.println("min : " + min);
         
     }
}