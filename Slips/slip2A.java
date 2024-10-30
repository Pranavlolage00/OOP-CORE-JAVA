import java.util.*;
class Demo
{
    void isVowel(String s1)
    {
          for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i)=='A' || s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='i' || s1.charAt(i)=='o' ||s1.charAt(i)=='O' || s1.charAt(i)=='u' || s1.charAt(i)=='U')
            {
                System.out.print(" "+s1.charAt(i));
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Demo ob=new Demo();
        System.out.println("Enter String:");
        String s1=sc.nextLine();
        ob.isVowel(s1);

    }
}