// Write a java program for the following: [25 M]
// 1. To create a file.
// 2. To rename a file.
// 3. To delete a file.
// 4. To display path of a file.

import java.io.File;
 class FileOperations
  {
    static void createFile(String filePath)
      {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            } 
      }
    static void renameFile(String oldFilePath, String newFilePath)
     {
        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed to: " + newFile.getName());
        } else {
            System.out.println("Rename operation failed.");
        }
    }
    static void deleteFile(String filePath) 
    {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
     static void displayFilePath(String filePath)
     {
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
public static void main(String[] args)throws Exception
     {
        String filePath = "example.txt";
        String newFilePath = "renamed_example.txt";
        createFile(filePath);

        renameFile(filePath, newFilePath);

        deleteFile(newFilePath);

        displayFilePath(newFilePath);
    }
}
