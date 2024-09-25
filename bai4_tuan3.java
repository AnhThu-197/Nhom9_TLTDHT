package tuan3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so a:");
		double a = sc.nextDouble();
		System.out.println("nhap so b:");
		double b = sc.nextDouble();
		System.out.println("nhap so c:");
		double c = sc.nextDouble();
		double min;
		if(a<b && a<c)
			min = a;
		else
			if(b<a && b<c)
				min = b;
			else
				min = c; 
		System.out.println("so nho nhat trong ba so la: "+min);
	}
}