package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {

        try(FileOutputStream outputStream = new FileOutputStream("newfile.txt"))
        {
               outputStream.write("Written through the stream".getBytes());

        }catch (IOException e) {
            System.out.println(""+e);
        }
       try( FileInputStream inputStream = new FileInputStream("newfile.txt"))
       {
           int c ;
           while ((c= inputStream.read()) !=-1)
           {
               System.out.print((char) c);
           }
       }catch (IOException e)
       {
           System.out.println(""+e);
       }

    }
}
