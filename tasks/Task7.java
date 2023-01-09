public class Plusator {

    //7.	Напишите функцию, которая берет последнее число из последовательного списка чисел и возвращает сумму всех чисел до него и включая его.

    /**
     * @param f - число до которого считаем
     * @return - результат вычисления
     */
    public static int getValue(int f) {
        int result = 0;
        //используем пришедшее число как размер нашего цикла, в котором складываем все предыдущие числа, пока не дойдём до f.
        for (int i = 1; i <= f; i++) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getValue(3));
        System.out.println(getValue(10));
        System.out.println(getValue(7));
    }
}
