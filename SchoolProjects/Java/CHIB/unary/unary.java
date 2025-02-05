/*
NACIONALES, CHEVELLE S.
11 ICT - FORTRAN
FEBRUARY 5, 2025
*/

public class unary {
     
     public static void main(String[] args) {

// + - NOTHING HAPPENS, JUST RETURNS ITS VALUE 

          int a = 10;
          int res = +a;
          
          System.out.println("+ PLUS OPERATOR");
          System.out.println("YOUR \"a\" WAS " + a +  " IT STAYS THE SAME " + res);
          
          System.out.println("");
          
// - - MAKES POSITIVE VALUE INTO NEGATIVE, ALSO CAN BE USE TO MAKE VALUE INTO POSITIVE

          int b = 20;
          int res2 = -b;
          
          System.out.println("- MINUS OPERATOR");
          System.out.println("YOUR \"b\" WAS " + b +  " IT TURNS INTO " + res2);
          System.out.println("");
          int c = -30;
          int res3 = -c;
          
          System.out.println("NEGATIVE VALUE VERSION");
          System.out.println("- MINUS OPERATOR");
          System.out.println("YOUR \"c\" WAS " + c +  " IT TURNS INTO " + res3);
          
          System.out.println("");
          
// INCREMENTS

          // d++ PRE-INCREMENT : TAKES THE VALUE FIRST THEN ADDS 1 TO THE VARIABLE AFTER BEING CALLED
          int d = 99, res4 = d++;
          // ++e POST-INCREMENT : NO HESITATION, ADDS 1 THEN RETURN RESULT          
          int e = 199, res5 = ++e;
          
          System.out.println("INCREMENT VERSION");
          System.out.println("PRE-INCREMENT (TAKES THE VALUE FIRST THEN ADD 1)");
          System.out.println("PRE-INCREMENT : " + res4 + " THE \"d\" VALUE IS NOW " + d);
          System.out.println("");
          System.out.println("POST-INCREMENT (ADD 1 THEN RETURNS RESULT)");
          System.out.println("POST-INCREMENT : " + res5 + " THE \"e\" VALUE IS NOW " + e);
          
          System.out.println("");
          
// DECREMENTS

          // f-- PRE-DECREMENT : TAKES THE VALUE FIRST THEN MINUS 1 TO THE VARIABLE AFTER BEING CALLED
          int f = 100, res6 = f--;
          // --g POST-INCREMENT : NO HESITATION, MINUS 1 THEN RETURN RESULT          
          int g = 200, res7 = --g;
          
          System.out.println("DECREMENT VERSION");
          System.out.println("PRE-DECREMENT (TAKES THE VALUE FIRST THEN MINUS 1)");
          System.out.println("PRE-DECREMENT : " + res6 + " THE \"d\" VALUE IS NOW " + f);
          System.out.println("");
          System.out.println("POST-DECREMENT (MINUS 1 THEN RETURNS RESULT)");
          System.out.println("POST-DECREMENT : " + res7 + " THE \"e\" VALUE IS NOW " + g);
     }
}