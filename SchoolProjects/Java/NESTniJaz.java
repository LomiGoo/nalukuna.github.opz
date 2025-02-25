import java.util.Scanner;

public class NESTniJaz {

    public static void main(String[] args) {
         
       Scanner jaz = new Scanner(System.in);
       
            System.out.println("Enter a number: ");
            int number = jaz.nextInt();
            
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " positive even number.");
                } else {
                    System.out.println(number + " positive odd number.");
                }
            }
            
           if (number < 0) {
                if (number % 2 == 0) {
                System.out.println(number + " negative even number.");
            } else {
                System.out.println(number + " negative odd number.");
            }
        } 
            }  else {
                System.out.println("The number is zero, which is neither even nor odd.");
            }
        }

        Scanner mine = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = mine.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " positive even number.");
            } else {
                System.out.println(num + " positive odd number.");
            }if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + " negative even number.");
            } else {
                System.out.println(num + " negative odd number.");
            }
        } 
        }  else {
            System.out.println("The number is zero, which is neither even nor odd.");
        }

        mine.close();
    }
