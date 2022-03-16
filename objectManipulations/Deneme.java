package objectManipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deneme {
    /*ask user to type 2 names and 2 lastnames then concatenate
them to create emails use @gmail.com at the end*/
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Type three names");
        List<String> names=new ArrayList<>();
        for(int i=0;i<3;i++){
               names.add(scan.next());
        }
        List<String>lastnames=new ArrayList<>();
        System.out.println("Type three lastnames");
        for(int i=0;i<3;i++){
            lastnames.add(scan.next());
        }
        System.out.println("EMAİL İDS :"+getmails(names,lastnames));



    }
    public static List<String> getmails(List<String> names,List<String>lastnames){
        List<String>email=new ArrayList<>();
        for(int i=0;i<names.size();i++){
            email.add((names.get(i)+lastnames.get(i)+"@gmail.com").toLowerCase());
        }
        return email;
    }


}
