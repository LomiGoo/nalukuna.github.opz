import java.util.Scanner;

public class GrCompute {
     
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
          Scanner sc = new Scanner(System.in);
          
          String subject[] = {"CompProg", "Practical Research", "Hope", "Statistics"};
          double grades[] = new double[4];
          
          println("ENTER YOUR GRADES HERE : ");
          print(subject[0] + " - ");
          grades[0] = sc.nextDouble();
          
          print(subject[1] + " - ");
          grades[1] = sc.nextDouble();
          
          print(subject[2] + " - ");
          grades[2] = sc.nextDouble();
          
          print(subject[3] + " - ");
          grades[3] = sc.nextDouble();
          
          
          double genAve = (grades[0] + grades[1] + grades[2] + grades[3]) / 4f;
          
          println("");
          
          println(subject[0] + " :           " + grades[0]);
          println(subject[1] + " : " + grades[1]);
          println(subject[2] + " :               " + grades[2]);
          println(subject[3] + " :         " + grades[3]);
          println("");
          println("General Average :    " + genAve);
          println("");
          
          if(genAve > 100) {
               println("invalid grade!");
          } else if(genAve >= 98) {
               println("WITH HIGHEST HONOR");
          } else if(genAve >= 95) {
               println("WITH HIGH HONOR");
          } else if(genAve >= 90) {
               println("WITH HONOR");
          } else if(genAve >= 75) {
               println("PASSED");
          } else {
               println("FAILED");
          }
     }
}