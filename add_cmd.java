class add
{
    public static void main(String arg[])
    {
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);

        int c=a+b;
        int x=a-b;
        int y=a/b;
        int z=a*b;
        System.out.println("addition="+c);
        System.out.println("subtraction="+x);
        System.out.println("division="+y);
        System.out.println("multipliaction="+z);
    }
}
// javc add_cmd.java
// java add 10 20