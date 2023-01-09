public class Task15 {
    public static int getDecimalPlaces(String decimal) {
        int dotPos = decimal.indexOf('.');
        if (dotPos == -1)
            return 0;
        return decimal.length() - dotPos - 1;
    }

    public static void main(String[] args) {
        System.out.println("getDecimalPlaces(\"43.20\") -> " + getDecimalPlaces("43.20"));
        System.out.println("getDecimalPlaces(\"400\") -> " + getDecimalPlaces("400"));
        System.out.println("getDecimalPlaces(\"3.1\") -> " + getDecimalPlaces("3.1"));
    }
}
