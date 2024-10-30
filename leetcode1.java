import java.util.*;
class Solution {
    public String nearestPalindromic(String n)
    {
        int num=Integer.parseInt(n);
        int min=0;
        for(int i=0; i<num; i++)
        {
        int n1=i;
        int rev=0;
        while(n1>0)
        {
            int d=n1%10;
            rev=(rev*10)+d;
            n1=n1/10;
        }
          if(rev==i)
              min=i;
        }
         return String.valueOf(min);    
    }
     public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        Solution ob=new Solution();
        System.out.println("Enter String n");
        String num=sc.next();
        String s1=ob.nearestPalindromic(num);
        System.out.println(s1);
     }
}