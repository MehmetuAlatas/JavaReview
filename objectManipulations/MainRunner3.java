package objectManipulations;

import java.util.Scanner;

public class MainRunner3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your name and lastname");
        Person person1 = new Person(scan.next(),scan.next());

        generateEmail(person1);

    }
    public static void generateEmail(Person person){
        System.out.println(person.name+person.lastname+"@)gmail.com");
    }
}
