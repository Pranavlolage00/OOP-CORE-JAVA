// Write a java Program to accept ‘n’ no’s through command line and store only 
// armstrong no’s into the array and display that array.
class Demo
{
    public static void main(String arg[])
    {
        int a[]=new int[arg.length];
        for(int i=0; i<arg.length; i++)
        {
            int num=Integer.parseInt(arg[i]);
            int n=num;
            int s=0;
            while(n>0)
            {
                int d=n%10;
                s=s+(d*d*d);
                n=n/10;
            }
            if(s==num)
               a[i]=num;
        }
        System.out.println("Display only armstrong Numbers");
        for(int i=0; i<a.length; i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
}