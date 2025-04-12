package StuObjSimulation;

public class Main {

     public static void main(String[] args) {
     subjects ave1 = new subjects(85, 77, 91, 90, 81, 88, 88, 90,
                              90, 90, 90);
     ave1.calculate();
     
     student stu1 = new student("Chevelle", "Nacionales",
                              "ICT programming", "Fortran", 11,
                              subjects.aveGr);
     subjects.evalGr();
     stu1.introSelf();
     
     System.out.println();
     
     subjects ave2 = new subjects(83, 76, 84, 90, 83, 85, 88, 86,
                              90, 90, 90);
     ave2.calculate();
     
     student stu2 = new student("Edviel Andrei", "Argarin",
                              "ICT programming", "Fortran", 11,
                              subjects.aveGr);
     subjects.evalGr();
     stu2.introSelf();
     }
}