public class doWhile2dArray {
     
     public static void main(String[] args) {
          int num[][] = {
               {10, 20, 30},
               {40, 50, 60}
          };
          int rowCount = 1;
          int rows = 0, cols = 0;
          
          do {
               System.out.print("Processing Row " + rowCount + " : ");
               do {
                   System.out.print(num[rows][cols] + " "); 
                   cols++;
               } while(cols < num[rows].length);
               
               System.out.println("");
               cols = 0;
               rowCount++;
               rows++;
          } while(rows < num.length);
     }
}