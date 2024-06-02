class cmd
{
    public static void main(String args[])
    {
        System.out.println("even nos=");
        for(int i=0; i<args.length; i++)
        {
            int n=Integer.parseInt(args[i]);
            if(n%2==0)
                System.out.print(" "+args[i]);
        }
    }
}