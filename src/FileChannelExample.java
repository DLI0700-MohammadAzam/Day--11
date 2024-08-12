import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class FileChannelExample {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream for the source file
            FileInputStream fileInputStream = new FileInputStream("src/Assignment/source.txt");

            // Get the FileChannel object from the FileInputStream
            FileChannel fileChannel = fileInputStream.getChannel();

            // Create a ByteBuffer to read data into
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read data from the FileChannel into the ByteBuffer
            int bytesRead = fileChannel.read(buffer);

            // Print the information read from the channel
            while (bytesRead != -1) {
                buffer.flip(); // Prepare the buffer for reading
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear(); // Prepare the buffer for writing
                bytesRead = fileChannel.read(buffer);
            }

            // Close the FileInputStream (which also closes the FileChannel)
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
