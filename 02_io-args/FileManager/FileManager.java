
import java.io.*;

public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(content.getBytes());
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            return new String(fis.readAllBytes());
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}
