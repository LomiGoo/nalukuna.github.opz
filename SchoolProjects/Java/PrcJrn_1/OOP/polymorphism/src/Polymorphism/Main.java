package Polymorphism;

public class Main {
     public static void main(String[] args) {
          //vehicle v = new vehicle();
          vehicle c = new car();
          vehicle m = new motorcycle();
          
          c.engineStart();
          m.engineStart();
          
     }
}