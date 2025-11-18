import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> coinList = coins.stream().sorted((a, b) -> b - a).toList();
        List<Integer> result = new java.util.ArrayList<>();
        for (int coin : coinList) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }
        return result;
    }
}