public class LogicalOps {

    public static void main(String[] args) {
    // BOTH CONDITION NEEDS TO BE TRUE
        String person = "pogi";
        double height = 5.5;
        boolean isPogi = person.equalsIgnoreCase("pogi");
        
        if(isPogi && height == 5.5) {
            System.out.println("pogi nga");
        } else {
            System.out.println("hindi pogi");
        }
    
    // EITHER 1 CONDITION NEEDS TO BE TRUE
        person = "cooked";
        height = 4.1;
        isPogi = person.equalsIgnoreCase("pogi");
        
        if(isPogi || height == 5.5) {
            System.out.println("pogi nga");
        } else {
            System.out.println("hindi pogi");
        }
    
    // REVERSES CONDITION, TRUE BECOME FALSE AND VICE VERSA
        person = "pogi";
        height = 4.1;
        isPogi = person.equalsIgnoreCase("cooked");
        
        if(!isPogi) {
            System.out.println("hindi nga pogi");
        } else {
            System.out.println("pogi nga");
        }
    }
}