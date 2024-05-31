import java.util.*;
class Demo
{
    void volume(float r,float h)
    {
        float ans=(float)3.14*r*r*h;
        System.out.println("volume of cyilender="+ans);
    }
    void arms(int n)
    {
        int s=0,num=n;
        while(n>0)
        {
            int d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(num==s)
             System.out.println("number is armstrong..");
        else
            System.out.println("number is not armstrong..");

    }
    void fact(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
             f=f*i;
        }
    System.out.println("factorial of number="+f);
    }

    public static void main(String args[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1-volume of cyilender \n 2- factorial of number \n 3- armstorng number");
            System.out.println("enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 :System.out.println("enter radius and height:");
                        float r=sc.nextFloat();
                        float h=sc.nextFloat();
                        ob.volume(r,h);
                        break;
                case 2 :System.out.println("enter number to find factorial:");
                        int a=sc.nextInt();
                        ob.fact(a);
                        break;
                case 3 :System.out.println("enter number to check armstrog or not");
                        int n=sc.nextInt();
                        ob.arms(n);
                        break;

            }

        }while(ch<4);
    }
}
