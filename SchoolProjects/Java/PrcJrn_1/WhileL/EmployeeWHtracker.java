public class EmployeeWHtracker {
     
     public static void main(String[] args) {
          int track[][] = {
               {8, 8, 8, 8, 8},
               {9, 8, 7, 8, 9}
          };
          String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
          int rows = 0, cols = 0;
          int empCount = 1;
          do {
               System.out.println("Employee " + empCount + " : ");
               do {
                    System.out.println(days[cols] + " : " + track[rows][cols] + " hours");
                    cols++;
               } while(cols < track[rows].length);
               
               System.out.println();
               cols = 0;
               empCount++;
               rows++;
          } while(rows < track.length);
     }
}