package Backend;
import java.time.LocalDate;
import java.time.LocalTime;


public class HoaDon {
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
    


}
