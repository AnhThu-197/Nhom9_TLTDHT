package tuan3;

import java.util.Scanner;

public class bai2 {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao diem trung binh:");
            float n=sc.nextFloat();
        if(n>=8.5)
            System.out.println("Xep loai:Gioi");
        else
            if(n<8.5 && n>=7)
                System.out.println("Xep loai:Kha");
            else
                if(n>7 && n>=5.5)
                    System.out.println("Xep loai:Trung Binh");
                else
                    System.out.println("Xep loai:Yeu");
    }
}