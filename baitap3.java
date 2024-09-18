package baitap3;

import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào số nguyên thứ nhất: ");
		int a= sc.nextInt();
		System.out.println("Nhập vào số nguyên thứ hai: ");
		int b= sc.nextInt();
		int tong=a+b;
		int hieu=a-b;
		int tich=a*b;
		float thuong= (float)a/b;
		System.out.println("Tổng của "+a+" và "+b+" bằng "+tong);
		System.out.println("Hiệu của "+a+" và "+b+" bằng "+hieu);
		System.out.println("Tích của "+a+" và "+b+" bằng "+tich);
		System.out.println("Thương của "+a+" và "+b+" bằng "+thuong);
	}
}
