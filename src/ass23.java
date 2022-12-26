import java.util.*;
public class ass23 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an year");
        int n =s.nextInt();
        boolean res=false;
        if(n%4==0){
            res=true;
            if(n%100==0) {
                if (n % 400 == 0)
                    res = true;
                else
                    res = false;
            }}
            if(res)
                System.out.println("Entered year "+n + " is a leap year");
            else
                System.out.println("Entered year "+n + " is not a leap year ");
    }}

  /*Scanner s =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n =s.nextInt();
        if(n%5==0 && n%3==0)
            System.out.println("FizzBuzz");
        else {
            if(n%3==0)
                System.out.println("Fizz");
            if(n%5==0)
                System.out.println("Buzz");
    }

  int a=15,b=5;
    double c=45.89,d=42.3;
        System.out.println("+ operator :sum is "+(a+b)+"for int values  and "+(c+d)+" for double value ");
                System.out.println("- operator :difference is  "+(a-b)+" for int values and "+(c-d )+"for double values ");
                System.out.println("* operator: multiply is  "+(a*b)+" for int values and "+(c*d )+"for double values ");
                System.out.println("- operator :division is  "+(a/b)+" for int values and "+(c/d )+"for double values ");
                System.out.println("- operator :modulus is  "+(a%b)+" for int values and "+(c%d )+"for double values ");
                System.out.println("+= operator "+( a+=b));
                System.out.println("+= operator "+ (c+=44.2));
                System.out.println("-= operator "+( a-=b));
                System.out.println("-= operator "+ (c-=44.2));
                System.out.println("*= operator "+( a*=b));
                System.out.println("*= operator "+( c*=d));
                System.out.println("/= operator "+( a/=b));
                System.out.println("/= operator "+( c/=d));
                System.out.println("%= operator "+( a%=b));
                System.out.println("%= operator "+( c%=d));
                System.out.println("preincreament operator "+(a++));
                System.out.println("post increament operator"+(a++));
                System.out.println("unary minus "+(-a));
                System.out.println("post decreament operator"+(a--));
                System.out.println("post decreament operator"+(--a));
                boolean b1=true;
                System.out.println("! operator "+(!b1));
                System.out.println("relational <="+(a<=b));
                System.out.println("relational <="+(c<=d));
                System.out.println("relational >="+(a>=b));
                System.out.println("relational >="+(c>=d));
                System.out.println("relational <"+(a<b));
        System.out.println("relational <"+(c<d));
        System.out.println("relational >"+(a>b));
        System.out.println("relational >"+(c>d));
        System.out.println("relational =="+(a==b));
        System.out.println("relational =="+(c==d));
        System.out.println("relational !="+(a!=b));
        System.out.println("relational !="+(c!=d));
        System.out.println("conditional operator &&"+((7<8) && (13>5)));
        System.out.println("conditional operator || "+((5<3 )||(8<0)));
        System.out.println("conditional operator "+(!(2==3)));
        System.out.println("ternary "+ ((a>b) ? "a is great" : "b is great"));
        System.out.println("ternary "+ ((c==d) ? "both are equal " : "both are not equal"));
        String s1="welcome";

        System.out.println("Instance of welcome is a string "+ s1 instanceof String );


*/