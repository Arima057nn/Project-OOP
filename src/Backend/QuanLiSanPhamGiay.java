package Backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLiSanPhamGiay {
    public void insert(){
        try {
            // Nhập thông tin của sản phẩm
            System.out.println("Nhập thông tin sản phẩm: ");
            Scanner inputs = new Scanner(System.in);

            System.out.print("Nhập tên sản phẩm: ");
            String tenSP = inputs.nextLine();

            System.out.print("Giá nhập: ");
            Double giaNhap = inputs.nextDouble();

            System.out.print("Giá bán: ");
            Double giaBan = inputs.nextDouble();

            System.out.print("Số lượng: ");
            Integer soLuong = inputs.nextInt();

            inputs.nextLine();

            System.out.print("Size: ");
            String size = inputs.nextLine();

            System.out.print("Màu Sắc: ");
            String mauSac = inputs.nextLine();

            System.out.print("Chất liệu:");
            String chatLieu = inputs.nextLine();

            System.out.print("Xuất xứ:");
            String xuatXu = inputs.nextLine();

            System.out.print("Kiểu cổ giày: ");
            String kieuCoGiay = inputs.nextLine();

            System.out.print("Dịp: ");
            String dip = inputs.nextLine();

            System.out.print("Loại giày: ");
            String loaiGiay = inputs.nextLine();



            Giay giay = new Giay(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    kieuCoGiay, dip, loaiGiay);

            for(int i=0;i<App.SANPHAMGIAY.size();i++){
                if(checkIteration(App.SANPHAMGIAY.get(i), giay)){
                    int soluong = App.SANPHAMGIAY.get(i).getSoLuong();
                    App.SANPHAMGIAY.get(i).setSoLuong(soluong + soLuong);
                    System.out.println("Đã thêm sản phẩm thành công.");
                    return;
                }
            }

            App.SANPHAMGIAY.add(giay);
            System.out.println("Đã thêm sản phẩm thành công.");


        }   catch (InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



    public void show(){
        System.out.println("Danh sách các sản phẩm Giay.");
        String header = String.format("%-30s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-20s%-10s%-20s",
                "Tên", "Giá Nhập", "Giá Bán", "Số lượng", "Size", "Màu Sắc", "Chất Liệu", "Xuất Xứ",
                "Kiểu cổ giày", "Dịp", "Loại Giày");
        System.out.println(header);

        for(Giay g : App.SANPHAMGIAY){
            String row = String.format("%-30s%-10f%-10f%-10d%-10s%-10s%-10s%-10s%-20s%-10s%-20s",
                    g.getTenSP(), g.getGiaNhap(), g.getGiaBan(), g.getSoLuong(), g.getSize(), g.getMauSac(), g.getChatLieu()
                    , g.getXuatXu(), g.getKieuCoGiay(), g.getDip(), g.getLoaiGiay());
            System.out.println(row);
        }
    }

    public void update(){
        try {
            // Nhập thông tin của sản phẩm cần thay đổi
            System.out.println("Nhập thông tin sản phẩm cần thay đổi: ");
            Scanner inputs = new Scanner(System.in);

            System.out.print("Nhập tên sản phẩm: ");
            String tenSP = inputs.nextLine();

            System.out.print("Giá nhập: ");
            Double giaNhap = inputs.nextDouble();

            System.out.print("Giá bán: ");
            Double giaBan = inputs.nextDouble();

            inputs.nextLine();

            System.out.print("Size: ");
            String size = inputs.nextLine();

            System.out.print("Màu Sắc: ");
            String mauSac = inputs.nextLine();

            System.out.print("Chất liệu:");
            String chatLieu = inputs.nextLine();

            System.out.print("Xuất xứ:");
            String xuatXu = inputs.nextLine();

            System.out.print("Kiểu cổ giày: ");
            String kieuCoGiay = inputs.nextLine();

            System.out.print("Dịp: ");
            String dip = inputs.nextLine();

            System.out.print("Loại giày: ");
            String loaiGiay = inputs.nextLine();


            int soLuong = 0;

            Giay giay = new Giay(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    kieuCoGiay, dip, loaiGiay);

            for(int i=0;i<App.SANPHAMGIAY.size();i++){
                if(checkIteration(App.SANPHAMGIAY.get(i), giay)){
                    System.out.println("Nhập thông tin chỉnh sửa cho sản phẩm");
                    System.out.println("Nhập thông tin sản phẩm: ");
                    inputs = new Scanner(System.in);

                    System.out.print("Nhập tên sản phẩm: ");
                    tenSP = inputs.nextLine();
                    App.SANPHAMGIAY.get(i).setTenSP(tenSP);

                    System.out.print("Giá nhập: ");
                    giaNhap = inputs.nextDouble();
                    App.SANPHAMGIAY.get(i).setGiaNhap(giaNhap);

                    System.out.print("Giá bán: ");
                    giaBan = inputs.nextDouble();
                    App.SANPHAMGIAY.get(i).setGiaBan(giaBan);

                    System.out.print("Số lượng: ");
                    soLuong = inputs.nextInt();
                    App.SANPHAMGIAY.get(i).setSoLuong(soLuong);

                    inputs.nextLine();

                    System.out.print("Size: ");
                    size = inputs.nextLine();
                    App.SANPHAMGIAY.get(i).setSize(size);

                    System.out.print("Màu Sắc: ");
                    mauSac = inputs.nextLine();
                    App.SANPHAMGIAY.get(i).setMauSac(mauSac);

                    System.out.print("Chất liệu:");
                    chatLieu = inputs.nextLine();
                    App.SANPHAMGIAY.get(i).setChatLieu(chatLieu);

                    System.out.print("Xuất xứ:");
                    xuatXu = inputs.nextLine();
                    App.SANPHAMGIAY.get(i).setXuatXu(xuatXu);

                    System.out.print("Kiểu cổ giày: ");
                    kieuCoGiay = inputs.nextLine();

                    System.out.print("Dịp: ");
                    dip = inputs.nextLine();

                    System.out.print("Loại giày: ");
                    loaiGiay = inputs.nextLine();


                    System.out.println("Đã cập nhật sản phẩm thành công");
                    return;
                }
            }
            System.out.println("Không có sản phẩm phù hợp với thông tin đã nhập.");
        }   catch (InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void delete(){
        System.out.println("Nhập thông tin sản phẩm cần xóa:");
        try {
            // Nhập thông tin của sản phẩm cần thay đổi
            System.out.println("Nhập thông tin sản phẩm cần thay đổi: ");
            Scanner inputs = new Scanner(System.in);

            System.out.print("Nhập tên sản phẩm: ");
            String tenSP = inputs.nextLine();

            System.out.print("Giá nhập: ");
            Double giaNhap = inputs.nextDouble();

            System.out.print("Giá bán: ");
            Double giaBan = inputs.nextDouble();


            inputs.nextLine();

            System.out.print("Size: ");
            String size = inputs.nextLine();

            System.out.print("Màu Sắc: ");
            String mauSac = inputs.nextLine();

            System.out.print("Chất liệu:");
            String chatLieu = inputs.nextLine();

            System.out.print("Xuất xứ:");
            String xuatXu = inputs.nextLine();

            System.out.print("Kiểu cổ giày: ");
            String kieuCoGiay = inputs.nextLine();

            System.out.print("Dịp: ");
            String dip = inputs.nextLine();

            System.out.print("Loại giày: ");
            String loaiGiay = inputs.nextLine();


            int soLuong = 0;

            Giay giay = new Giay(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    kieuCoGiay, dip, loaiGiay);

            for(int i=0;i<App.SANPHAMGIAY.size();i++){
                if(checkIteration(App.SANPHAMGIAY.get(i), giay)){
                    App.SANPHAMGIAY.remove(i);
                    System.out.println("Đã xóa sản phẩm thành công");
                    return;
                }
            }
            System.out.println("Không có sản phẩm phù hợp với thông tin đã nhập.");
        }   catch (InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean checkIteration(Giay g1, Giay g2){
        boolean check ;

        if(g1.getTenSP().equals(g2.getTenSP()) && g1.getGiaNhap().equals(g2.getGiaNhap()) && g1.getGiaBan().equals(g2.getGiaBan())
                 && g1.getSize().equals(g2.getSize() ) &&
                g1.getMauSac().equals(g2.getMauSac()) && g1.getChatLieu().equals(g2.getChatLieu()) &&
                g1.getXuatXu().equals(g2.getXuatXu())
                && g1.getKieuCoGiay().equals(g2.getKieuCoGiay()) && g1.getDip().equals(g2.getDip() )
                && g1.getLoaiGiay().equals(g2.getLoaiGiay())){
            check = true;
        } else {
            check = false;
        }

        return check;
    }
}
