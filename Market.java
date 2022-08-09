import java.util.*;
class Vegtable{
    String name;
   static String colour;
   static  int price;
    int kg;
}
    Vegtable(String name,String colour,,int price,int kg) {
        name = name;
        colour = colour;
        price = price;
        kg = kg;
        public void setName (String name){
            this.name = name;
        }
        public String getname () {
            return name;
        }
        public static void setColour (String colour){
            this.colour = colour;
        }
        public static String getColour() {
            return colour;
        }
        public static void setPrice ( int price){
            this.price = price;
        }
        public static int getPrice () {
            return price;
        }
        public void setKg ( int kg){
            this.kg = kg;
        }
        public int getKg () {
            return kg;
        }
    }
public class Market {
    public static void main(String[] args) {
        Vegtable veg1 = new Vegtable("corot", "orange", 90, 2);
        Vegtable veg2 = new Vegtable("pees","green",28,1);
        Vegtable veg3 = new Vegtable("tomoto","red",200,3);
        System.out.println(veg1);
        System.out.println(veg3);
        System.out.println(veg2.name);
        veg1.setName("redgily");
        System.out.println(veg2.getName());
        System.out.println(veg3.getName());
        veg3.setColour("red");
        System.out.println(veg2.getColour());
        System.out.println(veg1.getColour());
    }
}


