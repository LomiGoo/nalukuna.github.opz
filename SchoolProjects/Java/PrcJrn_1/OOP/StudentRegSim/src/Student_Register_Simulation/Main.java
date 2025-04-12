package Student_Register_Simulation;
import java.util.Scanner;

class info {
     static String fname, lname;
     static int year;
     static String strand, section; 
}

public class Main {
     static Scanner s = new Scanner(System.in);
     static student stu[] = new student[10];
     static student student = new student();
     static int studentPosition = 0;
     static int studentPositionReference = 0;
     static int res;
          
     static void loopInfo() {
          for(student st : stu) {
               if(studentPositionReference == studentPosition) break;
               studentPositionReference++;
     
               st.displayCred();
               st.stuNum++;
          }  
     }
     
     public static void main(String[] args) {
               do {
                    System.out.println("\nSTUDENT REGISTRATION SIMULATION\n");
                    System.out.print("enter first name : ");
                    info.fname = s.nextLine();
                    System.out.print("enter last name : ");
                    info.lname = s.nextLine();
                    
                    System.out.print("enter year : ");
                    info.year = s.nextInt();
                    s.nextLine();
                    
                    System.out.print("enter strand : ");
                    info.strand = s.nextLine();
                    System.out.print("enter section : ");
                    info.section = s.nextLine();
                    
                    stu[studentPosition] = new student(info.fname, info.lname, info.year, info.strand, info.section);
                    
                    System.out.println("Register again? [1 for YES]  [2 for NO] ");
                    res = s.nextInt();
                    s.nextLine();
                    studentPosition++;   
                    
                    if(studentPosition == stu.length) break;
               } while(res != 2);
          System.out.println("\n#=====REGISTERED STUDENTS=====#");
          loopInfo();
     }
}