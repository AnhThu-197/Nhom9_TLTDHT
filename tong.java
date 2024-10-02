import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class tong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao a ");
        int a = scanner.nextInt();
        System.out.println("Gia tri vua nhap: " + a);
        if(a>0)
        {
            int tong = 0;
            for (int i = 1; i <= a; i++)
                tong = tong + i;
            System.out.println("Tong tu 1 den a la: "+ tong);
        }
        else
            System.out.println("khong nhan ");
    }
}
