package baiTap.bai3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000);
        }

        StopWatch stopwatch = new StopWatch();
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(numbers));

        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(numbers));

        System.out.println("Thời gian thực hiện: " + stopwatch.getElapsedTime());
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
