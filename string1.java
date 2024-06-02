import java.util.*;
class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s1=sc.nextLine();
        char s2[]=s1.toCharArray();
       for(int i=0; i<s2.length; i++)
       {
           if(s2[i].isUpperCase())
                s2[i].toLowerCase();
        }

        
        
    }
}