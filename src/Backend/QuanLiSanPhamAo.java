package Backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLiSanPhamAo {
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

            System.out.print("Cổ áo: ");
            String coAo = inputs.nextLine();

            System.out.print("Mẫu Áo: ");
            String mauAo = inputs.nextLine();

            System.out.print("Chiếu dài tay áo: ");
            String chieuDaiTayAo = inputs.nextLine();

            System.out.print("Loại Áo: ");
            String loaiAo = inputs.nextLine();


            Ao ao = new Ao(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    coAo, mauAo, chieuDaiTayAo, loaiAo);

            for(int i=0;i<App.SANPHAMAO.size();i++){
                if(checkIteration(App.SANPHAMAO.get(i), ao)){
                    int soluong = App.SANPHAMAO.get(i).getSoLuong();
                    App.SANPHAMAO.get(i).setSoLuong(soluong + soLuong);
                    System.out.println("Đã thêm sản phẩm thành công.");
                    return;
                }
            }

            App.SANPHAMAO.add(ao);
            System.out.println("Đã thêm sản phẩm thành công.");


        }   catch (InputMismatchException ei) {
            System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



    public void show(){
        System.out.println("Danh sách các sản phẩm Áo.");
        String header = String.format("%-30s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-20s%-10s%-20s%-20s",
                "Tên", "Giá Nhập", "Giá Bán", "Số lượng", "Size", "Màu Sắc", "Chất Liệu", "Xuất Xứ",
                "Cổ áo", "Mẫu Áo", "Chiều dài tay áo", "Loại áo");
        System.out.println(header);

        for(Ao a : App.SANPHAMAO){
            String row = String.format("%-30s%-10f%-10f%-10d%-10s%-10s%-10s%-10s%-20s%-10s%-20s%-20s",
                    a.getTenSP(), a.getGiaNhap(), a.getGiaBan(), a.getSoLuong(), a.getSize(), a.getMauSac(), a.getChatLieu()
                    , a.getXuatXu(), a.getCoAo(), a.getMauAo(), a.getChieuDaiTayAo(), a.getLoaiAo());
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

            System.out.print("Cổ áo: ");
            String coAo = inputs.nextLine();

            System.out.print("Mẫu áo: ");
            String mauAo = inputs.nextLine();

            System.out.print("Chiều dài tay áo: ");
            String chieuDaiTayAo = inputs.nextLine();

            System.out.print("Loại áo: ");
            String loaiAo = inputs.nextLine();



            int soLuong = 0;

            Ao ao = new Ao(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    coAo, mauAo, chieuDaiTayAo, loaiAo);

            for(int i=0;i<App.SANPHAMAO.size();i++){
                if(checkIteration(App.SANPHAMAO.get(i), ao)){
                    System.out.println("Nhập thông tin chỉnh sửa cho sản phẩm");
                    System.out.println("Nhập thông tin sản phẩm: ");
                    inputs = new Scanner(System.in);

                    System.out.print("Nhập tên sản phẩm: ");
                    tenSP = inputs.nextLine();
                    App.SANPHAMAO.get(i).setTenSP(tenSP);

                    System.out.print("Giá nhập: ");
                    giaNhap = inputs.nextDouble();
                    App.SANPHAMAO.get(i).setGiaNhap(giaNhap);

                    System.out.print("Giá bán: ");
                    giaBan = inputs.nextDouble();
                    App.SANPHAMAO.get(i).setGiaBan(giaBan);

                    System.out.print("Số lượng: ");
                    soLuong = inputs.nextInt();
                    App.SANPHAMAO.get(i).setSoLuong(soLuong);

                    inputs.nextLine();

                    System.out.print("Size: ");
                    size = inputs.nextLine();
                    App.SANPHAMAO.get(i).setSize(size);

                    System.out.print("Màu Sắc: ");
                    mauSac = inputs.nextLine();
                    App.SANPHAMAO.get(i).setMauSac(mauSac);

                    System.out.print("Chất liệu:");
                    chatLieu = inputs.nextLine();
                    App.SANPHAMAO.get(i).setChatLieu(chatLieu);

                    System.out.print("Xuất xứ:");
                    xuatXu = inputs.nextLine();
                    App.SANPHAMAO.get(i).setXuatXu(xuatXu);

                    System.out.print("Cổ áo: ");
                    coAo = inputs.nextLine();
                    App.SANPHAMAO.get(i).setCoAo(coAo);

                    System.out.print("Mẫu áo: ");
                    mauAo = inputs.nextLine();
                    App.SANPHAMAO.get(i).setMauAo(mauAo);

                    System.out.print("Chiều dài tay áo: ");
                    chieuDaiTayAo = inputs.nextLine();
                    App.SANPHAMAO.get(i).setChieuDaiTayAo(chieuDaiTayAo);

                    System.out.print("Loại áo: ");
                    loaiAo = inputs.nextLine();
                    App.SANPHAMAO.get(i).setLoaiAo(loaiAo);



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

            System.out.print("Cổ áo: ");
            String coAo = inputs.nextLine();

            System.out.print("Mẫu áo: ");
            String mauAo = inputs.nextLine();

            System.out.print("Chiều dài tay áo: ");
            String chieuDaiTayAo = inputs.nextLine();

            System.out.print("Loại áo: ");
            String loaiAo = inputs.nextLine();

            int soLuong = 0;

            Ao ao = new Ao(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    coAo, mauAo, chieuDaiTayAo, loaiAo);

            for(int i=0;i<App.SANPHAMAO.size();i++){
                if(checkIteration(App.SANPHAMAO.get(i), ao)){
                    App.SANPHAMAO.remove(i);
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

    public boolean checkIteration(Ao a1, Ao a2){
        boolean check ;

        if(a1.getTenSP().equals(a2.getTenSP()) && a1.getGiaNhap().equals(a2.getGiaNhap()) && a1.getGiaBan().equals(a2.getGiaBan())
                 && a1.getSize().equals(a2.getSize() ) &&
                a1.getMauSac().equals(a2.getMauSac()) && a1.getChatLieu().equals(a2.getChatLieu()) &&
                a1.getXuatXu().equals(a2.getXuatXu())
                && a1.getCoAo().equals(a2.getCoAo()) && a1.getMauAo().equals(a2.getMauAo() )
                && a1.getChieuDaiTayAo().equals(a2.getChieuDaiTayAo()) &&
                a1.getLoaiAo().equals(a2.getLoaiAo())){
            check = true;
        } else {
            check = false;
        }

        return check;
    }


}
