import java.util.Scanner;

public class UCvaBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ucln = ucln(a, b);
        int bcnn = bcnn(a, b, ucln);
        System.out.println("UCLN la: " + ucln);
        System.out.println("BCNN la: " + bcnn);
    }
    public static int ucln(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
             else
                b = b - a;
        }
        return a;
    }
    public static int bcnn(int a, int b, int ucln) {
        return (a * b) / ucln;
    }
}
