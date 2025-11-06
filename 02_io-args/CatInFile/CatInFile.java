
import java.io.*;

public class CatInFile {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        String filename = args[0];
        byte[] buffer = new byte[1024];
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            int bytesRead;
            while ((bytesRead = System.in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
