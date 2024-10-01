import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int gt,n,i;
		System.out.println("Nhap vao so nguyen can tinh giai thua: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		gt=1;
		for(i=1;i<=n;i++) {
			gt=gt*i;
		}
		System.out.println("Giai thua cua "+n+" bang "+gt);
	}
}
