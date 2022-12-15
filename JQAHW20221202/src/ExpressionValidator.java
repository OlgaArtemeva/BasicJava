public class ExpressionValidator {
    static boolean parse1(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    static boolean parse1(char[] ch) {
        String tmp = String.valueOf(ch);
        return parse1(tmp);
    }

    static boolean parse1(String[] str) {
        boolean flag = parse1(String.valueOf(str[0]));
        int i = 1;
        while (i < str.length && flag == true) {
            String tmp = String.valueOf(str[i]);
            flag = parse1(tmp);
            i++;
        }
        if (flag == false) {
            return false;
        } else {
            return true;
        }
    }

    static boolean parse1(String str1, String str2) {
        if (parse1(str1) && parse1(str2)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean parse1(char ch) {
        String tmp = String.valueOf(ch);
        return parse1(tmp);
    }


    static boolean parse2(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if ('0' > tmp || tmp > '9'){
                return true;
            }
        }
        return false;
        }

    static boolean parse2(char[] ch) {
        String tmp = String.valueOf(ch);
        return parse2(tmp);
    }

    static boolean parse2(String[] str) {
        boolean flag = parse2(String.valueOf(str[0]));
        int i = 1;
        while (i < str.length && flag == true) {
            String tmp = String.valueOf(str[i]);
            flag = parse2(tmp);
            i++;
        }
        if (flag == false) {
            return false;
        } else {
            return true;
        }
    }
    static boolean parse2(String str1, String str2) {
        if (parse2(str1) && parse2(str2)) {
            return true;
        } else {
            return false;
        }
    }
    static boolean parse2(char ch) {
        String tmp = String.valueOf(ch);
        return parse2(tmp);
    }

}
