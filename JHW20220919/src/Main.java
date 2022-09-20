import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int minValue = 0;
        int maxValue = 5;
        System.out.println(Arrays.toString(fillArr(minValue, maxValue)));

        minValue = 0;
        maxValue = -5;
        System.out.println(Arrays.toString(fillArr(minValue, maxValue)));

        minValue = 0;
        maxValue = 0;
        System.out.println(Arrays.toString(fillArr(minValue, maxValue)));

        System.out.println("-------------------------");

        int[] arr = {3, 2, -1, 5, -3};
        System.out.println(sumArr(arr));
    }
//    Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue

    // нам неизвестно, что minValue < maxValue и считаем, что minValue и maxValue входят в диапазон

    public static int[] fillArr(int minValue, int maxValue) {
        int n = Math.abs(minValue - maxValue) + 1;
        int[] arr = new int[n];
        if (minValue < maxValue) {
            arr[0] = minValue;
        } else {
            arr[0] = maxValue;
        }

        for (int i = 1; i < n; i++) {
            arr[i] = arr[0] + i;
        }
        return arr;
    }

    //    Дан массив int. Реализовать метод, который считает сумму положительных элементов массива.
//    {3, 2, -1, 5, -3} ->10
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

}