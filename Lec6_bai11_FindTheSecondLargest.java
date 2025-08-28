package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lec6_bai11_FindTheSecondLargest {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(a);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Khong ton tai phan tu lon thu 2 (tat ca phan tu băng nhau).");
        } else {
            System.out.println("Mang: " + Arrays.toString(a));
            System.out.println("Phan tu lon thu 2: " + secondLargest);
        }
    }
}
