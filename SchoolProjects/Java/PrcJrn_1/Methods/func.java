public class func {
// GLOBAL VARIABLES (STATIC)
     static String name = "chab";
     static int age = 17;
     static void println(String input) {
          System.out.println(input);
     }
     
     static int num1, num2, ans;
     static void add(int num1, int num2) {
          ans = num1 + num2;
          System.out.println(ans);
     }
     
     public static void main(String[] args) {
          println("My name is " + name + ", im " + age + " years old.");
          add(10, 10);
          // LOCAL VARIABLE
          boolean isAgeAbove = true;
          System.out.println(isAgeAbove);
     }
}