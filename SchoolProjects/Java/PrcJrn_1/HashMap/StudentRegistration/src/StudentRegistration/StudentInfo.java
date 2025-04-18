package StudentRegistration;

public class StudentInfo {
	private String fname, lname;
	private int age;
	private int year;
	private String section;
	
	StudentInfo(String fname, String lname, int age, int year, String section) {
	    this.fname = fname;
	    this.lname = lname;
	    this.age = age;
	    this.year = year;
	    this.section = section;
	}
	
	public void displayInfo() {
	    System.out.println("NAME : " + fname + " " + lname);
	    System.out.println("AGE : " + age);
	    System.out.println("YEAR : " + year + "th");
	    System.out.println("SECTION : " + section);
	    System.out.println();
	}
}