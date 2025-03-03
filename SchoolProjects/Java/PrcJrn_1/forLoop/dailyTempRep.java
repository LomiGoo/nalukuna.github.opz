public class dailyTempRep {
     
     public static void main(String[] args) {
          int days[] = {1, 2, 3, 4, 5, 6, 7};
          int temp[] = {72, 75, 70, 68, 74, 73, 71};
          double tempAve = 0;
          
          for(int i = 0; i < days.length; i++) {
               System.out.println("day " + days[i] + " : " + temp[i] + "°F");
               tempAve += temp[i];
          }
          tempAve /= 7;
          System.out.println("Average Temperature : " + (String.format("%.1f", tempAve)) + "°F");
     }
}