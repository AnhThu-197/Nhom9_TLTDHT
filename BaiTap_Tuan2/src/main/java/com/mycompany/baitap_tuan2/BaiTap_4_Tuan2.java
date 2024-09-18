package com.mycompany.baitap_tuan2;

import java.util.Scanner;



public class BaiTap_4_Tuan2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap du lieu
        System.out.print("Tien gui: ");
        double tien = sc.nextDouble();
        System.out.print("Lai suat (%): ");
        double laiSuat = sc.nextDouble() / 100;
        System.out.print("So thang: ");
        int thang = sc.nextInt();

        // Tinh toan
        double lai = tien * laiSuat * thang;
        double tong = tien + lai;

        // In ket qua
        System.out.println("Lai: " + lai);
        System.out.println("Tong tien: " + tong);
    }
}
