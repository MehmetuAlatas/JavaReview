package objectManipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {/*ask user to type 2 names and 2 lastnames then concatenate
them to create emails use @gmail.com at the end*/

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> lastname = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type two names");

        for(int i=1;i< 3;i++){
            names.add(scan.next());
        }
        System.out.println("Please type two lastname");
        for(int i=1;i< 3;i++){
            lastname.add(scan.next());
        }

        System.out.println("user names :"+names);
        System.out.println("user lastnames :"+lastname);
        System.out.println("email ids  : "+generateEmail(names,lastname));

    }
    public static List<String> generateEmail(List<String >names,List<String>lastnames){

        List<String>emails=new ArrayList<>();
        for(int i =0;i<names.size();i++){
            emails.add(names.get(i)+lastnames.get(i)+"@gmail.com");
        }
            return emails;
    }

}
