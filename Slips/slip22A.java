// Write a Java program to calculate factorial of a number using recursion
class Fact
{
    static int factNumber(int n)
    {
        if(n<1)
           return 1;
        else
          return (n*factNumber(n-1));
    }
    public static void main(String arg[])
    {
        int ans=factNumber(5);
       System.out.println(ans);
    }
}