package constructor;
import java.util.Scanner;

public class Main {
										
										public static void main(String[] args) {
																				Scanner s = new Scanner(System.in);
																				String fruit, color;
																				double price;
																				
																				System.out.print("enter fruit : ");
																				fruit = s.nextLine();
																				
																				System.out.print("enter color : ");
																				color = s.nextLine();
																				
																				System.out.print("enter price : ");
																				price = s.nextDouble();
																				
																				System.out.println("");
																				
																				fruit f1 = new fruit(fruit, color, price);
										}
}