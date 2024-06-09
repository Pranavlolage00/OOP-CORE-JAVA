import java.io.*;
class emp
{
    public static void main(String args[])throws Exception
    {
        DataInputStream din=new DataInputStream(System.in);
        System.out.println("enter employee number:");
        int eno=Integer.parseInt(din.readLine());
        System.out.println("enter employee Name:");
        String name=din.readLine();
        System.out.println("enter employee salary:");
        float sal=Float.parseFloat(din.readLine());

        System.out.println("Employee number="+eno);
        System.out.println("employee name="+name);
        System.out.println("employee salary="+sal);


    }
}