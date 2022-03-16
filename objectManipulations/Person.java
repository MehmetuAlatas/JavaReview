package objectManipulations;

public class Person {

    public String name;
    public String lastname;
    private int id;
    private int age;
    private double salary;

    public Person(){

    }
    public Person (String name, String last ){
      this.name=name;
      lastname=last;
    }
    public static void main(String[] args) {

        Person person=new Person("maha","wael");
        System.out.println(person.name);
        System.out.println(person.lastname);

    }
}
