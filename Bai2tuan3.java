/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bai2tuan3 {

    public static void main(String[] args) {
        float dtb=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap diem trung binh: ");
        dtb=scanner.nextFloat();// đọc giá trị số thực
        if(dtb>= 8.5 && dtb<=10)
            System.out.println("hoc sinh gioi");
        else if(dtb>=7.0)
            System.out.println("hoc sinh kha");
        else if(dtb>=5.0)
            System.out.println("hoc sinh trung binh");
        else
            System.out.println("hoc sinh yeu");
    }
}
