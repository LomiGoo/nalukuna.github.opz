/*
SACRO REGZON KENN S.
11 - ICT FORTRAN 
JANUARY 24 2025
*/

// Main.java
public class main {
    public static void main(String[] args) {
        // Creating fruit objects
        Fruit apple = new Fruit("Apple", "Red", 25);
        Fruit mango = new Fruit("Mango", "Yellow", 30);
        Fruit orange = new Fruit("Orange", "Orange", 20);
        Fruit avocado = new Fruit("Avocado", "Green", 35);

        // Displaying fruit properties in a table format
        System.out.println("Fruit Properties:");
        System.out.println("+------------+--------+-------------+");
        System.out.println("| Fruit      | Color  | Price (PHP) |");
        System.out.println("+------------+--------+-------------+");
        System.out.println("| " + apple.getName() + "       | " + apple.getColor() + "    | P" + apple.getPrice() + "         |");
        System.out.println("| " + mango.getName() + "       | " + mango.getColor() + "    | P" + mango.getPrice() + "         |");
        System.out.println("| " + orange.getName() + "      | " + orange.getColor() + "    | P" + orange.getPrice() + "         |");
        System.out.println("| " + avocado.getName() + "     | " + avocado.getColor() + "    | P" + avocado.getPrice() + "         |");
        System.out.println("+------------+--------+-------------+");
            

    }
}

// Fruit.java
class Fruit {
    private final String name;
    private final String color;
    private final int price;

    // Constructor
    public Fruit(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}