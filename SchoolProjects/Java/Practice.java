public class Practice {
     
     int x = 8;
     
     void talk() {
          System.out.println("hi");
     }
     
     int num() {
          x = 1 + 1;
          return x;
     }
     
     public static void main (String[] args) {
          
          Practice prac = new Practice();
          
          Practice prec = new Practice();
          prec.x = 10;
          
          System.out.println(prac.x);
          
          System.out.println(prec.x);
          System.out.println("");
          
          prac.talk();
          prac.num();
     }
}