package objectManipulations;

import java.util.Scanner;

public class MainRunner {

    public static void main(String[] args) {
        /*
        Type a program that asks user their name and lastname, then create an email for the user
        Concenate the name and lastname then add@gmail.com
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("TYPE YOUR FİRST NAME AND PRESS ENTER\n" +
                "TYPE YOUR LAST NAME AND PRESS ENTER");
        String first=scan.next();
        String last=scan.next();

//     String result =getmail(first,last);
//        System.out.println(result);
        System.out.println(getmail(first,last));

    }
    public static String getmail(String first, String last){

        return  (first+last+"@gmail.com").toLowerCase();
    }

}
