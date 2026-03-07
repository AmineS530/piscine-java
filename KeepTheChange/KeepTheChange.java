
import java.util.*;

public class KeepTheChange {

    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> result = new ArrayList<>();
        for (int coin : coins.stream().sorted((a, b) -> b - a).toList())
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        return result;
    }
}
