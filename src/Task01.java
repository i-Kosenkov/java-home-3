//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[21];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        sorting(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sorting(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int[] arr_1 = new int[arr.length / 2];
        int[] arr_2 = new int[arr.length - arr.length / 2];

        System.arraycopy(arr, 0, arr_1, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, arr_2, 0, arr.length - arr.length / 2);

        sorting(arr_1);
        sorting(arr_2);
        merge(arr, arr_1, arr_2);
    }

    public static void merge(int[] arr, int[] arr_1, int[] arr_2) {
        int i = 0, j = 0, k = 0;
        while (i < arr_1.length && j < arr_2.length) {
            if (arr_1[i] < arr_2[j]) {
                arr[k] = arr_1[i];
                i++;
            } else {
                arr[k] = arr_2[j];
                j++;
            }
            k++;
        }
        while (i < arr_1.length) {
            arr[k] = arr_1[i];
            k++;
            i++;
        }
        while (j < arr_2.length) {
            arr[k] = arr_2[j];
            k++;
            j++;
        }
    }
}