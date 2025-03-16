package inherit;

public class Car {
     public static void pln(String t) {
          System.out.println(t);
     }
     
     public static void p(String t) {
          System.out.println(t);
     }
     
     String name, color;
     boolean isBoostAl = true;
     
     Car(String name, String color) {
          this.name = name;
          this.color = color;
     }
     
     String getName() {
          return name;
     }
     
     String getColor() {
          return color;
     }
     
     boolean booster() {
          return isBoostAl;
     }
     
     void displayComInf() {
          pln("name : " + name);
          pln("color : " + color);
          pln("booster allowed : " + booster());
     }
     
     void displaySingle() {
          pln("name : " + name);
          pln("color : " + color);
          pln("booster allowed : " + booster());
          pln("RPM : N/A");
          pln("weight : N/A");
          pln("sound : N/A");
     }
}