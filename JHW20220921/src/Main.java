public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,};
        System.out.println(minArray(arr));

        arr = new int[]{1, 2, 3, -4, 5,};
        System.out.println(minArray(arr));

        arr = new int[]{1};
        System.out.println(minArray(arr));

        arr = new int[6];
        System.out.println(minArray(arr));

        System.out.println("----------------------------------");

        String[] array = {"qwe", "axcvbn", "qwertyuio", "qas" };
        System.out.println(longIndex(array));
    }
//    Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
//    Написать метод, возвращающий максимальный элемент массива целых чисел {1,8,3,6}-> 8

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
//    Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве. Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2

    public static int longIndex(String[] arr) {
        int longI = 0;
        int maxLong = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (maxLong < arr[i].length()) {
                maxLong = arr[i].length();
                longI = i;
            }
        }
        return longI;
    }
}