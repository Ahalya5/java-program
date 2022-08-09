public class Arrayex3{
    public  static void main(String [] args){
        double[] r ={123,243,234,567,893,780};
         int v;
        int number=r .length;
        for(v=0;v< r.length;v++)
            if(r[v]%2==1){
            System.out.println(r[v]);
        }
    }
}