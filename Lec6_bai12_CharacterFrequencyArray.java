package Homework;

import java.util.Scanner;

public class Lec6_bai12_CharacterFrequencyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi (chỉ chứa chữ thường): ");
        String input = scanner.nextLine();

        int[] a = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                a[c - 'a']++;
            }
        }

        System.out.println("Tần suất các ký tự:");
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + a[i]);
            }
        }
    }
}
