import java.util.Scanner;
public class Methodvariable {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter the second number");
        int b = input2.nextInt();
        int c= add(a, b);
        System.out.println(c);
        int d= sub(a, b);
        System.out.println(d);
        int e= multi(a, b);
        System.out.println(e);
        int f= div(a, b);
        System.out.println(f);
    }

    public static  int add(int a, int b){
        return a+b;
    }

    public static  int sub(int a, int b) {
        return a-b;
    }

    public static int multi(int a, int b) {
        return a*b;
    }

    public static  int div(int a, int b) {
        return a/b;
    }
}
