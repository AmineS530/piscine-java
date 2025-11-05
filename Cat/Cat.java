
import java.io.*;

public class Cat {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        String filename = args[0];
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(filename)) {
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        }
    }
}
