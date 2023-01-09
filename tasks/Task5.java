public class Operation {

    //5.	Напишите функцию, которая принимает 3 числа и возвращает, что нужно сделать с a и b: они должны быть сложены,
    // вычитаны, умножены или разделены, чтобы получить N. Если ни одна из операций не может дать N, верните "none".
    //3 числа – это N, a и b.

    /**
     * Принимает три числа и возвращает, то какая опреация проводилась с данными числами.
     * String - объекти типа String(строка)
     *
     * @param a - число 1
     * @param b - число 2
     * @param n - С чем сравнивается результат опреации
     * @return - Операция, которая была проведена.
     */

    public static String operation(long a, long b, long n) {
        long multiplication = b * n;
        long division = b / n;
        long added = b + n;
        long substracted = b - n;

        if (division == a) {
           return "division";
        }

        if (added == a) {
            return "added";
        }

        if (substracted == a) {
            return "substracted";
        }

        if (multiplication == a) {
            return "multiplication";
        }

        return "none";

    }

    public static void main(String[] args) {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));

    }
}
