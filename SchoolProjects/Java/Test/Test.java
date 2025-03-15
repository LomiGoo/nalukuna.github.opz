public class Test {
    static void println(String t) {
     										System.out.println(t);
     }
										
										void print(String te) {
     										System.out.println(te);
     }
     public static void main(String[] args) {
     										 String usrN[] = {"chib", "advil"};
     										 String pass[] = {"naluks900", "freaky123"};
     										 String guardSh[] = {"pos1", "pos2"};
     										 boolean accFnd = false;
     										
     										for(int i = 0; i < usrN.length && i < pass.length &&
     																				i < guardSh.length; i++) {
     																														accFnd = true;
     																														break;
     																				}
     										if(accFnd == true) {
               System.out.println("Welcome, " + usrN);
          } else {
               System.out.println("Wrong details, please try again.");
          }
     }
}

