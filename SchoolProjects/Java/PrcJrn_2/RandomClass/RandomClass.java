import java.util.Random;

class wish {
    static void pullMessage() {
        if(RandomClass.randomize == 6) {
            System.out.print("DETECTED = SEEEEEEIGSSSS\n\n");
        }
    }
}
public class RandomClass {
    static int randomize;
    
    public static void main(String[] args) {
        Random r = new Random();
        
        int counter = 0;
        
            while(counter != 50) {
                randomize = r.nextInt(6) + 1;
                System.out.println(randomize);
                wish.pullMessage();
                counter++;
            }
    }
}

// NOTE : YOU CAN ALSO USE r.nextBoolean();