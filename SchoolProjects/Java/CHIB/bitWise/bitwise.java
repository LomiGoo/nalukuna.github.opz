/*
NACIONALES, CHEVELLE S.
11 ICT - FORTRAN
FEBRUARY 5, 2025
*/

public class bitwise {
     
     public static void main(String[] args) {
          
// & AND - CHECKS IF BOTH BITS HAS 1 
// EXAMPLE : 1 IN BINARY --> 0001, 3 IN BINARY --> 0011 (RESULT --> 1)

          int x = 1, y = 3, result = x & y;
          
          System.out.println("& AND OPERATOR");
          System.out.println("");
          System.out.println("x is : " + x + " || y is : " + y);
          System.out.println("COUNTED PARTNERED BITS : " + result);

          System.out.println("");
          
// | OR - CHECKS IF EITHER BITS HAS 1
          
          int a = 5, b = 3, result2 = a | b;
          
          System.out.println("| OR OPERATOR");
          System.out.println("");
          System.out.println("a is : " + a + " || b is : " + b);
          System.out.println("COUNTED 1 BITS : " + result2);
          
          System.out.println("");
     
// ^ XOR - CHECKS IF BITS ARE NOT EQUAL to 0 == 0 or 1 == 1

          int c = 2, d = 6, result3 = c ^ d;
          
          System.out.println("^ XOR OPERATOR");
          System.out.println("");
          System.out.println("c is : " + c + " || d is : " + d);
          System.out.println("TOTAL BINARY OF THE NOT EQUAL BITS : " + result3);
          
          System.out.println("");
     
// ~ NOT - INVERTS THE VALUE OF THE GIVEN NUMBER INTO NEGATIVE OR POSITIVE THEN ADDS 1 ON THE RESULT

          int e = -10, f = 10, result4 = ~e, result5 = ~f;
          
          System.out.println("~ NOT OPERATOR");
          System.out.println("");
          System.out.println("e is : " + e);
          System.out.println("f is : " + f);
          System.out.println("FLIPPED NEGATIVE TO POS : " + e + " to " + result4);
          System.out.println("FLIPPED POSITIVE TO NEG : " + f + " to " + result5);
          
          System.out.println("");
          
// << SHIFT LEFT - MOVE THE BITS TO THE LEFT, THE RESULT IS THE TOTAL OF THE BINARY AFTER MOVING

          int g = 8, h = 5, result6 = g << h;
          
          System.out.println("<< SHIFT LEFT OPERATOR");
          System.out.println("");
          System.out.println("g is : " + g);
          System.out.println("VALUE WAS MOVED BY : " + h + " STEPS TO THE LEFT");
          System.out.println("BINARY TOTAL AFTER MOVING TO THE LEFT : " + result6);
          
          System.out.println("");

// >> SHIFT RIGHT - MOVE THE BITS TO THE RIGHT, THE RESULT IS THE TOTAL OF THE BINARY AFTER MOVING

          int i = 15, j = 2, result7 = i >> j;
          
          System.out.println(">> SHIFT RIGHT OPERATOR");
          System.out.println("");
          System.out.println("i is : " + i);
          System.out.println("VALUE WAS MOVED BY : " + j + " STEPS TO THE RIGHT");
          System.out.println("BINARY TOTAL AFTER MOVING TO THE RIGHT : " + result7);
          
          System.out.println("");
     }
}

