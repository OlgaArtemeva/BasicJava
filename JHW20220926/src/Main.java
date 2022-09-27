import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"jack", "nick", "john", "jack", "tom", "john", "ann", "john"};
        String str = "john";
        int start = 1;
        int finish = 6;
        System.out.println(countOccurrence(arr, str, start, finish));

        str = "sad";
        start = 0;
        finish = 6;
        System.out.println(countOccurrence(arr, str, start, finish));

        str = "john";
        start = 0;
        finish = 7;
        System.out.println(countOccurrence(arr, str, start, finish));

        System.out.println("-----------------------------------------");

        int n = 4;
        start = 21;
        System.out.println(Arrays.toString(firstEven(n, start)));

        start = 22;
        System.out.println(Arrays.toString(firstEven(n, start)));
    }

//    Реализовать метод, который возвращает сколько раз заданная имя встречается в массиве начиная с позиции start до позиции finish (включительно). Если строка не найдена, то возвращаем 0
//    Например:
//    countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,1,6) ->2
//    countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “sad”,0,6) ->0
//    countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,0,7) ->3

    public static int countOccurrence(String[] arr, String str, int start, int finish) {
        int numMeet = 0;
        for (int i = start; i <= finish; i++) {
            if (str.equals(arr[i])) {
                numMeet += 1;
            }
        }
        return numMeet;
    }

//    Реализовать метод, который создает массив из первых n четных чисел, начиная с заданного числа start. Например, для заданных n=4, start=21: {22,24,26,28}

    public static int[] firstEven(int n, int start) {
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            if (start % 2 == 0) {
                arr[0] = start;
            } else arr[0] = start + 1;
            arr[i] = arr[i - 1] + 2;
        }
        return arr;
    }
}