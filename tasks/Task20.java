public class Task20 {
    public static String hexLattice(int number) {
        float N_float = (float)((3 + Math.sqrt(12 * number - 3)) / 6);
        int N = (int)N_float;
        if (Math.abs(N_float - N) > 0)
            return "Invalid";

        String result = "";
        int n_lines = 2 * N - 1;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N - i - 1; j++)
                result += " ";
            for (int j = 0; j < N + i; j++)
                result += " o";
            for (int j = 0; j < N - i; j++)
                result += " ";
            result += "\n";
        }
        for (int i = N; i < n_lines; ++i) {
            for (int j = 0; j < i - N + 1; j++)
                result += " ";
            for (int j = 0; j < n_lines - i + N - 1; j++)
                result += " o";
            for (int j = 0; j < i - N + 2; j++)
                result += " ";
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("hexLattice(1)\n" + hexLattice(1));
        System.out.println("hexLattice(7)\n" + hexLattice(7));
        System.out.println("hexLattice(19)\n" + hexLattice(19));
        System.out.println("hexLattice(21)\n" + hexLattice(21));
    }
}
//Гексагональная решетка.имеет 6 соседей. float N_float = (float)((3 + Math.sqrt(12 * number - 3)) / 6); переводим введённое значение в float и проверяем формулой, если целой число то всё хорошо
//if (Math.abs(N_float - N) > 0) получаем модуль числа (1-2<0 ok)
//1 цикл создаёт верхнюю половину решетки, сдвигаем строку "N - i - 1 " " o N + i", сдвигаемся вниз N - i\n
//1 цикл создаёт нижнюю половину решетки, сдвигаем строку "i - N + 1 " " o  n_lines - i + N - 1", сдвигаемся вниз i - N + 2\n, т.к инверсия и нам делать обратное