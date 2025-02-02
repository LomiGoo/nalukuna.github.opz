/* DATOON JAZMINE A
11 ICT FORTRAN
*/

public class FruitObjects {
    public static void main(String[] args) {
        Fruit fruitObject = new Fruit();
        
       
        fruitObject.setName("APPLE");
        fruitObject.setColor("RED");
        fruitObject.setPrice(25);

        System.out.println(fruitObject.getName());
        System.out.println(fruitObject.getColor());
        System.out.println(fruitObject.getPrice());

        fruitObject.setName("MANGO");
        fruitObject.setColor("YELLOW");
        fruitObject.setPrice(30);

        System.out.println(fruitObject.getName());
        System.out.println(fruitObject.getColor());
        System.out.println(fruitObject.getPrice());

        fruitObject.setName("ORANGE");
        fruitObject.setColor("ORANGE");
        fruitObject.setPrice(20);

        System.out.println(fruitObject.getName());
        System.out.println(fruitObject.getColor());
        System.out.println(fruitObject.getPrice());

        fruitObject.setName("AVOCADO");
        fruitObject.setColor("GREEN");
        fruitObject.setPrice(35);

       
        System.out.println(fruitObject.getName());
        System.out.println(fruitObject.getColor());
        System.out.println(fruitObject.getPrice());
    }
}

class Fruit {
    private String name;
    private String color;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
