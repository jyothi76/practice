import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String str="";
        String str1="";
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string ");
        str=s.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        System.out.println("Reversed string " +str1);
        if(str.equals(str1))
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }

}
