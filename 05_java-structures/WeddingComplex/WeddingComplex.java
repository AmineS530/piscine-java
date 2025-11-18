
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> matches = new HashMap<>();
        Map<String, String> reverse = new HashMap<>();
        Map<String, Integer> next = new HashMap<>();
        List<String> free = new ArrayList<>(first.keySet());

        while (!free.isEmpty()) {
            String person = free.remove(0);
            int idx = next.getOrDefault(person, 0);
            if (idx >= first.get(person).size()) {
                continue;
            }

            String target = first.get(person).get(idx);
            next.put(person, idx + 1);

            if (!reverse.containsKey(target)) {
                matches.put(person, target);
                reverse.put(target, person);
            } else {
                String current = reverse.get(target);
                List<String> prefs = second.get(target);
                if (prefs.indexOf(person) < prefs.indexOf(current)) {
                    matches.remove(current);
                    matches.put(person, target);
                    reverse.put(target, person);
                    free.add(current);
                } else {
                    free.add(person);
                }
            }
        }

        return matches;
    }
}
