package Polymorphism;

public class car extends vehicle {
     public static void pln(String t) {
          System.out.println(t);
     }
     public static void p(String t) {
          System.out.print(t);
     }
     
	void engineStart() {
	     super.engineStart();
	     pln("vroom! car.");
	}
}