import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
       int a, b, c,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a :");
        a = sc.nextInt();
        System.out.println("Nhập b :");
        b = sc.nextInt();
        System.out.println("Nhập c :");
        c =  sc.nextInt();
        min=  Math.min(a, Math.min(b,c));
        System.out.println("Vậy số nhỏ nhát là"+min);

    }
}