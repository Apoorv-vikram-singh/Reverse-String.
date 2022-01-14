import java.util.*;
public class revString 
{
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        int len=A.length();
        for(int i=len-1;i>=0;i--)
        {
            char a=A.charAt(i);
            rev=rev+a;
        }
        if(A.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
