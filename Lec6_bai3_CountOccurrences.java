package Homework;

import java.util.Scanner;

public class Lec6_bai3_CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ban muon tao mang chua bao nhieu phan tu: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " vao mang: ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("Mang ban vua tao la [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("nhap phan ban can tim X =  ");
        int x = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                count++;
            }
        }
        
        System.out.println("so " + x + " xuan hien trong mang " + count + " lan");
    }
}
