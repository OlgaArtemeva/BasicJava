public class Main {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(sumArr(str));
        String str1 = "abcd";
        System.out.println(letterEnd(str1));
        System.out.println(letterStart(str1));
    }


    //    Написать метод, возвращающий целое число равное двойной длине строки, принимаемой в качестве аргумента метода.  Пример: hello -> 10
    public static int sumArr(String str) {
        int i = 0;
        for (; i < str.length(); i++) {
        }
        i *= 2;
        return i;
    }

    //    Написать 2 метода:  один метод переставляет первую букву в конец строки (abcd-> bcda). Второй  метод переставляет последнюю букву в начало строки (abcd->dabc)
    public static String letterEnd(String str1) {
        String strEnd = "";
        int i = 1;
        for (; i < str1.length(); i++) {
            strEnd += str1.charAt(i);
        }
        strEnd += str1.charAt(0);
        return strEnd;
    }

    public static String letterStart(String str1) {
        String strStart = "";
        int i = 0;
        for (; i < str1.length() - 1; i++) {
            strStart += str1.charAt(i);
        }
        strStart = str1.charAt(i) + strStart;
        return strStart;
    }

}