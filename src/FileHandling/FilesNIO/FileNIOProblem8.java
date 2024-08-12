package FileHandling.FilesNIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNIOProblem8 {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("renamed.txt");
        Path dest = Paths.get("byteWriter.txt");

        try (FileInputStream inputStream = new FileInputStream(sourceFile.toFile().getAbsoluteFile());
             FileOutputStream outputStream = new FileOutputStream(dest.toFile().getAbsoluteFile())
        ) {


            FileChannel channel = inputStream.getChannel();
            FileLock lock = channel.tryLock();
            ByteBuffer buffer = ByteBuffer.allocate((int)channel.size());
            channel.read(buffer);

            String data = new String(buffer.array());
            System.out.println(data);
            channel = outputStream.getChannel();
            int no_of_chars = channel.write(ByteBuffer.wrap(data.getBytes()));
            System.out.println(no_of_chars);
//        channel.write(Files.lines(sourceFile).toString().getBytes());


        } catch (IOException e) {
            System.out.println("" + e);
        }
    }
}
