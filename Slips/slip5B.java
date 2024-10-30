import java.io.File;
class FileDelete
{
    public static void main(String arg[])
    {
        if(arg.length==0)
            {
                System.out.println("Provide a File Name");
                return;
            }

       
        for(String fname:arg)
        {
             File f1=new File(fname);
             if(f1.exists())
             {
                String f=f1.getName();
                if(f.endsWith(".txt"))
                {
                    System.out.println("File Deleted.."+f1.getName());
                    f1.delete();
                }
                else
                    System.out.println("File not Found....");
             }
        }

        System.out.println("Remaining Files....");
        for(String fname:arg)
        {
            File f1=new File(fname);
            {
                if(!f1.getName().endsWith(".txt") && f1.exists())
                {
                    System.out.println("File Name: "+f1.getName());
                    System.out.println("File Location: "+f1.getAbsolutePath());
                    System.out.println("File Size: "+f1.length()+"bytes");
                }
            }
        }

    }
}