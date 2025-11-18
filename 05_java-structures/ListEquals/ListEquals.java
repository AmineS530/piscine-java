import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        if (list1 == null && list2 == null){
        return true;
    }

    if((list1 == null && list2 != null) || (list1 != null && list2 == null)
      || (list1.size() != list2.size())){
        return false;
    }
        return list1.equals(list2);
    }
}