public class Private{
    public static void main(String[] args){
     Ram mob1= new Ram("oppo",12000,8,"filpkard");
     Ram mob2= new Ram("redmi",23000,9,"amzon");
     Ram mob3=new Ram("realme",170000,9,"meeso");
        System.out.println(mob1);
        mob1.setPrice(70000);
        System.out.println(mob1.getPrice());
        System.out.println(mob2);
        mob2.setName("realme");
        System.out.println(mob2.getName());
        System.out.println(mob3);
        mob3.setRam_gb(56);
        System.out.println(mob3.getRam_gb());
    }
}
class Mobile {
    private String name;
    private int price;
    private int ram_gb;
    private String shop;

    Mobile(String _name, int _price, int _ram_gb, String _shop) {
        name = _name;
        price = _price;
        ram_gb = _ram_gb;
        shop = _shop;
    }

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

    public int getRam_gb() {
        return ram_gb;
    }

    public void setRam_gb(int ram_gb) {
        this.ram_gb = ram_gb;
    }
    public String getShop() {
        return shop;
    }
    public void setShop(String shop) {
        this.shop = shop;
    }
}

//    private String shop;
//   Mobile(String _name,int _price,int _ram_gb,String _shop){
//        name = _name;
//        price = _price;
//        ram_gb = _ram_gb;
//        shop = _shop;
//    }
//}