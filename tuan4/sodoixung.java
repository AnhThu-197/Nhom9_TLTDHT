import java.util.Scanner;

public class sodoixung {
    public static boolean laSoDoiXung(int n) {
        String chuoiSo = Integer.toString(n);
        int doDai = chuoiSo.length();
        for (int i = 0; i < doDai / 2; i++) {
            if (chuoiSo.charAt(i) != chuoiSo.charAt(doDai - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int so = scanner.nextInt();
        if (laSoDoiXung(so))
            System.out.println(so + " là số đối xứng.");
         else
            System.out.println(so + " không phải là số đối xứng.");
    }
}