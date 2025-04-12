import java.util.Scanner;

public class loginMax {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          String usrN = "chib", pass = "loms900";
          int tries = 3;
          
          do {
               System.out.println("Login Authentication");
               System.out.println("MENU  :");
               System.out.println("1. enter E to exit");
               System.out.println("");
               System.out.println("AVAILABLE TRIES : " + tries);

               System.out.print("ENTER USERNAME (enter E to exit) : ");
               usrN = s.next();
                    
                    if(usrN.equalsIgnoreCase("E")) {
                         System.out.println("COME AGAIN!");
                    break;
                    }
                    
                    System.out.print("ENTER PASSWORD (enter E to exit) : ");
                    pass = s.next();
                    
                    if(pass.equalsIgnoreCase("E")) {
                        System.out.println("COME AGAIN!");
                    break;
                    }

                    System.out.println("");

                    if(!usrN.equalsIgnoreCase("chib") || !pass.equals("loms900")) {
                         System.out.println("");
                         tries = (tries - 1);
                         System.out.println("AVAILABLE TRIES : " + (tries));
                         System.out.print("FAILED, TRY AGAIN. ENTER USERNAME (enter E to exit) : ");
                         s.nextLine();
                         usrN = s.nextLine();
                         
                         
                        if(usrN.equalsIgnoreCase("E")) {
                              System.out.println("COME AGAIN!");
                         break;
                         }
                        
                         System.out.print("FAILED, TRY AGAIN. ENTER PASSWORD (enter E to exit) : ");
                         pass = s.nextLine();
                         
                           
                        if(pass.equalsIgnoreCase("E")) {
                              System.out.println("COME AGAIN!");
                         break;
                         }
                        
                         System.out.println("");

                         if(!usrN.equalsIgnoreCase("chib") || !pass.equals("loms900")) {
                              System.out.println("");
                              tries = (tries - 1);
                              System.out.println("AVAILABLE TRIES : " + (tries));
                              System.out.print("FAILED, TRY AGAIN. ENTER USERNAME (enter E to exit) : "); 
                              usrN = s.nextLine();

                                  
                              if(usrN.equalsIgnoreCase("E")) {
                                   System.out.println("COME AGAIN!");
                              break;
                              }

                              System.out.print("FAILED, TRY AGAIN. ENTER PASSWORD (enter E to exit) : ");
                              pass = s.nextLine();
                              
                              if(pass.equalsIgnoreCase("E")) {
                                   System.out.println("COME AGAIN!");
                              break;
                              }
                              System.out.println("");

                              if(!usrN.equalsIgnoreCase("chib") || !pass.equals("loms900")) {
                                   System.out.println("");
                                   tries = (tries - 1);
                                   System.out.println("AVAILABLE TRIES : " + (tries));
                                   System.out.print("FAILED, TRY AGAIN. ENTER USERNAME (enter E to exit) : ");
                                   usrN = s.nextLine();
                                   
                                   if(usrN.equalsIgnoreCase("E")) {
                                        System.out.println("COME AGAIN!");
                                   break;
                                   }
                                   
                                   System.out.print("FAILED, TRY AGAIN. ENTER PASSWORD(enter E to exit) : ");
                                   pass = s.nextLine();
                                   
                                   if(pass.equalsIgnoreCase("E")) {
                                        System.out.println("COME AGAIN!");
                                   break;
                                   }
                                   
                                   System.out.println("");

                                        if(!usrN.equalsIgnoreCase("chib") || !pass.equals("loms900")) {
                                             System.out.println("");
                                             System.out.println("YOU HAVE REACHED LOGIN LIMIT : " + (tries));
                                        } else {
                                             System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
                                             break;
                                        }
                              } else {
                                   System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
                                   break;
                              }
                         } else {
                              System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
                              break;
                         }
                    } else {
                         System.out.println("LOGIN SUCCESSFUL, WELCOME " + usrN + "!");
                         break;
                    }
          } while(true);
     }
}