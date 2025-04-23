package baitap19_4;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi (tối đa 80 ký tự): ");
        String chuoi = sc.nextLine();

        if (chuoi.length() > 80) {
            System.out.println("Chuỗi vượt quá 80 ký tự.");
            return;
        }

        System.out.print("Nhập một ký tự cần đếm: ");
        char kyTu = sc.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }

        System.out.println("Ký tự '" + kyTu + "' xuất hiện " + dem + " lần.");
    }
}
