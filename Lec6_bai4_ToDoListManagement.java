package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lec6_bai4_ToDoListManagement {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*** Quan ly cong viec can lam ***");
            System.out.println("1. Them mot cong viec");
            System.out.println("2. Xoa mot cong viec");
            System.out.println("3. Hien thi bang cong viec");
            System.out.println("4. thoat");

            System.out.print("moi chon: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("nhap cong viec moi: ");
                    String task = sc.nextLine();
                    toDoList.add(task);
                    System.out.println("da them cong viec!");
                    break;
                case 2:
                    System.out.print("nhap vi tri cong viec muon xoa: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < toDoList.size()) {
                        toDoList.remove(index);
                        System.out.println("da xoa cong viec tai vi tri " + index);
                    } else {
                        System.out.println("vi tri khong hop le!!");
                    }
                    break;
                case 3:
                    System.out.println("danh sach cong viec can lam");
                    if (toDoList.isEmpty()) {
                        System.out.println("danh sach con trong!!");
                    } else {
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("thoat chuong trinh");
                    sc.close();
                default:
                    System.out.println("lua chon khong hop le, xin hay thu lai");
            }
        }
    }
}
