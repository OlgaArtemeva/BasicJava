public class Main {
    public static void main(String[] args) {
//        String string="hello";
        System.out.println(doubleLength( "hello"));
        System.out.println(firstToEnd( "abcd"));
        System.out.println(lastToBegin( "abcd"));
        int[] arr={1,8,3,6};
//        System.out.println(sumEven(arr));
        System.out.println(sumEven(new int[] {1,8,3,6}));


        int[] array={1,8,3,6};
//        array = {0,0,0,0};
        array = new int[10];
        array = new int[] {1,1,1,1};


    }
    // дан непустой массив целых чисел. Написать метод, находящий количество четных чисел в нем. {1,8,3,6} ->2

public static int sumEven(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            sum ++;
        }
    }
    return sum;
}

    //    Написать метод, возвращающий целое число равное двойной длине строки, принимаемой в качестве аргумента метода.  Пример: hello -> 10
    public static int doubleLength(String string){
        return 2*string.length();
    }
//    метод переставляет первую букву в конец строки (abcd-> bcda)
    public static String firstToEnd(String string){
        String str1 = string.substring(1);
        String str2 = string.substring(0,1);
        return str1+str2;
    }
//    метод переставляет последнюю букву в начало строки (abcd->dabc)
    public static String lastToBegin(String string){
       String str1 = string.substring(string.length()-1);
        String str2 = string.substring(0,string.length()-1);
        return str1+str2;
    }
}