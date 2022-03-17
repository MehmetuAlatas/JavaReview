package day21varargsStringbuildersAccesmodifiers;

public class Review {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("mehmet").append(" ben");

        StringBuilder sb1 = new StringBuilder("veli ");
        sb1.append("ahmet").append(" sen");

        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1, "u");
        System.out.println(sb);
        sb.replace(0, 0, "ah");
        sb.reverse();
        sb.delete(0, 4);
        sb.deleteCharAt(7);
        sb.substring(0, 3);
        System.out.println(sb.substring(2));


        StringBuilder numbers = new StringBuilder("012345678");
        System.out.println(numbers.substring(1, 3)); //12
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));//78
        /*  What are the results of the following code? (Chose all that apply)
        A. 12
        B. 123
        C. 7
        D. 78
        E. A blank line.
        F. An exception is thrown
        G. The code does not compile         */


    }

}
