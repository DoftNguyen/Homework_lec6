package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lec6_bai5_FilterEvenNum {

    public static ArrayList<Integer> filterEvenNum(int[] a) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenList.add(a[i]);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap la: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");

        ArrayList<Integer> evenNum = filterEvenNum(a);
        System.out.println("ArrayList chua : " + evenNum);
    }
}
