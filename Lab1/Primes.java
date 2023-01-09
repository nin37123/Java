/** Класс, демонстрирующий проверку чисел, являются ли они простыми */
public class Primes {

    /** Вывод всех простых чисел на отрезке [2; 100] */
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    /** Проверка числа n, является ли оно простым */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) // если нашли делитель, то
                return false; // число не является простым
        }
        return true; // n - простое так как нет чисел, на которое n делится без остатка
    }
}
