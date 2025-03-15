package rhsSecurity;
import guardInfo.*;

public class decisions {

static void menuDecide() {
     while (Main.resp < 1 || Main.resp > 2) {
          System.out.print("》not available in the menu, try again. (1 - 2) : ");
          Main.resp = Main.s.nextInt();
          Main.s.nextLine();
     }
}

static void infoTryAg() {
     System.out.print("\n》Enter your username again (type N to exit) : ");
     Main.usrN = Main.s.nextLine();
          if (Main.usrN.equalsIgnoreCase("N")) {
          return;
          }
     System.out.print("》Enter your password again   : ");
     Main.pass = Main.s.nextLine();

     System.out.print("》Enter your shift position again (ex. pos1) : ");
     Main.guardShift = Main.s.nextLine();
}

static boolean accFnd = false;
static String checkInfo() {
     guardInfo g = new guardInfo();
     String user[] = g.getUsrN();
     String passW[] = g.getPass();
     String guardPOS[] = g.getGuardSh();
     String mainUsr = Main.usrN, mainPass = Main.pass, mainGS = Main.guardShift;

     for (int i = 0; (i < user.length) && (i < passW.length) && (i < guardPOS.length); i++) {
          if (mainUsr.equalsIgnoreCase(user[i]) && mainPass.equalsIgnoreCase(passW[i]) && mainGS.equalsIgnoreCase(guardPOS[i])) {
          accFnd = true;
     }
}
     if (accFnd == true) {
          return "\nWelcome, " + Main.usrN + "!\n";
     } else {
          return "\nWrong details, Try Again.";
     }
}

static int counter = 0;
static void signUp() {
     guardInfo g = new guardInfo();
     String userS[] = g.getUsrN();
     String passWs[] = g.getPass();
     String guardPOSs[] = g.getGuardSh();
     String mainUsrS = Main.usrNs, mainPassS = Main.passS, mainGSs = Main.guardShiftS;
     int signUp = 0;

          do {
               userS[counter] = mainUsrS;
               passWs[counter] = mainPassS;
               guardPOSs[counter] = mainGSs;
               counter++;
               signUp++;
          } while (signUp < 1);

          if (signUp > 0) {
               signUp = 0;
          }
          System.out.println("\nYou signed up at RHS. Welcome, " + mainUsrS + "!\n");
     }
}