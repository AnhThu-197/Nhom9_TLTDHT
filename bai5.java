import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập cạnh a :");
        a = sc.nextInt();
        System.out.println("Nhập cạnh b :");
        b = sc.nextInt();
        System.out.println("Nhập cạnh c :");
        c = sc.nextInt();
        if (a + c > b && a + b > c && b + c > a) {
            System.out.println(" Có thể tạo ra tam giác abc ");
            if (a == b && b == c) {
                System.out.println(" tam giác đều abc");
            } else if (a == b || a == c || b == c) {
                System.out.println("tam giác cân abc");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("tam giác vuông abc");
            } else
                System.out.println("tam giác thường abc");
        } else
            System.out.println("Không thể tạo ra tam giác");
    }
}