import java.io.File;
import java.util.*;
class Extension
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the File Path :");
        String dir=sc.nextLine();
        
        File f1=new File(dir);
         File[] files = f1.listFiles();
        if(f1.isDirectory())
        {
           for(File fname : files)
           {
              if(fname.toString().endsWith(".txt"))
              {
                System.out.println("File Name ="+fname);
              }
           }
        }
        else
        {
            System.out.println("Invalid Path..");
        }
    }
}