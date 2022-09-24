public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 6};
        System.out.println(maxArray(arr));
        System.out.println(diffMaxMin(arr));

    }

    //    Написать метод, возвращающий максимальный элемент массива целых чисел {1,8,3,6}-> 8
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //    Написать метод, возвращающий  разность между максимальным и минимальным элементами
//    массива целых чисел  {1,8,3,6}-> 7
    public static int diffMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        return max - min;
    }
}