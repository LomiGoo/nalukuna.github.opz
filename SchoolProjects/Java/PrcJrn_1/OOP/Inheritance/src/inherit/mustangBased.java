package inherit;

public class mustangBased extends Car {
     public static void pln(String t) {
          System.out.println(t);
     }
     
     public static void p(String t) {
          System.out.println(t);
     }
     
     String sound;
     mustangBased(String name, String color, String sound) {
          super(name, color);
          this.sound = sound;
     }
     
     int rpm = 6000;
	int weight = 2939;
	
	int rpm() {
	     return rpm;
	}
	
	int weight() {
	     return weight;
	}
	
	void displayComInf() {
	     isBoostAl = false;
	     super.displayComInf();
	     pln("RPM : " + String.format("%,d", rpm()) + "rpm");
          pln("weight : " + String.format("%,d", weight()) + "kg");
          pln("sound : " + sound);
	}
	void displayComInf2() {
	     super.displayComInf();
     }
}