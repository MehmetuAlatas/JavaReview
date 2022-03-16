package objectManipulations;

import java.util.Scanner;

public class Runner03 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("type the name and press enter then type lastname");

        Person person=new Person(scan.nextLine(), scan.nextLine());
        System.out.println(getmail(person));
    }
    public static String getmail(Person p){
      return  ((p.name+p.lastname+"@gmail.com").toLowerCase().replaceAll(" ",""));
    }


}
