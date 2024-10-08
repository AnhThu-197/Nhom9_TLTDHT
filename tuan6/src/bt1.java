import java.util.Scanner;

public class bt1 {
    public double chieuDai;
    public double chieuRong;

    public bt1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = scanner.nextDouble();
    }

    public double dientich() {
        return this.chieuRong * this.chieuDai;
    }

    public double chuvi() {
        return (this.chieuRong + this.chieuDai) * 2.0;
    }
}
