package baitap17_4;

import java.util.Scanner;

public class bai3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int namSinh = sc.nextInt();

        int tuoi = 2025 - namSinh;

        if (tuoi < 16) {
            System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi < 18) {
            System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã già.");
        }
    }
}
