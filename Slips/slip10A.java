import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=sc.next();
        int f[]=new int[s1.length()];
        char a[]=s1.toCharArray();
        for(int i=0; i<s1.length(); i++)
        {
             f[i]=1;
             for(int j=i+1; j<s1.length(); j++)
             {
                if(a[i]==a[j])
                {
                    f[i]++;
                    a[j]='0';
                }
             }
        }
        System.out.println("String Frequancy..");
        for(int i=0; i<s1.length(); i++)        
        {
            if(a[i]!='0')
            {
                System.out.println(a[i]+" "+f[i]);
            }
        }
    }
}
