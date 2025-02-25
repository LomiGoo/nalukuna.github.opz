import java.util.Scanner; 

class Is {
     double Is, P, r, t;
     
     public void P(double P) {
          this.P = P;
     }
     public void r(double r) {
          this.r = r;
     }
     public void t(double t) {
          this.t = t;
     }
     
     public double answer() {
         r = r / 100;
         return Is = P * (r * t);
     }
}

class P {
     double Is, P, r, t;
     
     public void Is(double Is) {
          this.Is = Is;
     }
     public void r(double r) {
          this.r = r;
     }
     public void t(double t) {
          this.t = t;
     }
     
     public double answer() {
         r = r / 100;
         return P = Is / (r * t);
     }
}

class r {
     double Is, P, r, t;
     
     public void Is(double Is) {
          this.Is = Is;
     }

     public void t(double t) {
          this.t = t;
     }
     
     public double answer() {
         return r = Is / (P * t);
     }
}

class t {
     double Is, P, r, t;
     
     public void Is(double Is) {
          this.Is = Is;
     }
     
     public void P(double P) {
          this.P = P;
     }
     
     public void r(double r) {
          this.r = r;
     }
     
     public double answer() {
         return t = Is / (P * r);
     }
}

class aFutAm {
     double A, P, Is;
     
     public void P(double P) {
          this.P = P;
     }
     
     public void Is(double Is) {
          this.Is = Is;
     }
     
     public double answer() {
         return A = P + Is;
     }
}

class aFutIntr {
     double P, r, t, A;
     
     public void P(double P) {
          this.P = P;
     }
     
     public void r(double r) {
          this.r = r;
     }
     
     public void t(double t) {
          this.t = t;
     }
     
     public double answer() {
         return A = P / (1 + (r * t));
     }
}

class pPresAm {
     double A, Is, P;
     
     public void A(double A) {
          this.A = A;
     }
     
     public void Is(double Is) {
          this.Is = Is;
     }
     
     public double answer() {
         return P = A - Is;
     }
}

class pPresIntr {
     double A, r, t, P;
     
     public void r(double r) {
          this.r = r;
     }
     
     public void t(double t) {
          this.t = t;
     }
     
     public double answer() {
         return P = A / (1 + (r * t));
     }
}

public class Interest {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          Is Is = new Is();
          P P = new P();
          r r = new r();
          t t = new t();
          aFutAm A = new aFutAm();
          aFutIntr AFI = new aFutIntr();
          pPresAm PPA = new pPresAm();
          pPresIntr PPI = new pPresIntr();
          
          String green = "\u001B[92m";
          String yellow = "\u001B[93m";
          String brBlue = "\u001B[38;5;12m";
          String brCyan = "\u001B[38;5;14m";
          String brRed = "\u001B[38;5;9m";
          String BrMagenta = "\u001B[38;5;13m";
          String softGre = "\u001B[38;5;71m";
          String reset = "\u001B[0m";
          
          boolean running = true;
          
          while(running) {
          System.out.println("○《================================================================》○");
          System.out.println("WELCOME TO GENMATH : " + brRed + "INTEREST" + reset);
          System.out.println("Choose what problem to solve for : ");
          System.out.println("");
          
          System.out.println("1. Solve for " + BrMagenta + "Is " + reset + "(use if " + softGre + "P, r & t " + reset + "exists)");
          System.out.println("2. Solve for " + BrMagenta + "P " + reset + "(use if " + softGre + "Is, r & t " + reset + "exists)");
          System.out.println("3. Solve for " + BrMagenta + "r " + reset + "(use if " + softGre + "Is, P & t " + reset + "exists)");
          System.out.println("4. Solve for " + BrMagenta + "t " + reset + "(use if " + softGre + "Is, P & r " + reset + "exists)");
          System.out.println("5. Solve for " + BrMagenta + "A Future Amount " + reset + "(use if " + softGre + "P & I " + reset + "exists)");
          System.out.println("6. Solve for " + BrMagenta + "A Future interest " + reset + "(use if " + softGre + "P, r & t " + reset + "exists)");
          System.out.println("7. Solve for " + BrMagenta + "P Present Amount " + reset + "(use if " + softGre + "A & Is " + reset + "exists)");
          System.out.println("8. Solve for " + BrMagenta + "P Present interest " + reset + "(use if " + softGre + "A, r & t " + reset + "exists)");
          System.out.println("○《================================================================》○");
          
          System.out.print("response : " + yellow);
          int ans = s.nextInt();
          System.out.print(reset);
          
          while(ans > 8 || ans < 1) {
               System.out.print("number is NOT in the choices, enter again : " + yellow);
               ans = s.nextInt();
               System.out.print(reset);
          }
          
          System.out.println("");
          
          boolean cont = true;
          
          if(ans == 1) {
               while(cont) {
                    System.out.print("Enter P : " + yellow);
                     Is.P = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter r (do not include %, only number) : " + yellow);
                     Is.r = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter t : " + yellow);
                     Is.t = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR Is - " + green + Is.answer() + reset);
                    break;
               }
          } else if(ans == 2) {
               while(cont) {
                    System.out.print("Enter Is : " + yellow);
                     P.Is = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter r (do not include %, only number) : " + yellow);
                     P.r = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter t : " + yellow);
                     P.t = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR P - " + green + P.answer() + reset);
                    break;
               }
          } else if(ans == 3) {
               while(cont) {
                    System.out.print("Enter Is : " + yellow);
                     r.Is = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter P : " + yellow);
                     r.P = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter t : " + yellow);
                     r.t = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR r - " + green + r.answer() + reset);
                    break;
               }
          } else if(ans == 4) {
               while(cont) {
                    System.out.print("Enter Is : " + yellow);
                     t.Is = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter P : " + yellow);
                     t.P = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter r (do not include %, only number) : " + yellow);
                     t.r = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR t - " + green + t.answer() + reset);
                    break;
               }
          } else if(ans == 5) {
               while(cont) {
                    System.out.print("Enter P : " + yellow);
                     A.P = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter Is : " + yellow);
                     A.Is = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR AMOUNT A - " + green + A.answer() + reset);
                    break;
               }
          } else if(ans == 6) {
               while(cont) {
                    System.out.print("Enter P : " + yellow);
                     AFI.P = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter r (do not include %, only number) : " + yellow);
                     AFI.r = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter t : " + yellow);
                     AFI.t = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR INTEREST A - " + green + AFI.answer() + reset);
                    break;
               }
          } else if(ans == 7) {
               while(cont) {
                    System.out.print("Enter A : " + yellow);
                     PPA.A = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter Is : " + yellow);
                     PPA.Is = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR AMOUNT P - " + green + PPA.answer() + reset);
                    break;
               }
          } else if(ans == 8) {
               while(cont) {
                    System.out.print("Enter A : " + yellow);
                     PPI.A = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter r : " + yellow);
                     PPI.r = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.print("Enter t : " + yellow);
                     PPI.t = s.nextDouble(); 
                    System.out.print(reset);
                    
                    System.out.println("");
                    
                    System.out.println("ANSWER FOR INTEREST P - " + green + PPI.answer() + reset);
                    break;
               }
          }
               
               System.out.println("");
               
               System.out.println("Want to Solve another one again? 1 for Yes, 2 for No");
               System.out.print("response : " + yellow);
               int ans2 = s.nextInt();
               System.out.print(reset);
               
               while(ans2 < 1 || ans2 > 2) {
                    System.out.print("Response is NOT in the choices, enter again : " + yellow);
                    ans2 = s.nextInt();
                    System.out.print(reset);
               }
               
               System.out.println("");
               
               if(ans2 == 2) {
                    System.out.println(brBlue + "THANK YOU FOR USING THIS PROGRAM!" + reset);
                    break;
               }
          }
     }
}