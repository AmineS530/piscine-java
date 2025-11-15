import java.util.*;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> a = new ArrayList<>(first);
        List<String> b = new ArrayList<>(second);

        Collections.shuffle(a);
        Collections.shuffle(b);

        int n = Math.min(a.size(), b.size());
        Map<String, String> res = new HashMap<>();

        for (int i = 0; i < n; i++) {
            res.put(a.get(i), b.get(i));
        }

        return res;
    }
}
