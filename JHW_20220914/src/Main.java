public class Main {
    public static void main(String[] args) {
        String strFirst = "DE5128279087265";
        String str = "Hello world!";
        String oldStr = "world";
        String newStr = "all";

        System.out.println(strToBlind1(strFirst));
        System.out.println(strToBlind2(strFirst));
        System.out.println(replace(str, oldStr, newStr));


    }
//    1. Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод, который вместо заданной строки с номером счета (например ”DE5128279087265”) возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству засекреченных цифр). Реализуйте 2 варианта метода:

    //----------------------------------------------------------------
//    1) с использованием только циклов, length() и charAt()
    public static String strToBlind1(String str) {
        String strBlind = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < 4 || (str.length() - 2 <= i && i < str.length())) {
                strBlind += str.charAt(i);
            } else strBlind += "*";
        }
        return strBlind;
    }

//----------------------------------------------------------------
//    2) используя любые необходимые методы класса String

    public static String strToBlind2(String str) {
//        формат номера счета считаем стандартным

        String strBlind = str.replace(str.substring(4, 13), "*********");
        return strBlind;
    }

//    Реализовать метод String replace(String str, String oldStr, String newStr) который в данной строке str меняет все подстроки oldStr на подстроки newStr Например:
//            ("Hello world!", "world", "all") - "Hello all!"
//            ("Hello world!", "l", "L") - "HeLLo worLd!"
//            ("Hello world!", "qwe", "L") - "Hello world!"
//            ("Hello world!", "ll", "") - "Heo world!"
//            Ограничения: в данной задаче нельзя использовать стандартные методы String, кроме length(), charAt() и equals()

    public static String replace(String str, String oldStr, String newStr) {
        String rezReplace = "";

        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            for (; j < oldStr.length(); ) {

                if (str.charAt(i) == oldStr.charAt(j)) {
                    i += 1;
                    j += 1;
                } else break;

            }
            if (j == oldStr.length()) {
                rezReplace += newStr;
                i -= 1;
            } else {
                rezReplace += str.charAt(i);

            }
        }
        return rezReplace;
    }


}