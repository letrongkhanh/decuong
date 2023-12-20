package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nhập ba số nguyên từ bàn phím
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập độ dài cạnh a: ");
		int a = scanner.nextInt();

		System.out.print("Nhập độ dài cạnh b: ");
		int b = scanner.nextInt();

		System.out.print("Nhập độ dài cạnh c: ");
		int c = scanner.nextInt();

		// Kiểm tra điều kiện tam giác
		if (isTamGiac(a, b, c)) {
			System.out.println("Ba số đã nhập là độ dài của ba cạnh của một tam giác.");
		} else {
			System.out.println("Ba số đã nhập không tạo thành ba cạnh của một tam giác.");
		}

		// Đóng Scanner
		scanner.close();
	}

	// Phương thức kiểm tra tam giác
	public static boolean isTamGiac(int a, int b, int c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}

}
