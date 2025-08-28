package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lec6_bai10_ConcatenateTwoArrays {
      public static int[] concatArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }

        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong phan tu mang a1: ");
        int n1 = scanner.nextInt();
        
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("a1[" + i + "]: ");
            a1[i] = scanner.nextInt();
        }

        System.out.print("nhap so luong phan tu mang a2: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("a2[" + i + "]: ");
            a2[i] = scanner.nextInt();
        }

        int[] result = concatArrays(a1, a2);

        System.out.println("Mang a1: " + Arrays.toString(a1));
        System.out.println("Mang a2: " + Arrays.toString(a2));
        System.out.println("Mang sau khi noi: " + Arrays.toString(result));
    }
}
