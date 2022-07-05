package Backend;

import java.util.LinkedList;

public class QuanliKhachHang {
    LinkedList<KhachHang> KH = new LinkedList<>();

    public void addKH(KhachHang kh){

        for(int i = 0; i < KH.size();i++){
            if(KH.get(i).getSDT() !=kh.getSDT()){
                KH.add(kh);
            }
        }
    }

}
