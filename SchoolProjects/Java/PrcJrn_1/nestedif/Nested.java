import java.util.Scanner;

public class Nested {
     
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Are you graduate? yes or no? : ");
          String answer = sc.nextLine();
          boolean graduated = answer.equalsIgnoreCase("yes");
          
          System.out.print("Whats your Programming Language? : ");
          String progLang = sc.nextLine();
          
          if(graduated) {
             
               if(progLang.equalsIgnoreCase("java")) {
                    System.out.println("YOU'RE HIRED!");
               } else if(progLang.equalsIgnoreCase("C#")) {
                    System.out.println("YOU'RE HIRED BUT YOUR ARE NOW A C# DEV"); 
               } else {
                    System.out.println("WE NEED JAVA OR C# DEVS, SORRY");
               }
               
          } else {
               System.out.println("YOU'RE NOT A GRADUATE");
          }
// ADDITIONAL CONDITIONALS
     
          
// AND && STATEMENT
System.out.println("");
     String person = "teacher";
     boolean identity = person.equalsIgnoreCase("teacher");
     String entry = "pm";
     boolean time = entry.equalsIgnoreCase("am");
     
          if(identity && time) {
               System.out.println("YOU ARE A " + person + " AT AM SHIFT, COME IN");
          } else if(time == false) {
               System.out.println("YOU ARE A " + person + " AT PM SHIFT, LATER");
          } else {
               System.out.println("YOU ARE NOT A TEACHER, GET OUT");
          }
          
// OR || STATEMENT
System.out.println("");
     String paper = "none";
          
          if(paper.equalsIgnoreCase("Hardcopy") || paper.equalsIgnoreCase("Softcopy")) {
               System.out.println("you can pass it");
          } else {
               System.out.println("you dont have any copy");
          }
     
// NOT ! STATEMENT
System.out.println("");
     String pirson = "notPogi";
     boolean pogi = pirson.equalsIgnoreCase("pogi");
     
          if(!pogi) {
               System.out.println("agoi");
          } else {
               System.out.println("pogi nga");
               
          }
     }
}

/*

 NOTE : 
 
FOR BOOLEAN : .equals("yes"); - WHATS INSIDE OF THE PARAMETER BECOMES TRANSLATED INTO TRUE

FOR IF : .equals("java"), .equals("C#"); - CHECKS IF THE ANSWER FROM USER IS SIMILAR INSIDE THE PARAMETER.
IN JAVASCRIPT, ITS progLang == "java";

CASE SENSITIVITY : .equalsIgnoreCase("java"); - IGNORES CASE SENSITIVITY

 */