import java.util.Scanner;

public class Restaurant_Ordering {

     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int food;
     int pizza, burger, pasta;

     System.out.println("WELCOME TO MY RESTAURANT!");
     System.out.println(" ");
     System.out.println("CHOOSE FROM THIS MENU: ");
     System.out.println("1. PIZZA ");
     System.out.println("2. BURGER ");
     System.out.println("3. PASTA ");
     System.out.println("4. EXIT ");
     System.out.println(" ");
     
     System.out.print("Enter your order (1 - 3): ");
     food = s.nextInt();

          switch(food) {
          case 1 -> {
               pizza = 599;
               System.out.println("You ordered PIZZA. Price: " + "P" + pizza);
          }
          case 2 -> {
               burger = 75;
               System.out.println("You ordered BURGER. Price : " + "P" + burger);
          }
          case 3 -> {
               pasta = 280;
               System.out.println("You ordered PASTA. Price: " + "P" + pasta);
          }
          case 4 -> System.out.println("Goodbye!");
          default -> System.out.println("FOOD NOT AVAILABLE!");
          }
     }
}