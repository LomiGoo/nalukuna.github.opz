package Main;
import Skibidi.Skibidi;

public class Main {
     static void hi() {
          System.out.println("hi");
     }
     public static void main(String[] args) {
          Skibidi ski = new Skibidi();
          Skibidi.saySkibidi();
          hi();
          
          System.out.println(ski.age);
	}
}