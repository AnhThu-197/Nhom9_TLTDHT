import java.util.Scanner;

public class giaithua {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vap n : ");
        int n= scanner.nextInt();
        int s=1;
        for(int i =1; i<=n; i++)
            s=s*i;
        System.out.println("giai thua n la : "+s);
    }
}
