class subject {
     
     private String subject;
     private int grade;
    
    public subject(String subject, int grade) {
          this.subject = subject;
          this.grade = grade;
     }
     
    public String getSubj() {
          return subject;
     }
     
     public int getGr() {
          return grade;
     }
     
}
public class main {
     
     public static void main(String[] args) {
          
     subject Filipino = new subject("Filipino", 85);
     subject English = new subject("English", 86);
     subject Mathematics = new subject("Mathematics", 78);
     subject Science = new subject("Science", 85);
     subject AP = new subject("AP", 88);
     subject ESP = new subject("ESP", 88);
     subject TLE = new subject("TLE", 90);
     subject MAPEH = new subject("MAPEH", 87);
     
     int total = Filipino.getGr() + English.getGr() + 
               Mathematics.getGr() + Science.getGr() +
               AP.getGr() + ESP.getGr() + TLE.getGr() +
               MAPEH.getGr();
          
     int genAve = total / 8;
     
     System.out.println("your General Average : " + genAve);
     
     if(genAve >= 75) {
          System.out.println("PASSED");
     } else {
          System.out.println("FAILED");
     }
     
          }    
     }