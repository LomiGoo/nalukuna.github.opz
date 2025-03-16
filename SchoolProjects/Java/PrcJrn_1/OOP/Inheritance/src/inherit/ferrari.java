package inherit;

public class ferrari extends Car {
     public static void pln(String t) {
          System.out.println(t);
     }
     
     public static void p(String t) {
          System.out.println(t);
     }
     
     String sound;
     ferrari(String name, String color, String sound) {
          super(name, color);
          this.sound = sound;
     }
     
	int rpm = 8500;
	int weight = 1155;
	
	int rpm() {
	     return rpm;
	}
	
	int weight() {
	     return weight;
	}
	
	void displayComInf() {
	     super.displayComInf();
	     pln("RPM : " + String.format("%,d", rpm()) + "rpm");
          pln("weight : " + String.format("%,d", weight()) + "kg");
          pln("sound : " + sound);
	}
}