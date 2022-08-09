import java.util.*;
public class Methodsin{
public static void main(String[] args){
        Scanner value1=new Scanner(System.in);
        System.out.println("enter the first number");
        int n=value1.nextInt();
        Scanner value2=new Scanner(System.in);
        System.out.println("enter the second number");
        int m=value2.nextInt();
        Scanner value3=new Scanner(System.in);
        System.out.println("enter the third number");
        int t=value3.nextInt();
        double sinetheta=(Math.sin(n));
        System.out.println(sinetheta);
        double cosinetheta=(Math.cos(m));
        System.out.println(cosinetheta);
        double tantheta=(Math.tan(t));
        System.out.println(tantheta);
        }

        public static double sinetheta(double n){
    return (n);
    }
    public static double cosinetheta(double m){
        return (m);
    }
    public static double tantheta(double t){
        return (t);
    }

}