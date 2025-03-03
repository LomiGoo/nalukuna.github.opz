public class square {
     
     public static void main(String[] args) {
          int size = 10;
          
          for(int rows = 1; rows <= size; rows++) {
               for(int cols1 = 1; cols1 <= size; cols1++) {
                    System.out.print(" ");
               }
               System.out.println(" *");
          }
     }
}