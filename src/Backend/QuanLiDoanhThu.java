package Backend;

import java.util.Scanner;

public class QuanLiDoanhThu {
    public void show(){
        Scanner inputs = new Scanner(System.in);
        System.out.println("Thời điểm bắt đầu tính:");
        System.out.println("Nhập năm");
        String nam1 = inputs.nextLine();

        System.out.println("Nhập tháng");
        String thang1 = inputs.nextLine();

        System.out.println("Nhập ngày:");
        String ngay1 = inputs.nextLine();

        System.out.println("Thời điểm kết thúc tính:");
        System.out.println("Nhập năm");
        String nam2 = inputs.nextLine();

        System.out.println("Nhập tháng");
        String thang2 = inputs.nextLine();

        System.out.println("Nhập ngày:");
        String ngay2 = inputs.nextLine();

        String nam = "";
        String thang = "";
        String ngay = "";

        Double luong = 0.0;
        Double TienHang = 0.0;
        Double TienThu = 0.0;
        Double TienChiPhiPhu = 0.0;
        Double tienLai = 0.0;
        for(int i=0;i<App.CONG.size();i++){
            nam = App.CONG.get(i).getCaLamViec().getNam();
            thang = App.CONG.get(i).getCaLamViec().getThang();
            ngay = App.CONG.get(i).getCaLamViec().getNgay();
            if((nam1.compareTo(nam) <= 0 && nam.compareTo(nam2) <= 0 )
            && (thang1.compareTo(thang) <= 0 && thang.compareTo(thang2) <= 0)
            && (ngay1.compareTo(ngay) <= 0 && ngay.compareTo(ngay2) <= 0)){
                luong = luong + App.CONG.get(i).getNhanVien().getLuong()*5;
            }
        }

        for(int i=0;i<App.HOADON.size();i++){
            nam = App.HOADON.get(i).getNam();
            thang = App.HOADON.get(i).getThang();
            ngay = App.HOADON.get(i).getNgay();
            if((nam1.compareTo(nam) <= 0 && nam.compareTo(nam2) <= 0 )
                    && (thang1.compareTo(thang) <= 0 && thang.compareTo(thang2) <= 0)
                    && (ngay1.compareTo(ngay) <= 0 && ngay.compareTo(ngay2) <= 0)){
                for(int j=0;j<App.HOADON.get(i).getSanPhamVaSoLuongs().size();j++){
                    TienHang = TienHang + App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSanPhamAo().getGiaNhap()*
                            App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSoLuongAo() +

                            App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSanPhamQuan().getGiaNhap()*
                                    App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSoLuongQuan() +

                            App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSanPhamGiay().getGiaNhap()*
                                    App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSoLuongGiay();

                    TienThu = TienThu + App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSanPhamAo().getGiaBan()*
                            App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSoLuongAo() +

                            App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSanPhamQuan().getGiaBan()*
                                    App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSoLuongQuan() +

                            App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSanPhamGiay().getGiaBan()*
                                    App.HOADON.get(i).getSanPhamVaSoLuongs().get(j).getSoLuongGiay();
                }
            }
        }

        for(int i=0;i<App.CHIPHIPHU.size();i++){
            nam = App.CHIPHIPHU.get(i).getNam();
            thang = App.CHIPHIPHU.get(i).getThang();
            ngay = App.CHIPHIPHU.get(i).getNgay();
            if((nam1.compareTo(nam) <= 0 && nam.compareTo(nam2) <= 0 )
                    && (thang1.compareTo(thang) <= 0 && thang.compareTo(thang2) <= 0)
                    && (ngay1.compareTo(ngay) <= 0 && ngay.compareTo(ngay2) <= 0)){
                TienChiPhiPhu = TienChiPhiPhu + App.CHIPHIPHU.get(i).getTien();
            }
        }

        tienLai = TienThu - TienHang - TienHang - TienChiPhiPhu;

        System.out.println("Tiền lương trả nhân viên: " + luong);
        System.out.println("Tiền Hàng Nhập ( các sản phẩm đã bán): " + TienHang);
        System.out.println("Tổng tiền thu được: " + TienThu);
        System.out.println("Tổng chi phí khác: " + TienChiPhiPhu);
        System.out.println("Tiền lãi: " + tienLai);

    }
}
