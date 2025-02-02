import java.awt.Color;

public class main {
    public static void main(String[] args) {
        // Predefined colors
        Color red = Color.RED;
        Color blue = Color.BLUE;

        // Custom colors using RGB values (0-255)
        Color customColor = new Color(128, 64, 255);

        // Custom colors using RGB with alpha (transparency, 0-255)
        Color transparentColor = new Color(128, 64, 255, 128);

        System.out.println("Red: " + red);
        System.out.println("Custom Color: " + customColor);
        System.out.println("Transparent Color: " + transparentColor);
    }
}