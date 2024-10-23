package Bai2;

import java.util.Scanner;

public class SinhVien {
    // Cac thuoc tinh cua lop SinhVien
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    // Constructor khong tham so
    public SinhVien() {}

    // Constructor co tham so de khoi tao doi tuong voi gia tri ban dau
    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phuong thuc nhap thong tin sinh vien
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSinhVien = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        this.diemTrungBinh = scanner.nextDouble();
    }

    // Phuong thuc in thong tin sinh vien
    public void inThongTin() {
        System.out.println("Ma sinh vien: " + this.maSinhVien);
        System.out.println("Ten sinh vien: " + this.ten);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Diem trung binh: " + this.diemTrungBinh);
    }

    // Getter va Setter cho cac thuoc tinh
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
