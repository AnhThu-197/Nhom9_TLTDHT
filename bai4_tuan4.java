import java.util.Scanner;

public class Bai4 {
static boolean kiemtra(int so) {
	int i;
	if(so<2)
		return false;
	else {
		for(i=2;i<so;i++) {
			if(so%i==0) 
				return false;
		}
		return true;
	}
	
}
public static void main(String[] args) {
	System.out.println("Nhap vao so can kiem tra: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(kiemtra(n))
		System.out.println(n+" la so nguyen to");
	else
		System.out.println(n+" khong phai so nguyen to");
}
}
