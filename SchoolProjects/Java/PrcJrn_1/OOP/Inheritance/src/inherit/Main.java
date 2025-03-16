package inherit;

public class Main {
     public static void pln(String t) {
          System.out.println(t);
     }
     
     public static void p(String t) {
          System.out.println(t);
     }
     public static void main(String[] args) {
          Car c1 = new Car("BMW 2 series coupe", "gray");
          
          String bmwN = c1.getName();
          String bmwC = c1.getColor();
          boolean booster1 = c1.booster();
          booster1 = false;
          
          pln("name : " + bmwN);
          pln("color : " + bmwC);
          pln("booster allowed : " + booster1);
          pln("RPM : N/A");
          pln("weight : N/A");
          pln("sound : N/A\n");
          
          ferrari ferrari = new ferrari("Ferrari FX", "Dark Blue", "Godly");
          ferrari.displayComInf();
          pln("");
          
          mustang mus = new mustang("Mustang GT", "Blue", "Excellent");
          mus.displayComInf2();
          pln("");
          
          mustangBased mus2 = new mustangBased("Ford Falcon", "Red", "N/A");
          mus2.displayComInf();
          pln("");
          
          Car c2 = new mustangBased("Ford Galaxie Sedan", "Red", "N/A");
          c2.displaySingle();
     }
}