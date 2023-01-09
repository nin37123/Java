public class Task9 {
    public static int sumOfCubes(int[] array) {
        int result = 0;
        for (int x : array)
            result +=  x * x * x;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sumOfCubes([1, 5, 9]) -> " + sumOfCubes(new int[]{1, 5, 9}));
        System.out.println("sumOfCubes([3, 4, 5]) -> " + sumOfCubes(new int[]{3, 4, 5}));
        System.out.println("sumOfCubes([2]) -> " + sumOfCubes(new int[]{2}));
        System.out.println("sumOfCubes([]) -> " + sumOfCubes(new int[]{}));
    }
}
