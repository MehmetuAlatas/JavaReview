package objectManipulations;

import java.util.Scanner;

public class Runner01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Type your first name and lastname");
        String first= scan.next();
        String last = scan.next();
        System.out.println( getmail(first,last));
    }
    public static String getmail(String first,String last){

       return (first+last+"@gmailcom").toLowerCase();
    }
}
