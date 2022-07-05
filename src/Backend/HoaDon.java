package Backend;
import java.time.LocalDate;
import java.time.LocalTime;


public class HoaDon {
    private String maHD;
    private String SDT;
    private String sanpham;
    private int soluong;
    private LocalDate ngayLap;
    private LocalTime gioLap;
    private float TongTien = 0;
    public HoaDon(){
        ngayLap = LocalDate.now();
        gioLap = LocalTime.now();
    }

    public HoaDon(String maHD, String SDT, String sanpham, int soluong, LocalDate ngayLap, LocalTime gioLap, float tongTien) {
        this.maHD = maHD;
        this.SDT = SDT;
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.ngayLap = ngayLap;
        this.gioLap = gioLap;
        TongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public LocalTime getGioLap() {
        return gioLap;
    }

    public void setGioLap(LocalTime gioLap) {
        this.gioLap = gioLap;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float tongTien) {
        TongTien = tongTien;
    }
}
