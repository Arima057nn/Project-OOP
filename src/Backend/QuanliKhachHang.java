package Backend;

import java.util.LinkedList;

public class QuanliKhachHang {
    LinkedList<KhachHang> KH = new LinkedList<>();

    public void addKH(KhachHang kh){
        int count = 0;
        for(int i = 0; i < KH.size();i++){
            if(KH.get(i).getSDT() == kh.getSDT()){
                count++;
            }
        }
        if(count == 0){
            KH.add(kh);
        }
    }

    public void printAll(){
        System.out.println("-----List KH-----");
        int i;
        for(i = 0; i < KH.size();i++){
            KH.get(i).display();
        }
    }
}
