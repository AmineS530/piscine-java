import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if ( list == null ) {
            return null;            
        }
        List<Integer> copy = new java.util.ArrayList<>(list);
        copy.sort((a, b) -> a.compareTo(b));
        return copy;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if ( list == null ) {
            return null;            
        }
        List<Integer> copy = new java.util.ArrayList<>(list);
        copy.sort((a, b) -> b.compareTo(a));
        return copy;
    }
}