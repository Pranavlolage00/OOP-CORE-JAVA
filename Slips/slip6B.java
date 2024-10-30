import java.util.*;
class Matrix
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of M");
        int m=sc.nextInt();
        System.out.println("Enter Value of N");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter n Elements...");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display Transpose of Matrix..");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[j][i]+" ");
            }

            System.out.println();
        }

    }
}