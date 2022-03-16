package objectManipulations;

import java.util.ArrayList;
import java.util.List;

public class MainRunner4 {
    public static void main(String[] args) {
         /*ask user to type 3 names and 3 lastnames then concatenate
them to create emails use @gmail.com at the end   */
        List<Person> people=new ArrayList<>();
        Person person1=new Person("Mehmet","ugur");
        Person person2=new Person("ahmet","can");
        Person person3=new Person("veli","han");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println(people.size());

//        for(Person w:people){
//            System.out.println(w.name);
//            System.out.println(w.lastname);
//        }

        for(int i=0; i<people.size();i++){
            System.out.println(people.get(i).name);
            System.out.println(people.get(i).lastname);
        }

        System.out.println(generateEmail(people));

    }

    public static List<String> generateEmail(List<Person>people){

            List<String>emails=new ArrayList<>();

//        System.out.println(people.get(0).name+people.get(0).lastname+"@gmail.com");
//        System.out.println(people.get(1).name+people.get(1).lastname+"@gmail.com");
//        System.out.println(people.get(2).name+people.get(2).lastname+"@gmail.com");


        for(Person eachperson:people){
           emails.add((eachperson.name+eachperson.lastname+"@gmail.com").toLowerCase());
        }
        return emails;
    }

}
