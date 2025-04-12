package Abstract;

abstract public class teacher {
     String name;
     int age;
     
	abstract void talk();
	abstract void info();
	
	teacher(String name, int age) {
	     this.name = name;
	     this.age = age;
	}
}