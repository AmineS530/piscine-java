
public class ComputeArray {

    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = switch (array[i] % 3) {
                case 0 ->
                    array[i] * 5;
                case 1 ->
                    array[i] + 7;
                default ->
                    array[i];
            };
        }
        return result;
    }
}
