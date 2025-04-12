package Abstract;

public class english extends teacher {
	void talk() {
	     System.out.println("i teach english");
	}
	
	english(String name, int age) {
	     super(name, age);
	     this.name = name;
	     this.age = age;
	}
	
	void info() {
	     System.out.println("name : " + name);
	     System.out.println("age : " + age);
	     talk();
	}
}