package Homework;

import java.util.Scanner;

public class Lec6_bai2_ReverseArray {
    public static void reverse(int[] a){
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so nguyen thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("Mang ban dau la: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");
        
        reverse(a);
        System.out.print("Mang sau khi dao nguoc: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");
    }
}
