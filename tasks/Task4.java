public class ProfitableGamble {
    //4.	Создайте функцию, которая принимает три аргумента (prob, prize, pay) и возвращает true, если prob * prize > pay;
    // в противном случае возвращает false.
    //Чтобы проиллюстрировать это: profitableGamble (0,2, 50, 9) должен выдать значение true, поскольку 1 (0,2 * 50 - 9), а 1> 0.

    /**
     *  double - java примитив.
     * @param prob - число 1
     * @param prize - число 2
     * @param pray - то, с чем сравниваем
     * @return - результат сравнения, с передаваемым значением. Тип boolean - примитив -
     * принимает два возможных значения, иногда называемых истиной (true) и ложью (false)
     */
    public static boolean profitableGamble(double prob, double prize, double pray) {
        return (prob * prize) > pray;
    }

    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }
}
