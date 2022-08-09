import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        int[] numbers = {9, 90,67, 44, 19, 60};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 2]);

    }
}