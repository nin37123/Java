public class Task16 {
    public static int Fibonacci(int n) {
        int first = 0;
        int second = 1;
        int result = first;
        for (int i = 0; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(3) -> " + Fibonacci(3));
        System.out.println("Fibonacci(7) -> " + Fibonacci(7));
        System.out.println("Fibonacci(12) -> " + Fibonacci(12));
    }
}
//вводим метод и обзываем егоFibonacci(int n), далее прогонка по циклу с условием сложения и вывод на экран результат суммы из метода