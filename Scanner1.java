import java.util.*;
public class Scanner1 {
    public static void main(String[] args) {
        Scanner Welcome = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = Welcome.nextInt();
        System.out.println("Enter the  num2");
        int num2 = Welcome.nextInt();

        int output = num1+num2;
        System.out.println(output);
    }
}
