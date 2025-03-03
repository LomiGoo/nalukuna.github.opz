import java.util.Arrays;

public class libInvTrack {
     
     public static void main(String[] args) {
          int bookID[] = {501, 123, 678, 345, 123};
          System.out.println("Library Inventory Tracker");
          System.out.println("---------------------------");
          System.out.println("Original Book IDs : " + Arrays.toString(bookID));
          
          int copyBookID[] = Arrays.copyOf(bookID, 3);
          
          Arrays.sort(bookID);
          System.out.println("Sorted Book IDs : " + Arrays.toString(bookID));
          
          int search = Arrays.binarySearch(bookID, 345);
          System.out.println("Binary Search for " + bookID[search] + " : Book found at index " + search);
          
          
          System.out.println("Copied Array (First " + copyBookID.length + " IDs) : " + Arrays.toString(copyBookID));
          
          Arrays.fill(bookID, 0);
          System.out.println("Filled Backup Array : " + Arrays.toString(bookID));
          
          boolean check = Arrays.equals(bookID, copyBookID);
          
          String display = check == true ? "true" : "false";
          
          System.out.println("Are original and backup inventories the same? " + display);
          
     }
}