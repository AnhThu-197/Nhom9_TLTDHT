package Bai3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		Scanner sc = new Scanner(System.in);
		TaiKhoan tk = new TaiKhoan();
		tk.nhapThongTinTaiKhoan();

		while (true) {
			System.out.println("1.Xem tên sử hữu tài khoản");
			System.out.println("2.Xem số dư tài khoản của bạn");
			System.out.println("3.Gửi tiền ngân hàng");
			System.out.println("4.Rút tiền ngân hàng");
			System.out.println("5.Thay đổi mật khẩu");
			System.out.print("Bạn muốn thực hiện công việc gì?");
			int selection = sc.nextInt();
			sc.nextLine();
			String soTaiKhoanNhap;
			String matKhauNhap;
			boolean kiemtra = false;
			if (selection >= 3 && selection <= 5) {
				System.out.print("Nhập số tài khoản: ");
				soTaiKhoanNhap = sc.nextLine();
				System.out.print("Nhập mật khẩu: ");
				matKhauNhap = sc.nextLine();

				if (tk.kiemTraDangNhap(soTaiKhoanNhap, matKhauNhap)) {
					kiemtra = true;
				} else {
					System.out.println("Số tài khoản hoặc mật khẩu không đúng. Vui lòng thử lại.");
				}
			}
			else
				kiemtra = true;
			if (kiemtra) {
				switch (selection) {
				case 1:
					System.out.println("Tên tài khoản là : " + tk.getChuTaiKhoan());
					break;
				case 2:
					System.out.println("Số dư tài khoản của bạn là: " + df.format(tk.soDu));
					break;
				case 3:
					System.out.println("Nhập số tiền muốn nạp: ");
					double themTien = sc.nextDouble();
					tk.napTien(themTien);
					System.out.println("Số tiền sau khi nạp thêm là : " + df.format(tk.soDu));
					break;
				case 4:
					System.out.println("Nhập số tiền muốn rút: ");
					double rutTienTK = sc.nextDouble();
					tk.rutTien(rutTienTK);
					System.out.println("Số dư tài khoản là : " + df.format(tk.soDu));
					break;
				case 5:
					System.out.println("Nhập mật khẩu bạn muốn thay đổi");
					System.out.println("Mật khẩu trước đó là : " + tk.getMatKhau());
					String changeMyPass = sc.nextLine();
					tk.changPasswork(changeMyPass);
					System.out.print("Mật khẩu của bạn sau khi thay đổi " + tk.getMatKhau());
					break;
				default:
					System.out.println("Lỗi cú pháp. Vui lòng kiểm tra lại!");
				}
			}

			System.out.println("\n------------------");
		}
	}
}