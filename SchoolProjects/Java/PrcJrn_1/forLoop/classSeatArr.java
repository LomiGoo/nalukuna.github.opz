public class classSeatArr {
     
     public static void main(String[] args) {
          String seats[][] = {
               {"A", "B", "C", "D"},
               {"A", "B", "C", "D"},
               {"A", "B", "C", "D"}
          };
          int seatNum = 1;
          int row = 1;
          
          for(String seat[] : seats) {
               System.out.print("Row " + row + " : ");
               for(String location : seat) {
                    System.out.print(location + seatNum + " ");
               }
               System.out.println();
               seatNum++;
               row++;
          }
     }
}