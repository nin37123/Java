public class ASCFunction {
    //6.	Создайте функцию, которая возвращает значение ASCII переданного символа.
    // ASCii стандарт в котором закреплены, числовые значения за символом, java преобразует все это дело автоматом,
    // согласно стандартизированой струкруты, можно посмотреть таблицу в интернете.
    public static int ctoa(char symbol){
        return symbol;
    }

    public static void main(String[] args) {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
    }
}
