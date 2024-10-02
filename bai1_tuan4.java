import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		int s,n,i;
		System.out.println("Nhap so nguyen n: ");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		s=0;
		for(i=1;i<=n;i++) {
			s=s+i;
		}
		System.out.println("tong cac so tu 1 den "+n+" bang "+s);
	}
}
