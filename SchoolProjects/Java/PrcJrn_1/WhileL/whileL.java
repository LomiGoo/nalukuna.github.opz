import java.util.Scanner;

public class whileL {
     
     public static void println(String text) {
          System.out.println(text);
     }
     
     public static void print(String text) {
          System.out.print(text);
     }
     
     public static void printlnum(int num) {
          System.out.println(num);
     }
     
     public static void printnum(int num) {
          System.out.print(num);
     }
    
    
    
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          
          int i = 0;
       
         do {
               println("hey");
               i++;
          } while(i < 3);
          
          int j = 0;
          
          while(j < 3) {
               println("hoy");
               j++;
          }
          
          String students[] = {"edviel", "micha", "jazmine"};
          
          printlnum(students.length);
          
          int e = 0;
         
          print("Search for a person : ");
          String search = s.nextLine();
          
          while(e < students.length) {
               
               if(students[e].equalsIgnoreCase(search)) {
                    println("found it : " + students[e]);
                    break;
               } else {
                    println("Did not found");
               }
               e++;
               break;
          }
          
          int r = 0;
          do {
               println("testing");
               r++;
          } while(r < 5);
     }
}


