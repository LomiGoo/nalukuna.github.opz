import java.util.Arrays;

public class arrayToolBoxChal {
     
     public static void main(String[] args) {
          int num[] = {5, 9, 2, 1, 4, 6, 0};
          int newNum[] = Arrays.copyOf(num, 4);
          
          System.out.println("original : " + Arrays.toString(num));
          Arrays.fill(num, 5);
          System.out.println("filled in : " + Arrays.toString(num));
          System.out.println("copied : " + Arrays.toString(newNum));
          
          Arrays.sort(newNum);
          System.out.println("sorted : " + Arrays.toString(newNum));
          int search = 2;
          int index = Arrays.binarySearch(newNum, search);
          
          System.out.println("Element " + search + " found at index : " + index);
          
          int numEqual1[] = {1, 2, 3, 4, 5};
          int numEqual2[] = {1, 2, 3, 4, 5};
          boolean equality = Arrays.equals(numEqual1, numEqual2);
          
          String res = equality == true ? "numEqual1 and numEqual2 are equal." : "not equal.";
          
          System.out.println(res);
     }
}