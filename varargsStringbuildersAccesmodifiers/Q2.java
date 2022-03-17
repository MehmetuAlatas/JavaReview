package day21varargsStringbuildersAccesmodifiers;

public class Q2 {
    public static void main(String[] args) {
        //Write a code that adds given integers except the first one
        // and multiplies with the first integer.
    jum(2,1,2,3,4);

    }

    public static void jum(int a,int...b){

        int sum=0;
        for(int w:b){
            sum+=w;
        }
        int result=a*sum;
        System.out.println(result);
    }

}
