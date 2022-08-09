public class Methods {
    public static void main(String[] args) {
        welcome();
        name("ram", 29);
        names("amma", "appa", 10);
        int[] num = {4, 89, 34, 20,67};
        String[] value = {"ahalya", "ram"};
        method4(num, value);
        int[] test={8,9,6,3,5};
        String[] friend={"amirtha","keerthi","vishali"};
        list("ahalya",21,test,friend);

    }

    public static void welcome() {
        System.out.println("welcome to all");
    }
    public static void name( String username,int age){
        System.out.println(username);
        System.out.println(age);
    }
    public static void names(String firstname,String secondname,int total){
        System.out.println(firstname);
        System.out.println(secondname);
        System.out.println(total);
    }
    public static void method4( int[] num, String[] value) {
        for (int l = 0;l < num.length;l++) {
            System.out.println(num[l]);
        }
        for (int v = 0;v < value.length;v++) {
            System.out.println(value[v]);

        }
    }
    public static void list( String username, int age ,int[] test,String[] friend){
        System.out.println(username);
        System.out.println(age);
    for(int r=0;r<test.length;r++)
    {
        System.out.println(test[r]);
    }
    for(int e=0;e<friend.length;e++)
    {
        System.out.println(friend[e]);
    }
    }
}
