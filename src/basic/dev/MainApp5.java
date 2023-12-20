package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập số chữ điện tiêu thụ của hộ gia đình trong 1 tháng:");
		int sochu = sc.nextInt();

		// Tính tiền điện
		double tiendien = 0;
		if (sochu <= 100) {
			tiendien = sochu * 1800;
		} else if (sochu <= 200) {
			tiendien = 100 * 1800 + (sochu - 100) * 2500;
		} else {
			tiendien = 100 * 1800 + 100 * 2500 + (sochu - 200) * 3000;
		}

		// Hiển thị số tiền điện
		System.out.println("Số tiền điện phải trả là: " + tiendien);

		sc.close();
	}

}
