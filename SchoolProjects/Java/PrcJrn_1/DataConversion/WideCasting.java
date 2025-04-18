public class WideCasting {

    public static void main(String[] args) {
        byte by = 127;
        short sh = by;
        int in = sh;
        long lo = in;
        float flo = lo;
        double dou = flo;
        
        System.out.println("byte : " + by);
        System.out.println("short : " + sh);
        System.out.println("int : " + in);
        System.out.println("long : " + lo);
        System.out.println("float : " + flo);
        System.out.println("double : " + dou);
    }
}

/*
NOTE :
- WIDE CASTING IS FROM SMALLEST TO BIGGEST DATATYPE NUMBER
*/