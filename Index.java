public class Index{
    public static void main(String [] args){
        int t;
        int sum=0;
        int[] numbers ={5,8,0,2,4,7};
        for(t=0;t<numbers.length;t++) {
            sum = sum + numbers[t];
        }
            System.out.println(sum);

    }
}