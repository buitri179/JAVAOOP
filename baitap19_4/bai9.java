package baitap19_4;

import java.util.Scanner;

public class bai9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String input = sc.nextLine();

        int chuThuong = 0, chuHoa = 0, so = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                chuThuong++;
            } else if (Character.isUpperCase(ch)) {
                chuHoa++;
            } else if (Character.isDigit(ch)) {
                so++;
            }
        }

        System.out.println("Số ký tự thường: " + chuThuong);
        System.out.println("Số ký tự hoa: " + chuHoa);
        System.out.println("Số chữ số: " + so);
    }
}
