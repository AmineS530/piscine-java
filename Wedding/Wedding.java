import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> f, Set<String> s) {
        List<String> first = new ArrayList<>(f);
        List<String> second = new ArrayList<>(s);
        return IntStream.range(0, Math.min(first.toArray().length, second.toArray().length))
                .boxed()
                .collect(Collectors.toMap(first::get, second::get));
    }

}