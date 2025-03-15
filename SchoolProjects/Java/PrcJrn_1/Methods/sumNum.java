public class sumNum {
     static int sum = 0;

     static int summation(int nums[]) {
          for(int num : nums) {
               sum += num;
          }
          return sum;
     }
     public static void main(String[] args) {
          int numba[] = {5, 10, 15, 20};

          System.out.println(summation(numba));
     }
}