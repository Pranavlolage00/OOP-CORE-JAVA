import java.util.*;
class Arithmatic
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Display All Arithmatic opertaions..");
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        int ch=0;
        do{
           System.out.println("\n1-Adddition \n2-Subtraction \n3-Multiplication \n4-Division");
           System.out.println("Enter Your Choice:");
           ch=sc.nextInt(); 
           switch(ch)
           {
             case 1 : System.out.println("Addition="+(a+b));
                      break;
             case 2 : System.out.println("Subtraction="+(a-b));
                      break;
             case 3 : System.out.println("Multiplication="+(a*b));
                      break;
             case 4 : System.out.println("Division="+(a/b));
                      break;
           }
         }while(ch<5);
    }
}