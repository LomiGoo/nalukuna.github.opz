package Abstract2;

public class dog implements Animal, anLand, anWater {
	public void sound() {
	     System.out.println("ASO AKO");
	}

	public void walk() {
	     System.out.println("Animal : DOG");
	     sound();
	     System.out.println("NAGLALAKAD");
	}
	
	public void swim() {
	     System.out.println("LUMALANGOY\n");
	}
	
	void displayActions() {
	     walk();
	     swim();
	}
}