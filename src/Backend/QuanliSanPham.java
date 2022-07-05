package Backend;
import java.util.LinkedList;

public class QuanliSanPham {
    LinkedList<SanPham> SP = new LinkedList<>();

    public void addSP(SanPham sp){
        int count = 0;
        if(sp != null) {

            for (int i = 0; i < SP.size(); i++) {

                if (SP.get(i).getTenSP() == sp.getTenSP()) {
                    int k = SP.get(i).getSoLuong() + 1;
                    SP.get(i).setSoLuong(k);
                    count++;
                }
            }
            if (count != 0) {
                SP.add(sp);
            }
        }
    }

    public void removeSP(SanPham sp){
        if(sp != null) {
            for (int i = 0; i < SP.size(); i++) {

                if (SP.get(i).getTenSP() == sp.getTenSP()) {
                    int k = SP.get(i).getSoLuong() - 1;
                    SP.get(i).setSoLuong(k);

                }
            }
        }
    }


    public void updateSP(SanPham sp){
        int count = 0;
        if(sp != null) {
            for (int i = 0; i < SP.size(); i++) {
                if (SP.get(i).getTenSP() == sp.getTenSP()) {

                }
            }
        }
    }



    public void printAll(){
        System.out.println("-----List SP -----");
        int i;
        for(i = 0; i < SP.size();i++){
            SP.get(i).display();
        }
    }
}
