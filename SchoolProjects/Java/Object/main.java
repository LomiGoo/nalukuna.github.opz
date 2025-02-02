public class main {
     
     public static void println(String text) {
          System.out.println(text);
     }
     
     public static void printlnum(int num) {
          System.out.println(num);
     }
     
     public static void print(String text) {
          System.out.print(text);
     }
     
     public static void ifEqual(int x, int y) {
          if(x == y) {
               println("yes");
          } else {
               println("no");
          }
     }
     
     public void ifNotEqual(int x, int y) {
          if(x != y) {
               println("yes");
          } else {
               println("no");
          }
     }
     
     private String name;
     
     public static String name(String name) {
          return name;
     }
     
     public static int plus(int x, int y) {
          return x + y;
     }
    public static void main(String[] args) {
        
     cup inside = new cup();
     phone phone = new phone();
     
     System.out.println(inside.coffee);
     
     System.out.println();
     
     System.out.println(phone.brand);
     phone.use();
     
     println("graa");
     print(" ge");
     
     ifEqual(1, 1);
     
     main main = new main();
     
     main.ifNotEqual(1, 1);
     
     println(name("chiv"));
     
     println("hey" + " nuh uh " + 4);
     
     printlnum(plus(1, 1));
     
     System.out.println(args[0]);
    }
}