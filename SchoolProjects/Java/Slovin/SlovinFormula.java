public class SlovinFormula {
public static void main(String[] args) {

/* n = N/1+Ne^2 */

System.out.println("Find the sample of the Population :");
System.out.println("");

String n;
double temp;
double N; 
double e;
double x;

N = 27150;
e = 0.05;

e = Math.pow(e, 2);
x = N * e + 1;
temp = N / x;

n = String.format("%.2f", temp);


System.out.println(n + "or" + (int) n);
     }
}