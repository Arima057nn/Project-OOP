package Backend;

public class KhachHang {
    private String tenKH, SDT;
    private int TichDiem;

    public KhachHang(String tenKH, String SDT, int TichDiem) {
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.TichDiem = TichDiem;
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
}

