import java.lang.*;
import java.sql.SQLOutput;

public class St{
    public static void main(String[] args) {
        String s1="sachin";
        s1.concat("s1");
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.charAt(4));
        System.out.println(s1.substring(2,6));
        String s2="test1 test2 test3 test4";
        System.out.println(s2.indexOf(" "));
        System.out.println(s2.substring(0,5));
        System.out.println(s2.lastIndexOf(" "));
        System.out.println(s2.substring (s2.lastIndexOf(" ")+1));


    }

}
