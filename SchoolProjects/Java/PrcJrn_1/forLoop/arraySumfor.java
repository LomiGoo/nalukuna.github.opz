public class arraySumfor {
     
     public static void main(String[] args) {
          int nums[] = {10, 20, 30, 40, 50};
          int ans = 0;
          
          for(int num : nums) {
               ans = ans + num;
          }
          System.out.println(ans);
     }
}