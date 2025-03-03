import java.util.Scanner; 

public class prodInvSearch {
     
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          
          int productID[] = {100, 101, 102, 103, 104, 105};
     System.out.print("Enter Product ID to search : ");
     int res = s.nextInt();
     int i = 0;
     boolean found = false;
     
          while(i < productID.length) {
               if(res == productID[i]) {
                    found = true;
                    break;
               } 
               i++;
          }
          String result = (found == true) ? "Product found at index : " + i : "Product not found.";
          System.out.println(result);
     }
}