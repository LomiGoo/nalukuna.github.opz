import java.util.Scanner;
public class Quiz {
     
     public static void main(String[] args) {
          Scanner sInt = new Scanner(System.in);
          
          boolean quiz = true;
          
          while(quiz) {
          System.out.println("");
          System.out.println("Do you want to start Quiz?");
          System.out.println("choose a number to respond : ");
          System.out.println("1. YES");
          System.out.println("2. NO");
          System.out.println("");
          System.out.print("response : ");
          int resp = sInt.nextInt();
          System.out.println("");
          
          while(resp <= 0 || resp > 2) {
               if(resp <= 0 || resp > 2)
               System.out.print("your response : ");
               resp = sInt.nextInt();
          }
          
          String ans1, ans2, ans3, ans4, ans5, ans6;
          int points = 0;
          
          if(resp == 1) {
               
               Scanner sStr = new Scanner(System.in);   
               int hearts = 3;
               
               System.out.println("You have 3 hearts only, failing a question will deduct this lives.");
               System.out.println("");
               System.out.println("1. What subject is the hardest to learn?");
               System.out.println("A. Computer Programming");
               System.out.println("B. Philosophy");
               System.out.println("C. Genmath");
               System.out.println("D. 21st Century");
               System.out.println("");
               System.out.print("Answer : ");
               ans1 = sStr.nextLine();
              
               if(ans1.equalsIgnoreCase("C")) {
                    System.out.println("CORRECT!");
                    System.out.println("Lives left : " + hearts);
                    System.out.println("");
                    ++points;
               } else {
                    System.out.println("WRONG!");
                    hearts = (hearts - 1);
                    System.out.println("Lives Left : " + (hearts));
                    System.out.println("");
               }
               
               System.out.println("2. is HTML a Programming Language?");
               System.out.println("A. No");
               System.out.println("B. Yes");
               System.out.println("C. Maybe");
               System.out.println("D. none of the above");
               System.out.println("");
               System.out.print("Answer : ");
               ans2 = sStr.nextLine();
               
               if(ans2.equalsIgnoreCase("A")) {
                    System.out.println("CORRECT!");
                    System.out.println("Lives left : " + hearts);
                    System.out.println("");
                    ++points;
               } else {
                    System.out.println("WRONG!");
                    hearts = (hearts - 1);
                    System.out.println("Lives Left : " + (hearts));
                    System.out.println("");
               }   

               System.out.println("3. What day is my Birthday?");
               System.out.println("A. January 4");
               System.out.println("B. December 29");
               System.out.println("C. February 11");
               System.out.println("D. none of the above");
               System.out.println("");
               System.out.print("Answer : ");
               ans3 = sStr.nextLine();
               
               if(ans3.equalsIgnoreCase("C")) {
                    System.out.println("CORRECT!");
                    System.out.println("Lives left : " + hearts);
                    System.out.println("");
                    ++points;
               } else {
                    System.out.println("WRONG!");
                    hearts = (hearts - 1);
                    System.out.println("Lives Left : " + (hearts));
                    System.out.println("");
               } 
               
               while(hearts != 0) {
               System.out.println("4. Who is the best huzz?");
               System.out.println("A. Ada Wong");
               System.out.println("B. Tifa Lockhart");
               System.out.println("C. Beidou");
               System.out.println("D. both A & C");
               System.out.println("");
               System.out.print("Answer : ");
               ans4 = sStr.nextLine();
               
               if(ans4.equalsIgnoreCase("D")) {
                    System.out.println("CORRECT!");
                    System.out.println("Lives left : " + hearts);
                    System.out.println("");
                    ++points;
               } else {
                    System.out.println("WRONG!");
                    hearts = (hearts - 1);
                    System.out.println("Lives Left : " + (hearts));
                    System.out.println("");
                    
                    if(hearts == 0) {
                    break;
                    }
               } 
               
               System.out.println("5. What day is the best in school days?");
               System.out.println("A. Monday");
               System.out.println("B. Friday");
               System.out.println("C. Tuesday");
               System.out.println("D. either A or C");
               System.out.println("");
               System.out.print("Answer : ");
               ans5 = sStr.nextLine();
               
               if(ans5.equalsIgnoreCase("B")) {
                    System.out.println("CORRECT!");
                    System.out.println("Lives left : " + hearts);
                    System.out.println("");
                    ++points;
               } else {
                    System.out.println("WRONG!");
                    hearts = (hearts - 1);
                    System.out.println("Lives Left : " + (hearts));
                    System.out.println("");
                    
                    if(hearts == 0) {
                    break;
                    }
               } 
               
               System.out.println("6. What is the worst school day?");
               System.out.println("A. Monday");
               System.out.println("B. Friday");
               System.out.println("C. Tuesday");
               System.out.println("D. Wednesday");
               System.out.println("");
               System.out.print("Answer : ");
               ans6 = sStr.nextLine();
               
               if(ans6.equalsIgnoreCase("D")) {
                    System.out.println("CORRECT!");
                    System.out.println("Lives left : " + hearts);
                    System.out.println("");
                    ++points;
               } else {
                    System.out.println("WRONG!");
                    hearts = (hearts - 1);
                    System.out.println("Lives Left : " + (hearts));
                    System.out.println("");
                    break;
               }
               break;
               }
               
               System.out.println("");
               
               if(hearts == 0) {
               System.out.println("YOU RAN OUT OF LIVES, QUIZ OVER.");
               System.out.println("You scored " + points + "/6");
               } else {
                    System.out.println("CONGRATS, YOU ANSWERED ALL THE QUESTIONS. YOUR SCORE IS " + points + "/6");
                    System.out.println("Hearts remaining was " + hearts);
               }
               
               System.out.println("");
               System.out.println("Do you want to restart again?");
               System.out.println("1. YES");
               System.out.println("2. NO");
               System.out.print("response : ");
               int response = sInt.nextInt();
               
               while(response <= 0 || response > 2) {
                    if(response <= 0 || response > 2) {
                         System.out.print("1 and 2 are the only choices : ");
                         response = sInt.nextInt();
                    }
               }
               
               if(response == 1) {
                    hearts = 3;
                    points = 0;
               } else {
                    System.out.println("Goodbye!");
                    break;
               }
          } else {
               System.out.println("Goodbye!");
          }
          }  
     }
}