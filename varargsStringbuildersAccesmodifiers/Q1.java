package day21varargsStringbuildersAccesmodifiers;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
    public static void main(String[] args) {
        //Find the smallest positive integer and greatest negative integer in a given integer list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);
        System.out.println(list);// [-12, 18, -5, 23, -2]
        Collections.sort(list);

        System.out.println(list);
        int min=Integer.MAX_VALUE;

        for(int w :list){
            if(min>w && w>0){
                min=w;
            }
        }
        System.out.println(min);

        System.out.println(list.indexOf(18));
        System.out.println(list.get(2));

        //Type a code that joins the given Strings
        //input => "Dear", "Ali", "Can", "we", "miss", "you"
        //output => "Dear Ali Can we miss you"

        join("mehmet","ugur");

    }

    public static void join(String...str){
        String s="";
        for(String x:str){
            s+=x;
        }
        System.out.println(s);
    }

}
