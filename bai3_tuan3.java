package tuan3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so nguyen a");
		int a = sc.nextInt();
		System.out.println("nhap vao so nguyen b");
		int b = sc.nextInt();
		System.out.println("nhap vao so nguyen c");
		int c = sc.nextInt();
		int denta = b*b-4*a*c;
		double x,x1,x2;
		if(denta>0)
		{
			x1 = (-b+Math.sqrt(denta))/2.0*a;
			x2 = (-b-Math.sqrt(denta))/2.0*a;
			System.out.println("phuong trinh co hai nghiem phan biet x1= "+x1+" x2= "+x2);
		}
		else
			if(denta==0)
			{	
				x=-b/2.0*a;
				System.out.println("phuong trinh co nghiem kep x= "+x);
			}
			else
				System.out.println("phuong trinh vo nghiem");
	}
}
