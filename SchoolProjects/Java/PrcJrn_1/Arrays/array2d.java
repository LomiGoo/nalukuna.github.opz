import java.util.Arrays;

public class array2d {
     
     public static void main(String[] args) {
          String days[][] = new String[2][2];
          
          days[0][0] = "monday";
          days[1][0] = "tuesday";
          
          System.out.println(days[0][0]);
          System.out.println(days[1][0]);
          
          for(int x = 0; x < 5; x++) {
               for(int y = 0; y < 5; y++) {
                    System.out.println(y);
               }
               System.out.println();
          }
          
          String names[][] = {
               {"chib", "chab", "graa"},
               {"meks", "mikz"}
          };
          
          for(int rows = 0; rows < names.length; rows++) {
               if(rows == 0) {
                    for(int cols = names[rows].length - 1; cols < names[rows].length; cols += 1) {
                         System.out.println("rows : " + rows + " | " + "cols : " + cols);
                         System.out.println(names[rows][cols]);
                    }
               }
               if(rows == 1) {
                    for(int cols = names[rows].length - 2; cols < names[rows].length; cols += 2) {
                         System.out.println("rows : " + rows + " | " + "cols : " + cols);
                         System.out.println(names[rows][cols]);
                    }
               }
          }
          
     }
}