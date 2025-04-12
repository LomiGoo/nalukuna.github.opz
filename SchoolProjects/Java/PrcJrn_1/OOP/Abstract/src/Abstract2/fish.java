package Abstract2;

public class fish implements Animal, anWater {
	public void sound() {
	     System.out.println("ISDA AKO");
	}
	
	public void swim() {
	     System.out.println("Animal : FISH");
	     sound();
	     System.out.println("LUMALANGOY\n");
	}
	
		void displayActions() {
	     swim();
	}
}