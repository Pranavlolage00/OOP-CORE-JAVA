import java.util.*;
class Demo
{
    void factorial(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
        System.out.println("factorial of number="+f);
    }
    void perfect(int n)
    {
        int s=0;
        for(int i=0; i<=n; i++)
        {
             if(n%i==0)
             {
                s=s+i;
             }
        }
        if(s==n)
           System.out.println("number is prefect");
        else
           System.out.println("number is not perfect..");
    }
    void arms(int n)
    {
        int num=n,s=0;
        while(n>0)        
        {
            int d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(num==s)
           System.out.println("number is armstromg..");
        else
           System.out.println("number is not armstrong...");
    }
    void prime(int n)
    {
        int i;
        for( i=2; i<=n; i++)
        {
            if(n%i==0)
                break;
        }
        if(i==n)
          System.out.println("number is prime ..");
        else 
           System.out.println("number is not prime..");

    }
    void reverse(int n)
    {
        int r=0;
        while(n>0)
        {
            int d=n%10;
            r=(r*10)+d;
            n=n/10;
        }
        System.out.println("Reverse number ="+r);
    }
    public static void main(String args[])
    {
        int ch,n;
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1- factorial of number \n 2- perfect \n 3- armstrong \n 4- prime \n 5- reverse \n 6- exit");
            System.out.println("enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("enter number to find factorial:");
                        n=sc.nextInt();
                        ob.factorial(n);
                        break;
                case 2: System.out.println("enter number to check perfect or not:");
                        n=sc.nextInt();
                        ob.perfect(n);
                        break;
                
                case 3: System.out.println("enter number to check armstrong or not:");
                        n=sc.nextInt();
                        ob.arms(n);
                        break;
            
                case 4: System.out.println("enter number to check prime or not:");
                        n=sc.nextInt();
                        ob.prime(n);
                        break;
            
                case 5: System.out.println("enter number to reverse:");
                        n=sc.nextInt();
                        ob.reverse(n);
                        break;                
            }

        }while(ch<5);   
    }
}
