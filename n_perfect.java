import java.util.*;
class perfect
{
    void check(int n)
    {
        int i=1;
        while(i<=n)
        {
           int s=0,num=i;
            for(int j=2; j<num; j++)
            {
                if(num%j==0)
                {
                    s=s+i;
                }                
            }
            if(num==s)
                {
                  System.out.println("\t"+s);
                }
                i++;
        }
            
        }
    public static void main(String args[])
    {
        perfect ob=new perfect();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        ob.check(n);
    }
}