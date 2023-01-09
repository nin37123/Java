public class Task13 {
    public static boolean isAvgWhole(int[] array) {
        int sum = 0;
        for (int x : array)
            sum += x;
        return sum % array.length == 0;
    }

    public static void main(String[] args) {
        System.out.println("isAvgWhole([1, 3]) -> " + isAvgWhole(new int[]{1, 3}));
        System.out.println("isAvgWhole([1, 2, 3, 4]) -> " + isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println("isAvgWhole([1, 5, 6]) -> " + isAvgWhole(new int[]{1, 5, 6}));
        System.out.println("isAvgWhole([1, 1, 1]) -> " + isAvgWhole(new int[]{1, 1, 1}));
        System.out.println("isAvgWhole([9, 2, 2, 5]) -> " + isAvgWhole(new int[]{9, 2, 2, 5}));
    }
}
