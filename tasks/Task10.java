public class AbcMatch {
//10.	Создайте функцию, которая будет для данного a, b, c выполнять следующие действия:
//– Добавьте A к себе B раз.
//–	Проверьте, делится ли результат на C.

    /**
     * @param a - число
     * @param b - сколько раз добавить число a
     * @param c - На что делим
     * @return - если делится без остатка, то нас это удволетворяет.
     */
    public static boolean abcMatch(long a, long b, long c) {
        // Инициализируем результат числом котрое будем добавлять.
        long result = a;
        // b - счетчик, определяем количество добавлений.
        for (int i = 0; i < b; i++) {
            result = result + result;
        }
        // есть ли остаток от деления, если нету = 0, то число делится.
        return result % c == 0;
    }

    public static void main(String[] args) {
        System.out.println(abcMatch(42, 5, 10));
        System.out.println(abcMatch(5, 2, 1));
        System.out.println(abcMatch(1, 2, 3));
    }
}
