package day21varargsStringbuildersAccesmodifiers;

import java.time.LocalTime;

public class Q313 {
    public static void main(String[] args) {

        long time1=System.nanoTime();
        System.out.println(time1);
        String str="u";
        for(int i = 0;i<1000;i++){
            str+=" ";
        }

        long time2=System.nanoTime();
        System.out.println(time2);

    }

}
