package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Nhập vào 4 số nguyên
		System.out.println("Nhập vào 4 số nguyên");
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Khởi tạo biến đếm số chẵn và số lẻ
        int sochan = 0;
        int sole = 0;

        // Kiểm tra từng số nguyên
        if (a % 2 == 0) {
            sochan++;
        } else {
            sole++;
        }
        if (b % 2 == 0) {
            sochan++;
        } else {
            sole++;
        }
        if (c % 2 == 0) {
            sochan++;
        } else {
            sole++;
        }
        if (d % 2 == 0) {
            sochan++;
        } else {
            sole++;
        }

        // Hiển thị kết quả
        System.out.println("Có " + sochan + " số chẵn");
        System.out.println("Có " + sole + " số lẻ");

        sc.close();
	}

}
