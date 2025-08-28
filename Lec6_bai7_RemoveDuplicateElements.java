package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lec6_bai7_RemoveDuplicateElements {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int a =list.get(i);
            if (!value.contains(a)) {
                value.add(a);
            }
        }
        return value;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        System.out.print("nhap so luong phan tu: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            num.add(x);
        }
        System.out.println("dau vao: " + num);
        ArrayList<Integer> noDup =  removeDuplicates(num);
        System.out.println("dau ra: " + noDup);
    }
}
