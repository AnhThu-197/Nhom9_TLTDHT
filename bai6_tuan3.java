package tuan3;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      System.out.println("ban muon thuc hien phep tinh: ");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Nhap lua chon cua ban: ");
        int luachon = scanner.nextInt();
        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();
        double pheptinh;
        if (luachon == 1) {
            pheptinh = num1 + num2;
            System.out.println("ket qua: " + pheptinh);
        } else if (luachon == 2) {
            pheptinh = num1 - num2;
            System.out.println("ket qua: " + pheptinh);
        } else if (luachon == 3) {
            pheptinh = num1 * num2;
            System.out.println("ket qua: " + pheptinh);
        } else if (luachon == 4) {
            if (num2 != 0) {
                pheptinh = num1 / num2;
                System.out.println("ket qua: " + pheptinh);
            } else {
                System.out.println("khong the chia cho 0.");
            }
        } else {
            System.out.println("lua chon khong hop le.");
        }
    }
}