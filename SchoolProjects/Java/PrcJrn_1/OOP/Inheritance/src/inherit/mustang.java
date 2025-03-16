package inherit;

public class mustang extends mustangBased {
     public static void pln(String t) {
          System.out.println(t);
     }
     
     public static void p(String t) {
          System.out.println(t);
     }
     
     String sound;
     mustang(String name, String color, String sound) {
          super(name, color, sound);
          this.sound = sound;
     }
     
     int rpm = 7250;
	int weight = 3827;
	
	int rpm() {
	     return rpm;
	}
	
	int weight() {
	     return weight;
	}
	
	void displayComInf2() {
	     super.displayComInf2();
	     pln("RPM : " + String.format("%,d", rpm()) + "rpm");
          pln("weight : " + String.format("%,d", weight()) + "kg");
          pln("sound : " + sound);
	}
}