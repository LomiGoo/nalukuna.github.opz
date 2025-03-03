public class BusRouteLoc {
     
     public static void main(String[] args) {
          int bus[][] = {
               {10, 15, 20},
               {25, 30, 35},
               {40, 45, 50}
          };
          int search = 10;
          int rows = 0, cols = 0;
          boolean found = false;
          
          System.out.println("Searching for bus stop " + search + "...");
          
          while(rows < bus.length) {
               
               while(cols < bus[rows].length) {
                    if(search == bus[rows][cols]) {
                         found = true;
                         break;
                    }
                    cols++;
               }
               
               if(found == true) {
                    break;
               }
               rows++;
               cols = 0;
          }
          String result = (found == true) ? "Bus Stop " + search + " found on Route " + (rows + 1) + ", Position " + (cols + 1) : "No Bus Stop Found.";
          System.out.println(result);
     }
}