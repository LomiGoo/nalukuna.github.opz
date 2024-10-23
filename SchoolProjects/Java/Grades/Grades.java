public class Grades {
public static void main(String[] args) {
     System.out.println("Calculate The General Average :");
     int Filipino = 85;
     int English = 86;
     int Mathematics = 78;
     int Science = 85;
     int AP = 88;
     int ESP = 88;
     int TLE = 90;
     int MAPEH = 87;
     
     int compile;
     float genAve;
     
     System.out.println("Filipino " + Filipino);
     System.out.println("English " + English);
     System.out.println("Mathematics " + Mathematics);
     System.out.println("Science " + Science);
     System.out.println("AP " + AP);
     System.out.println("ESP " + ESP);
     System.out.println("TLE " + TLE);
     System.out.println("MAPEH " + MAPEH);
     
     compile = Filipino + English + Mathematics +
               Science + AP + ESP + TLE + MAPEH;
              
     genAve = compile / 8f;
     System.out.println("GenAve " + genAve);
     System.out.println("");
     
     if (genAve >= 75) {
          System.out.println("Passed ");
     } else {
          System.out.println("Failed ");
     }

     }
}