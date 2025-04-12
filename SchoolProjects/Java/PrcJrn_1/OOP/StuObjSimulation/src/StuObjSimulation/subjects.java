package StuObjSimulation;

public class subjects {
     public double $21stCent, genmath, hope2,
     philo, pagbasa, physci,
     eTech, pr2, cp4, cp5, cp6;
     public static double aveGr;

     public subjects(double $21stCent, double genmath, double hope2,
     double philo, double pagbasa, double physci,
     double eTech, double pr2, double cp4, double cp5,
     double cp6) {
          this.$21stCent = $21stCent;
          this.genmath = genmath;
          this.hope2 = hope2;
          this.philo = philo;
          this.pagbasa = pagbasa;
          this.physci = physci;
          this.eTech = eTech;
          this.pr2 = pr2;
          this.cp4 = cp4;
          this.cp5 = cp5;
          this.cp6 = cp6;
     }

     public double calculate() {
     double grades[] = {$21stCent, genmath, hope2,
     philo, pagbasa, physci,
     eTech, pr2, cp4, cp5, cp6};
     double sum = 0;
          for (double grade : grades) {
          sum += grade;
          }
     return aveGr = sum / grades.length;
     }

     public static String evalGr() {
          if (aveGr > 100) {
               return "Invalid Grade!";
          } else if (aveGr >= 98) {
               return "with Highest Honors";
          } else if (aveGr >= 95) {
               return "with High Honors";
          } else if (aveGr >= 90) {
               return "with Honors";
          } else if (aveGr >= 75) {
               return "PASSED";
          } else {
               return "FAILED";
          }
     }
}