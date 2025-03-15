package overload;

public class Main {
										
										public static void main(String[] args) {
																				Student stu1 = new Student("Chiv",
																														   																	"Batak", 17, "fortran", "Java");
																				
																				Student stu2 = new Student("Chiv", "Javascript");
																				
																				System.out.println(stu1.fname + ", " + stu1.lname);
																				System.out.println(stu2.fname + ", " + stu2.language);
																				
										}
}