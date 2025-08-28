package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lec6_bai8_SortAndSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(a));

        System.out.print("nhap so can tim: ");
        int x = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("so " + x + " duoc tim thay o vi tri " + index);
        } else {
            System.out.println("Số " + x + " không tồn tại trong mảng.");
        }
    }

}
