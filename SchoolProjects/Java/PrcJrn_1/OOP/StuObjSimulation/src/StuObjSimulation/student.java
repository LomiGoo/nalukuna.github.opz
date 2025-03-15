package StuObjSimulation;

public class student {
										public String fname, lname, strand, section, eval;
										public int year;
										public double aveGr;
										
										public student(String fname, String lname,
																														String strand, String section,
																														int year, double aveGr) {
																																								this.fname = fname;
																																								this.lname = lname;
																																								this.strand = strand; 
																																								this.section = section;
																																								this.year = year;
																																								this.aveGr = aveGr;
																														}
										
										public void introSelf() {
																				System.out.println("First Name : " + fname);
																				System.out.println("Last Name  : " + lname);
																				System.out.println("Strand     : " + strand);
																				System.out.println("Section    : " + section);
																				System.out.println("Year       : " + year + "th");
																				
																				String ave = String.format("%.2f", aveGr);
																				System.out.println("Average Grade : " + ave);
																				
																		 eval = subjects.evalGr();
																				System.out.println("My Evaluation : " + eval);
										}
										
}