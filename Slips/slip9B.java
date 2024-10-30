import java.util.*;
class InvalidPanNumber extends Exception
{
    public String toString()
    {
        return "Inavlid Pan Number...";
    }
}
class InvalidMobileNumber extends Exception
{
    public String toString()
    {
        return "Invalid Mobile Number...";
    }
}
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter Pan Number..");
        String pan=sc.nextLine();
        if(pan.length()>10)
           throw new InvalidPanNumber();
        for(int i=0; i<5; i++)
        {
            if(!(Character.isUpperCase(pan.charAt(i))))
                throw new InvalidPanNumber();
        }
        for(int i=5; i<9; i++)
        {
            if(!(Character.isDigit(pan.charAt(i))))
                throw new InvalidPanNumber();
        }
        if(!(Character.isUpperCase(pan.charAt(9))))
        {
            throw new InvalidPanNumber();
        }
        System.out.println("Pan Number="+pan);
        System.out.println("Enter Mobile Number");
        String Num=sc.next();
        if(pan.length()>10)
           throw new InvalidMobileNumber();
        
        for(int i=0; i<Num.length(); i++)
        {
            if(!(Character.isDigit(Num.charAt(i))))
                throw new InvalidMobileNumber();
        }
         System.out.println("Mobile Number="+Num);
           }
           catch(InvalidPanNumber e)
           {
               System.out.println(e);
           }
           catch(InvalidMobileNumber e)
           {
             System.out.println(e);
           }
    }
}