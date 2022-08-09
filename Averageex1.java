public class Averageex1{
    public static void main(String[] args) {
        int r;
       int sum =0;
        int[] number = {89, 56, 33, 90, 45};
        int array = number.length;
        for (r = 0; r<number.length; r++) {
            sum = sum + r;
        }
        int average=sum/array;
        System.out.println( average );

    }

}