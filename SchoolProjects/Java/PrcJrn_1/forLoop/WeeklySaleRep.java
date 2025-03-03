public class WeeklySaleRep {
     
     public static void main(String[] args) {
          int sales[][] = {
               {150, 200, 175},
               {130, 220, 160}
          };
          int days = 1;
          int categ = 1;
          int weeklySales = 0;
          
          for(int rows = 0; rows < sales.length; rows++) {
               System.out.println("Day " + days + " - ");
               
               for(int cols = 0; cols < sales[rows].length; cols++) {
                    System.out.println("Category " + categ + " : " + "$" + sales[rows][cols]);
                    categ++;
                    weeklySales += sales[rows][cols];
               }
               days++;
               categ = 1;
          }
          System.out.println(".........");
          System.out.println("Total Weekly Sales : " + "$" + (String.format("%, d", weeklySales)));
     }
}