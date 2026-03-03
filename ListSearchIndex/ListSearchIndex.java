import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null || value == null) {
            return null;
        }
        Integer index = list.lastIndexOf(value);
        return index == -1 ? null : index;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null || value == null) {
            return null;
        }
        Integer index = list.indexOf(value);
        return index == -1 ? null : index;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> indexes = new java.util.ArrayList<>();
        if (list == null || value == null || list.isEmpty()) {
            return indexes;
        }

        for (int i = 0; i < list.size(); i++) {
            Integer current = list.get(i);
            if ((value != null && value.equals(current))) {
                indexes.add(i);
            }
        }

        return indexes;
    }
}