import java.util.ArrayList;
public class wrapperClass {

    public static void main(String[] args) {
        ArrayList<Integer> ent = new ArrayList<>();
        
        ent.add(1);
        ent.add(2);
        
        int sum = ent.get(0) + ent.get(1);
        
        System.out.println("sum from array list num : " + sum);
    }
}