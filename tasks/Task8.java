public class MaxTriangleLine {

    // 8.	Создайте функцию, которая находит максимальное значение третьего ребра треугольника, где длины сторон являются целыми числами.


    /**
     *
     * @param first - первое ребро
     * @param second - второе ребро
     * @return - максимальное ребро, по двум остальным ребрам
     */
    public static long nextEdge(long first, long second) {
        // сумма двух других сторон треугольника должна быть обязательно больше третьей стороны (неравенство треугольника)
        return first + second - 1;
    }

    public static void main(String[] args) {
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));

    }
}
