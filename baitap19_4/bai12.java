package baitap19_4;

import java.util.Scanner;

public class bai12 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int hang = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cot = sc.nextInt();

        int[][] matran = new int[hang][cot];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                matran[i][j] = sc.nextInt();
                if (matran[i][j] > max) {
                    max = matran[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
    }
}
