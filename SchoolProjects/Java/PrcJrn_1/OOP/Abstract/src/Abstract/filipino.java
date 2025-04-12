package Abstract;

public class filipino extends teacher {
	void talk() {
	     System.out.println("i teach filipino");
	}
	
	filipino(String name, int age) {
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