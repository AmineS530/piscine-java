public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(\\d)(cm|€)(?=\\s|$)", "$1");
    }

    public static String obfuscateEmail(String s) {
        if (s == null || !s.contains("@"))
            return s;
        String[] tokens = s.split("@");
        return maskUser(tokens[0]) + "@" + maskDomain(tokens[1]);
    }

    private static String repStars(String str) {
        return "*".repeat(str.length());
    }

    private static String maskUser(String name) {
        int sep = Math.max(name.lastIndexOf('-'),
                  Math.max(name.lastIndexOf('.'), name.lastIndexOf('_')));
        if (sep != -1)
            return name.substring(0, sep + 1) + repStars(name.substring(sep + 1));
        return name.length() > 3 ? name.substring(0, 3) + repStars(name.substring(3)) : name;
    }

    private static String maskDomain(String host) {
        String[] segments = host.split("\\.");
        if (segments.length == 3)
            return repStars(segments[0]) + "." + segments[1] + "." + repStars(segments[2]);
        String tld = segments[1].matches("com|org|net") ? segments[1] : repStars(segments[1]);
        return repStars(segments[0]) + "." + tld;
    }

}