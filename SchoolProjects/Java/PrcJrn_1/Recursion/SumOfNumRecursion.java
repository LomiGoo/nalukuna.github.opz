import java.util.ArrayList;

public class SumOfNumRecursion {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        
        System.out.print("sum : ");
        sumOfNum(num, 0, 0);
    }

    static void sumOfNum(ArrayList<Integer> AL, int i, int sum) {
            if(i == AL.size()) {
                System.out.println(sum);
                return;
            }
            
            sum += AL.get(i);
            
            sumOfNum(AL, ++i, sum);
    }
}