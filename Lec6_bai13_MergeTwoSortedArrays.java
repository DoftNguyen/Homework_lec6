package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lec6_bai13_MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        while (i < n1) {
            result[k++] = a1[i++];
        }

        while (j < n2) {
            result[k++] = a2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng 1: ");
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Nhập các phần tử mảng 1: ");
        for (int i = 0; i < n1; i++) {
            a1[i] = scanner.nextInt();
        }
        Arrays.sort(a1);
        
        System.out.print("Nhập số phần tử mảng 2: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Nhập các phần tử mảng 2: ");
        for (int i = 0; i < n2; i++) {
            a2[i] = scanner.nextInt();
        }
        Arrays.sort(a2);

        int[] merged = mergeSortedArrays(a1, a2);
        System.out.println("Mảng đã gộp: " + Arrays.toString(merged));
    }
}
