/*
NACIONALES, CHEVELLE S.
11 ICT - FORTRAN
FEBRUARY 5, 2025
*/

public class ternary {
     
     public static void main(String[] args) {
          
          // INT VERSION FOR TERNARY 
          int x = 999, y = 888;
          String result, result2, result3;
          
          result = x >= y ? "yes" : "no";
          System.out.println("TESTING ON INT");
          System.out.println("is " + x + " >= " + y + "? " + "answer : " + result);
          System.out.println("");
          
          // STRING VERSION FOR TERNARY
          
          String favSubj = "compProg";
          result2 = favSubj.equalsIgnoreCase("compProg") ? "correct" : "wrong";
          System.out.println("TESTING ON STRINGS");
          System.out.println("is my Favorite Subject " + favSubj + "? " + "answer : " + result2);
          System.out.println("");
          
          // BOOLEAN VERSION FOR TERNARY
     
          boolean isGraduate = true;
          result3 = isGraduate ? ", THEN YOU'RE HIRED!" : ", THEN YOU'RE NOT HIRED!";
          System.out.println("TESTING ON BOOLEAN");
          System.out.println("are you a graduate student? " + isGraduate + result3);
          
     }
}