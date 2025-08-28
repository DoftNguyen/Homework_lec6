package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lec6_bai9_SwapTwoElements {
    public static void swap(int[] a, int index1, int index2) {
        if (index1 < 0 || index1 >= a.length || index2 < 0 || index2 >= a.length) {
            System.out.println("Chỉ số không hợp lệ!");
            return;
        }

        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Mang ban dau: " + Arrays.toString(a));

        System.out.print("nhap vi tri muon hoan doi 1: ");
        int index1 = scanner.nextInt();

        System.out.print("nhap vi tri muon doi 2: ");
        int index2 = scanner.nextInt();

        swap(a, index1, index2);

        System.out.println("Mang sau khi hoan doi: " + Arrays.toString(a));
    }
}
