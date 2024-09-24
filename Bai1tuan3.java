/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1tuan3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bai1tuan3 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int n=scanner.nextInt();
         if(n>0)
          System.out.println("so can kiem tra la so nguyen duong");
        else if(n<0)
          System.out.println("so can tim la so nguyen am");
        else
         System.out.println("so can tim la 0");
    }
}
