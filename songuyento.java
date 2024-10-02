import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao n ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("khong phai so nguyen to");
            return;
        }
        boolean songuyento = true;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) {
                songuyento = false;
                break;
            }
        }
        if(songuyento)
            System.out.println(n+ " la so nguyen to ");
        else
            System.out.println(n+" khong phai la so nguyen to ");


    }
}
