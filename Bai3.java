import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    public Bai3(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }
    public Bai3() {
    }
    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }
    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }
    public double getSoDu() {
        return soDu;
    }
    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi tiền thành công! Số dư mới: " + soDu);
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công! Số dư còn lại: " + soDu);
        } else {
            System.out.println("Số tiền rút không hợp lệ!");
        }
    }

    public double kiemTraSoDu() {
        return soDu;
    }

    public void thongTinTaiKhoan() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bai3> danhSachTaiKhoan = new ArrayList<>();
        danhSachTaiKhoan.add(new Bai3("1", "Nguyễn Quốc Hùng", 5000));
        danhSachTaiKhoan.add(new Bai3("2", "Nguyễn Quang Hùng", 10000));
        danhSachTaiKhoan.add(new Bai3("3", "Nguyễn Đấng Hùng", 15000));
        danhSachTaiKhoan.add(new Bai3("4", "Nguyễn Cao Hùng", 20000));
        danhSachTaiKhoan.add(new Bai3("5", "Nguyễn Đại Hùng", 25000));
        while (true) {
            System.out.println("1. Xem thông tin tất cả tài khoản");
            System.out.println("2. Gửi tiền vào tài khoản");
            System.out.println("3. Rút tiền từ tài khoản");
            System.out.println("4. Kiểm tra số dư tài khoản");
            System.out.println("5. Thoát");
            int luaChon = scanner.nextInt();

            if (luaChon == 1) {
                for (Bai3 tk : danhSachTaiKhoan) {
                    tk.thongTinTaiKhoan();
                }
            } else if (luaChon == 2) {
                System.out.print("Nhập số tài khoản: ");
                String soTK = scanner.next();
                Bai3 tk = timTaiKhoan(soTK, danhSachTaiKhoan);
                if (tk != null) {
                    System.out.print("Nhập số tiền muốn gửi: ");
                    double soTienGui = scanner.nextDouble();
                    tk.guiTien(soTienGui);
                } else {
                    System.out.println("Tài khoản không tồn tại!");
                }
            } else if (luaChon == 3) {
                System.out.print("Nhập số tài khoản: ");
                String soTK = scanner.next();
                Bai3 tk = timTaiKhoan(soTK, danhSachTaiKhoan);
                if (tk != null) {
                    System.out.print("Nhập số tiền muốn rút: ");
                    double soTienRut = scanner.nextDouble();
                    tk.rutTien(soTienRut);
                } else {
                    System.out.println("Tài khoản không tồn tại!");
                }
            } else if (luaChon == 4) {
                System.out.print("Nhập số tài khoản: ");
                String soTK = scanner.next();
                Bai3 tk = timTaiKhoan(soTK, danhSachTaiKhoan);
                if (tk != null) {
                    System.out.println("Số dư hiện tại: " + tk.kiemTraSoDu());
                } else {
                    System.out.println("Tài khoản không tồn tại!");
                }
            } else if (luaChon == 5) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        scanner.close();
    }
    public static Bai3 timTaiKhoan(String soTaiKhoan, ArrayList<Bai3> danhSachTaiKhoan) {
        for (Bai3 tk : danhSachTaiKhoan) {
            if (tk.getSoTaiKhoan().equals(soTaiKhoan)) {
                return tk;
            }
        }
        return null;
    }
}