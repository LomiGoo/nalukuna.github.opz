public class while2dArray {
     
     public static void main(String[] args) {
          int num[][] = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
          };
          int search = 9;
          int rows = 0, cols = 0;
          
          System.out.println("Searching for value " + search + "...");
          
          while(rows < num.length) {
               while(cols < num[rows].length) {
                    if(search == num[rows][cols]) {
                         System.out.println("Value " + search + " found at position " + "(" + rows + ", " + cols + ")");
                         break;
                    }
                    cols++;
               }
               cols = 0;
               rows++;
          }
     }
}