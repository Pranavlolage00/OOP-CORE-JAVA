import java.util.*;
class Power
{
    static int Pow(int x,int y)
    {
        if(y==0)
          return 1;
        else
          return (x*Pow(x,y-1));
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of X:");
        int x=sc.nextInt();
        System.out.println("Enter value of Y:");
        int y=sc.nextInt();
        int ans=Pow(x,y);
        System.out.println(x+"^"+y+"="+ans);
    }
}