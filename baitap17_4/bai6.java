package baitap17_4;

import java.util.Scanner;

public class bai6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = sc.nextInt();
        } while (n <= 0);

        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
    }
}
