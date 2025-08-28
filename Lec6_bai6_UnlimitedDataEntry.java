package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lec6_bai6_UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        while(true){
            System.out.print("nhap so nguyen toi chet (nhap -1 de dung lai): ");
            int x = sc.nextInt();
            if (x == -1) {
                break;
            }
            num.add(x);
        }
        System.out.println("cac so da nhap " + num);
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        System.out.println("tong la: " + sum);
    }
}
