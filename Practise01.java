package day23inheritance;
public class Practise01 {
    public void rest(){System.out.println("xxx");}
    int a=10;
    public Practise01(){    System.out.println("A");    }
    public Practise01 (int a){this(); //by using this you can do constructor call from inside class
        System.out.println("B");    }// this must be first statement in constructor body
}
class Practise02 extends Practise01{
  //  public void rest(){System.out.println("yyy");}
    int a=12;
    public Practise02(){        super(2);//Must be the first statement in the body
        System.out.println("C");    }  //You can use just one super constructor call in a contructor body
    public Practise02(int a){
        System.out.println("E");
    }
}
class Practise03 extends Practise02{
    int a=11;
    public Practise03(String s){    System.out.println("D");   }
  //  public void rest(){System.out.println("zzz");}
}
class Runner {
    public static void main(String[] args) {
        Practise03 p1 =new Practise03("Woow!");
        p1.rest();
        System.out.println(p1.a);//java selects variables by looking at the data type af the object
        //if a class does not have "a" java looks for "a" in parent classess if there is no "a" it will give error.
        Object obj4=new Practise03("woow");
//when creating object we can use parents class names for data types



    }
}
