import java.util.*;
public class Arraylistex3 {
    public static void main(String[] args) {
        Ram m1 = new Ram();
        m1.setName("redmi");
        m1.setPrice(89000);
        System.out.println(m1.getName());
        Ram m2 = new Ram();
        m1.setName("oppo");
        m2.setPrice(89000);
        System.out.println(m2.getPrice());
        Ram m3 = new Ram();
        m3.setPrice(9000);
        m3.setName("redmi8a");
        System.out.println(m3.getName());
        ArrayList<Ram> mo = new ArrayList<>();
        mo.add(m1);
        mo.add(m2);
        mo.add(m3);
        for (Ram m : mo) {
            System.out.println("Mobile is:" + m.getName());
            System.out.println("Mobile price is:" + m.getPrice());
            System.out.println("Mobile name is:" + m.name);
            System.out.println("mobile best:" + m1.name);
            System.out.println("mobile best:" + m2.price);
            System.out.println("mobile best:" + m3.name);
            System.out.println("mobile best:" + m1.price);
        }
    }
}

class Ram {
    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}