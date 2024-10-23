package Bai3;

import java.util.Scanner;

 class TaiKhoan {
    protected String SoTaiKhoan ;
    private String matKhau ;
    protected String chuTaiKhoan ;
    protected double soDu;

    public TaiKhoan(String soTaiKhoan, String matKhau, String chuTaiKhoan, double soDu) {
        SoTaiKhoan = soTaiKhoan;
        this.matKhau = matKhau;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    protected TaiKhoan(){}

    //xây dựng phương thức get
    protected String getSoTaiKhoan() {
        return SoTaiKhoan;
    }
    protected String getChuTaiKhoan() {
        return chuTaiKhoan;
    }
    public double getSoDu() {
        return soDu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    // phương thức set


    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.SoTaiKhoan = soTaiKhoan;
    }
    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }
    public void setSoDu(double soDu) {

        this.soDu = soDu;
    }


    protected void nhapThongTinTaiKhoan(){
        Scanner sc =new Scanner(System.in);

        System.out.print("Nhập tên tài khoản : ");
        this.chuTaiKhoan = sc.nextLine();

        System.out.print("Nhập mật khẩu : ");
        this.matKhau = sc.nextLine();

        System.out.print("Nhập số tài khoản của bạn: ");
        this.SoTaiKhoan = sc.nextLine() ;

        System.out.print("Số tiền bạn muốn gửi vào ngân hàng: ");
        this.soDu = sc.nextDouble();
    }
    public boolean kiemTraDangNhap(String soTaiKhoan, String matKhau) {
    		return this.SoTaiKhoan.equals(soTaiKhoan) && this.matKhau.equals(matKhau);
    }
    protected void napTien( double money){
        if(money > 0)
            this.soDu +=money ;
        else
        	System.out.println("nội dung nhập không hợp lệ");
    }

    protected void rutTien (double money){
        if(money > 0 && money <= soDu)
            this.soDu -= money ;
        else
            System.out.println("Số dư của bạn không đủ để rút");
    }

    protected void changPasswork (String thayDoiMatKhau){
        setMatKhau(thayDoiMatKhau);
    }
}