
import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }
        String inputFile = args[0];
        String outputFile = args[1];

        try (FileInputStream fis = new FileInputStream(inputFile); FileOutputStream fos = new FileOutputStream(outputFile)) {
            String input = new String(fis.readAllBytes()).toLowerCase().trim();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (i == 0 || input.charAt(i - 1) == ' ' && Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
            }
            fos.write(sb.toString().replaceAll(" +", " ").getBytes());
        }
    }

}
