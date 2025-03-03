public class gridPrinter2dArray {
     
     public static void main(String[] args) {
          int nums[][] = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
          };
          int row = 1;
          
          for(int num[] : nums) {
               System.out.print("Row " + row + " : ");
               
               for(int cols : num) {
                    System.out.print(cols + " ");
               }
               System.out.println();
               row++;
          }
     }
}