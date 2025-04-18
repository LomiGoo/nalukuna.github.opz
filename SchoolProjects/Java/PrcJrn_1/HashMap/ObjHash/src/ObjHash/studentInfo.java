package ObjHash;

public class studentInfo {
	private String fname, lname;
	private int year;
	private String section;
	
	studentInfo(String fname, String lname, int year, String section) {
	    this.fname = fname;
	    this.lname = lname;
	    this.year = year;
	    this.section = section;
	}
	
	public void displayInfo() {
	    System.out.println("NAME : " + fname + " " + lname);
	    System.out.println("YEAR : " + year + "th");
	    System.out.println("SECTION : " + section);
	}
}