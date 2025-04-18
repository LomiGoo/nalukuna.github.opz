import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<Integer, String> customer = new HashMap<>();
        
        customer.put(100, "Chib");
        customer.put(101, "chob");
        customer.put(102, "chayb");
        customer.put(102, "chagayb");
        System.out.println(customer.keySet() + " : " + customer.values());
        System.out.println();
        
        customer.remove(102);
        for(int cus : customer.keySet()) {
            System.out.println(cus + " : " + customer.get(cus));
        }
        
        System.out.println();
        
        if(customer.containsKey(101)) System.out.println("huli ka");
        else System.out.println("wala luds");
        
        System.out.println();
        
        String name = customer.get(100);
        if(customer.containsValue(name)) System.out.println("hi " + name);
        else System.out.println("wala lodikiks");
    }
}