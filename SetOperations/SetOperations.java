import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> copy = new java.util.HashSet<>(set1);
        copy.addAll(set2);
        return copy;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> copy = new java.util.HashSet<>(set1);
        copy.retainAll(set2);
        return copy;
    }
}