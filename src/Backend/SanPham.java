package Backend;

public class SanPham {
    private String tenSP;
    private double giaNhap;
    private double giaBan;
    private int soLuong;

    public SanPham(String tenSP, double giaNhap, double giaBan, int soLuong) {
        this.tenSP = tenSP;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void showSP(){
        System.out.println("Ten: " + tenSP+"\n");
    }

    public void display(){
        System.out.println("TenSP: " + getTenSP());
        System.out.println("Gia nhap: " + getGiaNhap());
        System.out.println("Gia ban: " + getGiaBan());
        System.out.println("So luong: " + getSoLuong());
    }
}
