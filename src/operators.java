import javax.sound.midi.Soundbank;

public class operators {
    public static void main(String[] args) {
        int a=4, b=3;
        System.out.println(~a);
        System.out.println(5/3);
        System.out.println(5%3);
        System.out.println(5*3);
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(--b);
        a*=3;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a%=2;
        System.out.println(a);
        System.out.println(a>b);
        System.out.println((a<b));
        System.out.println((a!=b));
        System.out.println(true&&false);
        System.out.println(true!=false);
        System.out.println(true||false && true );
        System.out.println(a);
        System.out.println(b);
        System.out.println(a>b ? "true ":"false ");
        String s="asdf";
        if(s instanceof String)
        {
            System.out.println("trueee");
        }
    String s2="jyothisomasnaii";
        if(s2.length()%2==0)
            System.out.println("even ");
        else
            System.out.println("odd");

        if (a>b)
            System.out.println("a is greater");
        else if (a<b)
            System.out.println("b is greater ");
        else
        {
            System.out.println("equal");
        }
        int age=4;
        if(age>0){
            if(age>18)
                System.out.println("he can vote ");
            else
            {
                System.out.println("he cannot ");
            }
        }
        }
}
