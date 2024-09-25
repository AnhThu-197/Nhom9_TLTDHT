import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, D, a, b, c;
        System.out.println("Nhập a:");
        a = sc.nextDouble();
        System.out.println("Nhập b:");
        b = sc.nextDouble();
        System.out.println("Nhập c:");
        c = sc.nextDouble();
        D = Math.pow(a, 2) - 4 * a * c;
        if (a==0) {
            System.out.println("không thể ra kết quả");
        } else if (D < 0){
            System.out.println("Phương trình vô nghiệm :");
        } else if (D > 0) {
            x1 = (-b - Math.sqrt(D) / 2 * a);
            x2 = (-b + Math.sqrt(D) / 2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt :");
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép :");
            System.out.println("x1=" + x1);
        }
    }

}
