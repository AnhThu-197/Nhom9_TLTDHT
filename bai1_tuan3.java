package tuan3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so");
        int n=sc.nextInt();
    if(n==0)
        System.out.println("Bang 0");
    else
        if(n<0)
            System.out.println("So am");
        else
            System.out.println("So duong");
    }
}