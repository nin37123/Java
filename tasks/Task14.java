import java.util.ArrayList;
import java.util.Arrays;

public class Task14 {
    public static int[] cumulativeSum(int[] array) {
        var result = new ArrayList<Integer>();
        int sum = 0;
        for (int x : array) {
            sum += x;
            result.add(sum);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println("cumulativeSum([1, 2, 3]) -> " + Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println("cumulativeSum([1, -2, 3]) -> " + Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println("cumulativeSum([3, 3, -2, 408, 3, 3]) -> " + Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
    }
}
