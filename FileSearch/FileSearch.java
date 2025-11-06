
import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        File rootDir = new File("documents");
        if (!rootDir.exists()) {
            return null;
        }

        File found = findRecursively(rootDir, fileName);
        if (found != null) {
            return found.getPath();
        }
        return null;
    }

    private static File findRecursively(File dir, String fileName) {
        File[] files = dir.listFiles();
        if (files == null) {
            return null;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return file;
            } else if (file.isDirectory()) {
                File found = findRecursively(file, fileName);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }
}
