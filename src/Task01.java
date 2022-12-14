//Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] result = new int[20];
        int length = arr.length / 2;
        int[] arr_01 = new int[length];
        int[] arr_02 = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr, 0, arr_01, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, arr_02, 0, arr.length / 2);

        System.out.println(Arrays.toString(arr_01));
        System.out.println(Arrays.toString(arr_02));
        for (int i = 0; i < length; i++) {
            if (arr[i] <= arr[length + i]) {
                result[i] = arr[i];
                result[length + i] = arr[length + i];
            } else {
                result[i] = arr[length + i];
                result[length + i] = arr[i];

            }
        }
        System.out.println(Arrays.toString(result));
    }

}