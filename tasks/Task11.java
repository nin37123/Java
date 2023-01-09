public class Task11 {
    public static String repeat(String word, int n) {
        StringBuilder result = new StringBuilder();
        char[] chars = word.toCharArray();
        for (char c : chars)
            result.append(String.valueOf(c).repeat(n));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("repeat(\"mice\", 5) -> " + repeat("mice", 5));
        System.out.println("repeat(\"hello\", 3) -> " + repeat("hello", 3));
        System.out.println("repeat(\"stop\", 1) -> " + repeat("stop", 1));
    }
}
