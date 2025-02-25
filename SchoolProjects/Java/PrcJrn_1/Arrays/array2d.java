public class array2d {
     
     public static void main(String[] args) {
          String names[][] = {
               {"chib", "chab"},
               {"meks", "mikz"}
          };
          
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
     }
}