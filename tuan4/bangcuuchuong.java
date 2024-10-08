import java.util.Scanner;

public class bangcuuchuong {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        int i;
        for( i=1; i<=10; i++) {
            System.out.println("bang cuu chuong : " + i);
            for (int j = 1; j <= 10; j++)
                System.out.println(i + " x " + j + " = " + (i * j));
        }
    }
}
