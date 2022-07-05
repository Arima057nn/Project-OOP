package Backend;

public class MAIN {
    public static void main(String [] args) {

        QuanliNhanVien qlNV = new QuanliNhanVien();
        NhanVien nv1 = new NhanVien("PTD", "123456", 2000);
        NhanVien nv2 = new NhanVien("NTD", "456123", 3000);

        qlNV.addNV(nv1);
//        qlNV.printAll();
        qlNV.addNV(nv2);

        QuanliSanPham qlSP = new QuanliSanPham();
        SanPham sp1 = new SanPham("Quan au",100,150,10);
        SanPham sp2 = new SanPham("Quan bo",110,170,12);
        qlSP.addSP(sp1);
        qlSP.addSP(sp2);
//        qlSP.printAll();
        qlSP.removeSP("Quan bo", 13);
//        qlSP.printAll();

        QuanliKhachHang qlKH = new QuanliKhachHang();
        KhachHang kh1 = new KhachHang("TQC","111111");

        KhachHang kh2 = new KhachHang("LVAV","111112");
        KhachHang kh3 = new KhachHang("TQCC","111111");

        qlKH.addKH(kh1);

        qlKH.printAll();




    }
}
