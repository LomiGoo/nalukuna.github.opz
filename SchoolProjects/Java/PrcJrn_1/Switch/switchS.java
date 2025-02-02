public class switchS {
     
     public static void println(String text) {
          System.out.println(text);
     }
     
     public static void print(String text) {
          System.out.print(text);
     }
     
     public static void printlnum(int num) {
          System.out.println(num);
     }
     
     public static void printnum(int num) {
          System.out.print(num);
     }
     
     public static void main(String[] args) {
          int anime = 1;
          
          switch(anime) {
               
               case 1 :
                    println("Tensura");
                    break;
               case 2 :
                    println("aot");
                    break;
               case 3 :
                    println("SpyxFamily");
                    break;
               default :
                    println("none");
          }
          
          
     }
}
