public class Task19 {
    public static boolean isPrefix(String word, String prefix) {
        prefix = prefix.replaceAll("-$", "");
        return word.startsWith(prefix);
    }

    public static boolean isSuffix(String word, String suffix) {
        suffix = suffix.replaceAll("^-", "");
        return word.endsWith(suffix);
    }

    public static void main(String[] args) {
        System.out.println("isPrefix(\"automation\", \"auto-\") -> " + isPrefix("automation", "auto-"));
        System.out.println("isSuffix(\"arachnophobia\", \"-phobia\") -> " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("isPrefix(\"retrospect\", \"sub-\") -> " + isPrefix("retrospect", "sub-"));
        System.out.println("isSuffix(\"vocation\", \"-logy\") -> " + isSuffix("vocation", "-logy"));
    }
}
//replaceAll метод позволяет заменить слово в строке, меняем
//prefix.replaceAll(регулярное выражение"-$", замена"")
//Метод .startsWith(prefix) проверяет начинается ли строка с указанного префикса, начиная с указанного индекса с начала
//Метод .startsendsWith(suffix) проверяет начинается ли строка с указанного префикса, начиная с указанного индекса с конца