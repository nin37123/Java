public class Task12 {
    public static int differenceMaxMin(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (min > x)
                min = x;
            else if (max < x)
                max = x;
        }
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> "
                + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));

        System.out.println("differenceMaxMin([44, 32, 86, 19]) -> "
                + differenceMaxMin(new int[]{44, 32, 86, 19}));
    }
}
