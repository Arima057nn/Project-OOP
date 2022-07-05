package Backend;

import java.util.LinkedList;

public class QuanliNhanVien {
    LinkedList <NhanVien> NV = new LinkedList<>();

    public void addNV(NhanVien acc){
        if(acc != null){
            NV.add(acc);
        }
    }

    public void printAll(){
        System.out.println("-----List Account-----");
        int i;
        for(i = 0; i < NV.size();i++){
            NV.get(i).display();
        }
    }

}
