import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Nhập điểm của học sinh :");
        a = sc.nextFloat();
        if (a >= 8.5) {
            System.out.println("Xếp loại Giỏi");
        } else if (a >= 6.5 && a < 8.5) {
            System.out.println("Xếp loại Khá");
        } else if (a >= 4 && a < 6.5) {
            System.out.println("Xếp loại Trung Bình");
        } else {
            System.out.println("Xếp loại Yếu");
        }
    }
}
