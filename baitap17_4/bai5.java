package baitap17_4;

import java.util.Scanner;

public class bai5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;

        while (tong <= 100) {
            System.out.print("Nhập số nguyên: ");
            int n = sc.nextInt();
            tong += n;
        }

        System.out.println("Tổng các số đã nhập là: " + tong);
    }
}
