package baitap17_4;

import java.util.Scanner;

public class bai8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử n: ");
        int n = sc.nextInt();
        int tong = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int so = sc.nextInt();
            tong += so;
        }

        double trungBinh = (double) tong / n;
        System.out.println("Trung bình cộng là: " + trungBinh);
    }
}
