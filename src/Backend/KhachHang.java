package Backend;

public class KhachHang {
    private String tenKH, SDT;
    private int TichDiem = 0;

    public KhachHang(String tenKH, String SDT, int TichDiem) {
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.TichDiem = TichDiem;
    }
    public KhachHang(String tenKH, String SDT) {
        this.tenKH = tenKH;
        this.SDT = SDT;

    }

    public int getTichDiem() {
        return TichDiem;
    }

    public void setTichDiem(int tichDiem) {
        TichDiem = tichDiem;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void display(){
        System.out.println("TenKH: " + getTenKH());
        System.out.println("SDT: " + getSDT());
        System.out.println("Diem: " + getTichDiem());

    }
}

