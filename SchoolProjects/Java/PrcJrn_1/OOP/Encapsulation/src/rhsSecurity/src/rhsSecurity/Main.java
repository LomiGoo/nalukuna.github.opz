package rhsSecurity;
import java.util.Scanner;

public class Main {
										public static String usrN, pass, guardShift;
										public static String usrNs, passS, guardShiftS;
										public static int resp;
										public static Scanner s = new Scanner(System.in);
										
										public static void main(String[] args) {
										do {																
																				System.out.println("\n○===☆ WELCOME TO RHS SECURITY CHECKER ☆===○\n");
																				System.out.println("▪︎ Choose from the Menu ▪︎");
																				System.out.println("◇ 1. Login");
																				System.out.println("◇ 2. Sign up");
																				System.out.println("◇ 3. Exit\n");
																				
																				System.out.print("》your decision (1 - 2) : ");
																				resp = s.nextInt();
																				s.nextLine();
												
																												switch(resp) {
																																						case 1 :
																																						    System.out.println("\n♡ LOGIN ♡");
																																						    System.out.print("\n》Enter your username (type N to exit) : ");
																														 															usrN = s.nextLine();
																																						    								if(usrN.equalsIgnoreCase("N")) {
																																						    																		break;
																																						    								}
																												 																	System.out.print("》Enter your password (type N to exit) : ");
																 																													pass = s.nextLine();
																																						    								if(pass.equalsIgnoreCase("N")) {
																																						    																		break;
																																						    								}
																																													
											 																																		System.out.print("》Enter your shift position (ex. pos1) (type N to exit) : ");
												 																																	guardShift = s.nextLine();
																																						    								if(guardShift.equalsIgnoreCase("N")) {
																																						    																		break;
																																						    								}
																																				    		System.out.println(decisions.checkInfo());
																																						    
																																																	while(decisions.accFnd == false) {
																																																											decisions.infoTryAg();
																																																																	if(usrN.equalsIgnoreCase("N")) {
																																																																												break;
																																																													 }
																																																											System.out.println(decisions.checkInfo());
																																																	}
																																						break;
																																						case 2 :
																																						    System.out.println("\n♡ SIGN UP ♡");
																																						    System.out.print("\n》Enter your username (type N to exit) : ");
																																						    usrNs = s.nextLine();
																				 																			   							if(usrNs.equalsIgnoreCase("N")) {
																				 																			   																	break;
																				 																			   							}
																												 																	System.out.print("》Enter your password (type N to exit) : ");
																 																													passS = s.nextLine();
																																													 									if(passS.equalsIgnoreCase("N")) {
																																													 																			break;
																																													 									}
											 																																		System.out.print("》Enter your shift position (ex. pos1) (type N to exit) : ");
												 																																	guardShiftS = s.nextLine();
																																						    								if(guardShiftS.equalsIgnoreCase("N")) {
																																						    																		break;
																																						    								}
																																						    decisions.signUp();
																																						break;
																																						case 3 :
																																																		System.out.println("\nExiting Program... Done!");
																																						break;
																																						default :
																																													  System.out.println("\nget out!\n");
																																						break;
																												}  
																				} while(resp != 3);
										}
}