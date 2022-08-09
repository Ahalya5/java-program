public class Average{
    public static void main(String[] args){
        int[] array ={5,20,47,98,56};
    int p;
    int sum=0;
    int number=array.length;
    for(p=0;p<array.length;p++)

    {
        sum = sum + p;
    }
    int average=sum/number;
    System.out.println(average);
    }
}