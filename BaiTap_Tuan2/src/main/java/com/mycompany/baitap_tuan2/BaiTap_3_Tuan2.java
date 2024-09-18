package com.mycompany.baitap_tuan2;

import java.util.Scanner;

public class BaiTap_3_Tuan2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap hai so
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt(); 
      
        // Tinh toan
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = a*(1.0) / b;
        int du = a % b;

        // In ket qua
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + du);
    }
}
