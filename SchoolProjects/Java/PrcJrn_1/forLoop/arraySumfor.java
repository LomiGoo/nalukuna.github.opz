public class arraySumfor {
     
     public static void main(String[] args) {
     int num[] = {5, 10, 15};
     int index = 0;
     int sum = 0;
     
          for(int i = 0; i < num.length; i++) {
               System.out.println("Element at index " + index + " : " + num[i]);
               index++;
               sum = sum + num[i];
          }
          System.out.println("Total sum : " + sum);
     }
}