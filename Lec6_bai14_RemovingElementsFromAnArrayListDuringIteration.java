package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lec6_bai14_RemovingElementsFromAnArrayListDuringIteration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Mảng ban đầu: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }

        System.out.println("Mảng sau khi xóa: " + list);
    }
}
