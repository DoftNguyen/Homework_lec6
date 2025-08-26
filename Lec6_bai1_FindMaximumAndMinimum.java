package Homework;

import java.util.Scanner;

public class Lec6_bai1_FindMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so nguyen thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
        
        System.out.println("gia tri lon nhat la: " + max + ", gia tri nho nhat la: " + min);
        
    }
}
