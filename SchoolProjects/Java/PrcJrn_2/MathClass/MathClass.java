public class MathClass {

    public static void main(String[] args) {
        int a = 9, x = 0, y = 10, z = -100;
        
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int absolute = Math.abs(z);
        double sqrt = Math.sqrt(a);
        
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("minimum : " + min);
        System.out.println("maximum : " + max);
        System.out.println("absolute(removes negative) : " + absolute);
        System.out.println("square root : " + sqrt);
        
        double b = 1.50;
        double round = Math.round(b);
        System.out.println(b + " to round (dynamic) : " + (int) round);
        b = 1.01;
        int ceil = (int) Math.ceil(b);
        System.out.println(b + " to round up (always) : " + ceil);
        b = 1.99;
        int floor = (int) Math.floor(b);
        System.out.println(b + " to round down (always) : " + floor);
    }
}