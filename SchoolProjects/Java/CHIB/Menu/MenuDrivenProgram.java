package menudrivenprogram;
import java.util.Scanner;

public class MenuDrivenProgram{

public static void main(Stringl] args) { 

Scanner sc= new Scanner(System.in);int choice;


do

// Display Menu
System.out.println("\n=== MENU ===");
System.out.println("1. Add Two Numbers");
System.out.println("2. Subtract Two Numbers");System.out.println("3. Multiply Two Numbers");System.out.println("4. Divide Two Numbers");System.out.println("5. Exit");
System.out.print("Enter your choice: ");

// Read user choice

choice = sc.nextlnt();
switch (choice) {

case 1: // Addition
System.out.print("Enter first number:");
int num1= sc.nextlnt();
System.out.print("Enter second number:");
int num2= sc.nextlnt();
System.out.println("Result:"+(num1+ num2));
break;
case 2: // Subtraction
System.out.print("Enter first number:");
num1= sc.nextlnt();
System.out.print("Enter second number:");
num2= sc.nextint();
System.out.println("Result:"+(num1-num2));
break;

case 3: // Multiplication
System.out.print("Enter first number:");
num1= sc.nextint();
System.out.print("Enter second number:");
num2 = sc.nextint();
System.out.println("Result:"+(num1*num2));
break;

case 4: // Division
System.out.print("Enter numerator: ");
num1= sc.nextlnt();
System.out.print("Enter denominator: ");
num2=sc.nextint();
if (num2==0){
System.out.println("Error: Division by zero is not allowed!");
} else {
System.out.println("Result:"+((double) num1 / num2));
break;

case 5: // Exit

System.out.println("Exiting the program.

Goodbye!");

break;

default:

System.out.println("Invalid choice! Please select a valid option.");
}
} while(choice != 5);
sc.close();
}
}