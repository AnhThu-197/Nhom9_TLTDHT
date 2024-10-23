package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SapXepSinhVien {

    public static void main(String[] args) {
        // Tao danh sach sinh vien
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhap so luong sinh vien
        System.out.print("Nhap so luong sinh vien: ");
        int soLuongSinhVien = scanner.nextInt();
        scanner.nextLine(); // Doc bo dong thua

        // Nhap thong tin cho tung sinh vien
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSinhVien.add(sv);
        }
        
        // Sap xep danh sach sinh vien theo diem trung binh giam dan
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
            }
        });

        // In danh sach sinh vien sau khi sap xep
        System.out.println("\nDanh sach sinh vien sau khi sap xep theo diem trung binh giam dan:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
            System.out.println("-----------------------");
        }
    }
}
