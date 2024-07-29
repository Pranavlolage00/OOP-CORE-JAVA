import java.util.*;
class Demo
{
    int power(int x,int y)
    {
        if(y==0)
           return 1;
        else
           return x*power(x,y-1);
    }
    public static void main(String argp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of X Y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Demo ob=new Demo();
        System.out.println("Base to Power="+ob.power(x,y));
        
    }
}