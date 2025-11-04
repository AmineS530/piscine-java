
public class CleanExtract {

    public static String extract(String s) {
        String[] phrases = s.split("\\|");
        StringBuilder res = new StringBuilder();

        for (String phrase : phrases) {
            phrase = phrase.trim();
            int first_dot = phrase.indexOf('.');
            int last_dot = phrase.lastIndexOf('.');
            if (first_dot != -1 && last_dot != -1) {
                String curr;
                if (first_dot != last_dot) {
                    curr = phrase.substring(first_dot + 1, last_dot).trim();
                } else {
                    curr = phrase.substring(first_dot + 1).trim();
                    if (res.length() > 0) {
                        res.append(" ");
                    }
                }
                if (curr.isEmpty()) {
                    res.append(" ");
                } else {
                    res.append(curr);
                }
            }
        }
        return res.toString();
    }
}
