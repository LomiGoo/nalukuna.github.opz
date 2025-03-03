public class forEach {
     
     public static void main(String[] args) {
          String people[] = {"chib", "edbil", "jay", "jaz", "denil"};
          int index = 0;
          
          for(String pips : people) {
               System.out.println("index " + index + " : " + pips);
               index += 1;
          }
          
          String names[][] = {
               {"lebron", "chab"},
               {"kai sotto", "ada"}
          };
          
          for(String name[] : names) {
               System.out.println("user : " + name[0]);
          }
          
          for(String name[] : names) {
               for(String all : name) {
                    System.out.println("- " + all);
               }
          }
          
          int grades[] = {85, 77, 91, 90, 81, 88, 88, 90, 90, 90, 90};
          int gen = 0;
          for(int grade : grades) {
               gen = gen + grade;
          }
          System.out.println("total : " + gen);
          gen = gen / 11;
          System.out.println("general average : " + gen);
     }
}