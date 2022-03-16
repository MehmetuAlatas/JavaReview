package objectManipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner02 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        List<String> lastname=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Type 2 name ");
        for(int i=1;i<3;i++){
            name.add(scan.nextLine());
        }
        System.out.println("Type 2 lastname ");
        for(int i=1;i<3;i++){
            lastname.add(scan.nextLine());
        }
        System.out.println(getmail(name,lastname));

    }

    public static List<String> getmail(List<String>name,List<String>lastname){
        List<String>email=new ArrayList<>();
        for (int i=0;i<name.size();i++){
            email.add((name.get(i)+lastname.get(i)+"@gmail.com").toLowerCase());
        }
        return email;
    }

}
