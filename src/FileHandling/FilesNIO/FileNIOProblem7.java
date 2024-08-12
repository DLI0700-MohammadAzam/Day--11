package FileHandling.FilesNIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileNIOProblem7 {
    public static void main(String[] args) {
        Path fileName = Paths.get("renamed.txt");
        try {
            FileInputStream reader = new FileInputStream(fileName.toFile().getAbsoluteFile());
            FileChannel channel = reader.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(400);
            channel.read(buffer);
            String str = new String(buffer.array());
            System.out.println(str);




        } catch (IOException e) {
            System.out.println(""+e);
        }

    }
}
