import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String s1=sc.nextLine();
        int a[]=new int[122];

        for(int i=0; i<122; i++)
        {
           a[i]=0;
        }
        for(int i=0; i<s1.length(); i++)
        {
           char ch=s1.charAt(i);
           a[ch]+=1;
        }
        for(int i=0; i<122; i++)
        {
            if(a[i]!=0)
            {
                System.out.printf("\n %c=%d",i,a[i]);
            }
        }
    }
}