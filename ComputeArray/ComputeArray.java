
public class ComputeArray {

    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            int remainder = array[i] % 3;
            if (remainder == 0) {
                array[i] *= 5;
            } else if (remainder == 1) {
                array[i] += 7;
            }
        }
        return array;
    }
}