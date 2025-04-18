public class Printf {

static void sp() {
    System.out.println();
}
    public static void main(String[] args) {
        String name = "chib";
        char charac = 'A';
        int num = 1000;
        double dobnum = 1050.00000;
        boolean bool = false;
    
    // CONVERT VARIABLE DATAS TO PRINT DIRECTLY
    System.out.println("@ CONVERT SECTION @");
        System.out.printf("%s", name);
        sp();
        System.out.printf("%c", charac);
        sp();
        System.out.printf("%d", num);
        sp();
        System.out.printf("%f", dobnum);
        sp();
        System.out.printf("%b", bool);
        sp();
        sp();
        
    // NUMBER PRECISION
    System.out.println("@NUMBER PRECISION SECTION @");
        System.out.printf("%.1f", dobnum);
        sp();
        System.out.printf("%.5f", dobnum);
        sp();
        System.out.printf("%,.2f", dobnum);
        sp();
        sp();
    
    // WIDTH (SETTING SPACE LEFT OR RIGHT)
    System.out.println("@ WIDTH SETTER @");
        System.out.printf("NAME : " + "%10s", name);
        sp();
        System.out.printf("AGE  : " + "%10s", num);
        sp();
    
    // FLAGS
    System.out.println("@ FORMATTER @");
        System.out.printf("AGE  : " + "%-15d" + "x", num);
        sp();
        System.out.printf("%+f", dobnum); // or %-f
        sp();
        System.out.printf("%,d", num);
        sp();
    }
}