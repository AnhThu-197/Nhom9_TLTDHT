import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Nhân");
        System.out.println("4.Chia");
        System.out.print("Chọn lượt chọn của bạn: ");
        int x;
        x = sc.nextInt();
        double a, b;
        System.out.print("Nhập a:");
        a = sc.nextInt();
        System.out.print("Nhập b:");
        b = sc.nextInt();
        double pheptinh;
        if (x == 1) {
            pheptinh = a + b;
            System.out.println("Kết quả = " + pheptinh);
        } else if (x == 2) {
            pheptinh = a - b;
            System.out.println("Kết quả =" + pheptinh);
        } else if (x == 3) {
             pheptinh = a * b;
            System.out.println("Kết quả =" + pheptinh);
        } else if (x == 4) {
            if (b != 0) {
                pheptinh = a /b;
                System.out.println("Kết quả =" + pheptinh);
            } else {
                System.out.println("Không thể chia cho 0");
            }
        } else {
            System.out.println("Không thể tính toán.");
        }
    }
}

