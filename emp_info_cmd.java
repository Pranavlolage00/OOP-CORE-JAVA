class emp
{
    public static void main(String args[])
    {
       int eno=Integer.parseInt(args[0]);
       String ename=args[1];
       float sal=Float.parseFloat(args[2]);

       System.out.println("Display information=");
       System.out.println("employee number="+eno);
       System.out.println("employee name="+ename);
       System.out.println("employee salary="+sal);
    }
}