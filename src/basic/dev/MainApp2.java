package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Nhập vào độ dài các cạnh tam giác
		System.out.print("Nhập chiều dài cạnh 1: ");
		double canh1 = scanner.nextDouble();

		System.out.print("Nhập chiều dài cạnh 2: ");
		double canh2 = scanner.nextDouble();

		System.out.print("Nhập chiều dài cạnh 3: ");
		double canh3 = scanner.nextDouble();

		// Kiểm tra tính hợp lệ của tam giác
		if (kiemTraTamGiacHopLe(canh1, canh2, canh3)) {
			// Tính chu vi
			double chuVi = tinhChuVi(canh1, canh2, canh3);
			System.out.println("Chu vi tam giác là: " + chuVi);

			// Tính diện tích
			double dienTich = tinhDienTich(canh1, canh2, canh3);
			System.out.println("Diện tích tam giác là: " + dienTich);
		} else {
			System.out.println("Ba cạnh nhập vào không tạo thành tam giác.");
		}

		scanner.close();
	}

	// Hàm kiểm tra tính hợp lệ của tam giác
	private static boolean kiemTraTamGiacHopLe(double a, double b, double c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	// Hàm tính chu vi tam giác
	private static double tinhChuVi(double a, double b, double c) {
		return a + b + c;
	}

	// Hàm tính diện tích tam giác theo công thức Heron
	private static double tinhDienTich(double a, double b, double c) {
		double p = (a + b + c) / 2; // Nửa chu vi
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
