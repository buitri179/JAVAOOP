package baitap19_4;

import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử n: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Mảng ban đầu: " + Arrays.toString(A));

        Arrays.sort(A);

        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(A));
    }
}
