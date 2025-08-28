package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lec6_bai15_ConvertBetweenArrayAndArrayList {

    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
        }

        ArrayList<String> listFromArr = arrayToArrayList(arr);
        System.out.println("ArrayList từ mảng: " + listFromArr);

        String[] arrFromList = arrayListToArray(listFromArr);
        System.out.println("Mảng từ ArrayList: " + Arrays.toString(arrFromList));
    }
}
