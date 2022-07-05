package Backend;

import java.util.LinkedList;

public class QuanliHoaDon {
    LinkedList<HoaDon> HD = new LinkedList<>();
    public void addHD( HoaDon hd){
        if(hd != null){
            HD.add(hd);
        }
    }
}
