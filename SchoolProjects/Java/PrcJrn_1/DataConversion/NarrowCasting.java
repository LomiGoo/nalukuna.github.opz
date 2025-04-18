public class NarrowCasting {

    public static void main(String[] args) {
        double dou;
        float flo;
        long lo;
        int in;
        short sh;
        byte by;
        
        flo = 345.1f;
        by = (byte) flo;
        
        lo = 999999999;
        sh = (short) lo;
        System.out.println("byte : " + by);
        
        System.out.println("short : " + sh);
        /*
        System.out.println("int : " + in);
        System.out.println("long : " + lo);
        System.out.println("float : " + flo);
        System.out.println("double : " + dou);
        */
    }
}

/*
NOTE :
- LOSSY CONVERSION
- BIGGEST TO SMALLEST DATATYPE NUMBER
*/