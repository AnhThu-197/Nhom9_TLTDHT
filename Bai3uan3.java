/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3uan3;
import java.util.Scanner;
public class Bai3uan3 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap he so c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("khong phai la phuong trinh bac 2.");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phuong trinh co hai nghiem phan biet");
            System.out.println("Nghiem x1 = " + x1);
            System.out.println("Nghiem x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("phuong trinh co mot nghiem kep:");
            System.out.println("Nghiem x = " + x);
        } else {
            System.out.println("phuong trinh khong co nghiem .");
        }
    }
}