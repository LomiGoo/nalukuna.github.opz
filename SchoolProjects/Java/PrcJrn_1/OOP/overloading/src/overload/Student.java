package overload;

public class Student {
										String fname, lname;
										int age;
										String section;
										String language;
										
										Student(String fname, String language) {
																				this.fname = fname;
																				this.language = language;
										}
										
										Student(String fname, 
																														String lname, 
																														int age, 
																														String section,
																														String progLang) {
																																								this.fname = fname;
																																								this.lname = lname;
																																								this.age = age;
																																								this.section = section;
																																								this.language = language;
																														}
}