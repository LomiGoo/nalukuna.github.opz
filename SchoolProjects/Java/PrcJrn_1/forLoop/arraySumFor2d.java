public class arraySumFor2d {
     
     public static void main(String[] args) {
          int num[][] = {
               {1, 2},
               {3, 4}
          };
          int sum = 0;
          
          for(int rows = 0; rows < num.length; rows++) {
               for(int cols = 0; cols < num[rows].length; cols++) {
                    System.out.println("Element at " + "(" + rows + ", " + cols + ") : " + num[rows][cols]);
                    sum += num[rows][cols];
               }
          }
          System.out.println("Total sum : " + sum);
     }
}