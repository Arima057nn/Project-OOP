package Backend;

public class NhanVien {
    private String tenNV, SDT;
    private int luong;

    public NhanVien(String tenNV, String SDT, int luong) {
        this.tenNV = tenNV;
        this.SDT = SDT;
        this.luong = luong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public void display(){
        System.out.println("TenNV: " + getTenNV());
        System.out.println("SDT: " + getSDT());
        System.out.println("Luong: " + getLuong());

    }

}
