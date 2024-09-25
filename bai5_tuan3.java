package tuan3;

import java.util.Scanner;

public class bai5{

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.print("nhap vao canh a la: ");
        double a= scanner.nextDouble();
        System.out.print("nhap vao canh b la: ");
        double b= scanner.nextDouble();
        System.out.print("nhap vao canh c la: ");
        double c= scanner.nextDouble();
        if(a+c>b && a+b>c && b+c>a ){
            System.out.println(" abc 1 la tam giac ");
             if (a == b && b == c) {
            System.out.println("abc la tam giac deu.");
            } else if(a == b || a == c || b == c) 
                 {
                  System.out.println("abc la tam giac can.");
                 }
            else if( a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
            {
                System.out.println("abc la tam giac vuong");
            }
            else
                System.out.println("abc la tam giac thuong");
        } 
        else
            System.out.println("3 canh khong tao thanh tam giac");
    }
}