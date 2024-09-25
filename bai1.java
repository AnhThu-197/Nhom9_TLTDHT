import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println(" là số dương");
        } else if (a < 0) {
            System.out.println(" là số âm");
        } else {
            System.out.println("là số 0");
        }

    }
    }