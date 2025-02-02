import java.util.Scanner;

public class dateFormat {
     
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
          Scanner sc = new Scanner(System.in);
          
          int month, day, year;
          
          print("enter month : ");
          month = sc.nextInt();
          
          if(month > 12 || month <= 0) {
               while(month > 12 || month <= 0) {
                    print("invalid month, enter again : ");
                    month = sc.nextInt();
               }
          }
          
          print("enter day : ");
          day = sc.nextInt();
          
          if(day > 31 || day <= 0) {
               while(day > 31 || day <= 0) {
                    print("invalid day, enter again : ");
                    day = sc.nextInt();
               }
          }
          
          print("enter year : ");
          year = sc.nextInt();
          
          if(year > 9999 || year <= 0) {
               while(year > 9999 || year <= 0) {
                    print("invalid year, enter again : ");
                    year = sc.nextInt();
               }
          }
          
          println("");
          
          switch(month) {
               case 1 :
                    println("JANUARY " + day + ", " + year);
                    break;
               case 2 :
                    println("FEBRUARY " + day + ", " + year);
                    break;
               case 3 :
                    println("MARCH " + day + ", " + year);
                    break;
               case 4 :
                    println("APRIL " + day + ", " + year);
                    break;
               case 5 :
                    println("MAY " + day + ", " + year);
                    break;
               case 6 :
                    println("JUNE " + day + ", " + year);
                    break;
               case 7 :
                    println("JULY " + day + ", " + year);
                    break;
               case 8 :
                    println("AUGUST " + day + ", " + year);
                    break;
               case 9 :
                    println("SEPTEMBER " + day + ", " + year);
                    break;
               case 10 :
                    println("OCTOBER " + day + ", " + year);
                    break;
               case 11 :
                    println("NOVEMBER " + day + ", " + year);
                    break;
               case 12 :
                    println("DECEMBER " + day + ", " + year);
                    break;
               default:
                    println("INVALID DATE");
          }
     }
}