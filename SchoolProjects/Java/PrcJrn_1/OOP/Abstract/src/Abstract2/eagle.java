package Abstract2;

public class eagle implements Animal, anAir {
	public void sound() {
	     System.out.println("EGULS AKO");
	}
	
	public void walk() {
	     System.out.println("Animal : EAGLE");
	     sound();
	     System.out.println("NAGLALAKAD");
	}
	
	public void fly() {
	     System.out.println("LUMILIPAD\n");
	}
	
		void displayActions() {
	     walk();
	     fly();
	}
}