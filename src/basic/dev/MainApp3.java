package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào điểm trung bình của sinh viên:");
		double dtb = sc.nextDouble();

		// Xác định học lực của sinh viên
		String hocluc = "";
		if (dtb >= 8) {
			hocluc = "Giỏi";
		} else if (dtb >= 6.5) {
			hocluc = "Khá";
		} else {
			hocluc = "Trung bình";
		}

		// Thông báo học lực của sinh viên
		System.out.println("Học lực của sinh viên là: " + hocluc);

		sc.close();
	}

}
