/** Класс, демонстрирующий проверку палиндромов */
public class Palindrome {

    /**
     * Для каждого аргумента, переданного программе, выводит на экран сообщение
     * является ли он палиндромом
     **/
    public static void main(String[] args) {
        for (String arg : args) { // проход по элементам массива аргументов
            System.out.println("Word \"" + arg + "\" is palindrome: " + isPalindrome(arg));
        }
    }

    /** Возвращает строку, записанную наоборот */
    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length(); i > 0; --i) {
            result += s.charAt(i - 1); // добавляем символы в обратном порядке
        }
        return result;
    }

    /** Проверяет, является ли строка палиндромом (без учета регистра) */
    public static boolean isPalindrome(String s) {
        String lower = s.toLowerCase(); // перевод строки в нижний регистр, чтобы такие слова, как Noon были палиндромами
        String rev = reverseString(lower); // строка, записанная наоборот
        return lower.equals(rev); // одинаковы ли строка и эта же строка, записанная наоборот
    }
}
