package Student_Register_Simulation;

public class student {
     private String fname, lname;
     private int year;
     private String strand, section;
     static int stuNum = 1;
     
     student() {
          
     }
     
     student(String fname, String lname, int year, String strand, String section) {
          this.fname = fname;
          this.lname = lname;
          this.year = year;
          this.strand = strand;
          this.section = section;
     }
     
     void displayCred() {
          System.out.println("\n$==========================$");
          System.out.println("STUDENT #" + stuNum);
          System.out.println("First Name : " + fname);
          System.out.println("Last Name : " + lname);
          System.out.println("Year : " + year + "th");
          System.out.println("Strand : " + strand);
          System.out.println("Section : " + section);
          System.out.println("$===========================$\n");
     }
}