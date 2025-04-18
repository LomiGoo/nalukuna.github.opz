public class Recursion {

    public static void main(String[] args) {
        
        sayHey(5);
        System.out.println();
        
        String names[] = {"chib", "chob", "chayb"};
        arrayDisplay(names, 0);
    }
    
    static void sayHey(int count) {
            if(count == 0) return; 
            
            System.out.println("hey");
            sayHey(--count);
        }
        
    static void arrayDisplay(String[] array, int i) {
        if(i == array.length) return;

        System.out.println("index : " + i);
        System.out.println("name : " + array[i]);
        System.out.println();
        
        arrayDisplay(array, ++i);
    }
}