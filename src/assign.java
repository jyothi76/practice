/*import java.lang.*;
public class assign {
    public static void main(String[] args) {
        java.lang.String s1 = "Test1 Test2 Test3 Test4";
        String[] s2= s1.split(" ");
        for(int i=s2.length-1;i>=0;i--){
            System.out.print(s2[i]);
            if(i!=0)
                System.out.print(" ");
        }

    }
}
*/
public class assign {
    public static void main(String[] args) {
        String s1 = "Test1 Test2 Test3 Test4";
        int n = s1.length();
        System.out.println(s1.substring(0,n/2));
    }
}


