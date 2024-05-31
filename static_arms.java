class arms
{
    static void armstrong(int n)
    {
        int num=n,s=0;
        while(n>0)
        {
            int d=n%10;
               s=s+(d*d*d);
               n=n/10;
        }
        if(s==num)
            System.out.println("number is armstrong..");
        else
            System.out.println("number is not armstrong..");

    }
    public static void main(String args[])
    {
       armstrong(153);
    }
}