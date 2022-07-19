package Backend;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLiSanPhamQuan {


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

            System.out.print("Kiểu dáng quần: ");
            String kieuDangQuan = inputs.nextLine();

            System.out.print("Mẫu: ");
            String mau = inputs.nextLine();

            System.out.print("Loại Khóa: ");
            String loaiKhoa = inputs.nextLine();

            System.out.print("Phong cách: ");
            String phongCach = inputs.nextLine();

            System.out.print("Loại Quần:");
            String loaiQuan = inputs.nextLine();

            Quan quan = new Quan(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    kieuDangQuan, mau, loaiKhoa, phongCach, loaiQuan );

            for(int i=0;i<App.SANPHAMQUAN.size();i++){
                if(checkIteration(App.SANPHAMQUAN.get(i), quan)){
                    int soluong = App.SANPHAMQUAN.get(i).getSoLuong();
                    App.SANPHAMQUAN.get(i).setSoLuong(soluong + soLuong);
                    System.out.println("Đã thêm sản phẩm thành công.");
                    return;
                }
            }

            App.SANPHAMQUAN.add(quan);
            System.out.println("Đã thêm sản phẩm thành công.");


        }   catch (InputMismatchException ei) {
        System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }

    public void show(){
        System.out.println("Danh sách các sản phẩm quần.");
        String header = String.format("%-30s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-20s%-10s%-20s%-20s%-20s",
                "Tên", "Giá Nhập", "Giá Bán", "Số lượng", "Size", "Màu Sắc", "Chất Liệu", "Xuất Xứ",
                "Kiểu Dáng Quần", "Mẫu", "Loại Khóa", "Phong Cách", "Loại Quần");
        System.out.println(header);

        for(Quan q : App.SANPHAMQUAN){
            String row = String.format("%-30s%-10f%-10f%-10d%-10s%-10s%-10s%-10s%-20s%-10s%-20s%-20s%-20s",
                    q.getTenSP(), q.getGiaNhap(), q.getGiaBan(), q.getSoLuong(), q.getSize(), q.getMau(), q.getChatLieu()
                    , q.getXuatXu(), q.getKieuDangQuan(), q.getMau(), q.getLoaiKhoa(), q.getPhongCach(), q.getLoaiQuan());
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

            System.out.print("Kiểu dáng quần: ");
            String kieuDangQuan = inputs.nextLine();

            System.out.print("Mẫu: ");
            String mau = inputs.nextLine();

            System.out.print("Loại Khóa: ");
            String loaiKhoa = inputs.nextLine();

            System.out.print("Phong cách: ");
            String phongCach = inputs.nextLine();

            System.out.print("Loại Quần:");
            String loaiQuan = inputs.nextLine();

            int soLuong = 0;

            Quan quan = new Quan(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    kieuDangQuan, mau, loaiKhoa, phongCach, loaiQuan );

            for(int i=0;i<App.SANPHAMQUAN.size();i++){
                if(checkIteration(App.SANPHAMQUAN.get(i), quan)){
                    System.out.println("Nhập thông tin chỉnh sửa cho sản phẩm");
                    System.out.println("Nhập thông tin sản phẩm: ");
                    inputs = new Scanner(System.in);

                    System.out.print("Nhập tên sản phẩm: ");
                    tenSP = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setTenSP(tenSP);

                    System.out.print("Giá nhập: ");
                    giaNhap = inputs.nextDouble();
                    App.SANPHAMQUAN.get(i).setGiaNhap(giaNhap);

                    System.out.print("Giá bán: ");
                    giaBan = inputs.nextDouble();
                    App.SANPHAMQUAN.get(i).setGiaBan(giaBan);

                    System.out.print("Số lượng: ");
                    soLuong = inputs.nextInt();
                    App.SANPHAMQUAN.get(i).setSoLuong(soLuong);


                    inputs.nextLine();

                    System.out.print("Size: ");
                    size = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setSize(size);

                    System.out.print("Màu Sắc: ");
                    mauSac = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setMauSac(mauSac);

                    System.out.print("Chất liệu:");
                    chatLieu = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setChatLieu(chatLieu);

                    System.out.print("Xuất xứ:");
                    xuatXu = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setXuatXu(xuatXu);

                    System.out.print("Kiểu dáng quần: ");
                    kieuDangQuan = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setKieuDangQuan(kieuDangQuan);

                    System.out.print("Mẫu: ");
                    mau = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setMau(mau);

                    System.out.print("Loại Khóa: ");
                    loaiKhoa = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setLoaiKhoa(loaiKhoa);

                    System.out.print("Phong cách: ");
                    phongCach = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setPhongCach(phongCach);

                    System.out.print("Loại Quần:");
                    loaiQuan = inputs.nextLine();
                    App.SANPHAMQUAN.get(i).setLoaiQuan(loaiQuan);

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

            System.out.print("Kiểu dáng quần: ");
            String kieuDangQuan = inputs.nextLine();

            System.out.print("Mẫu: ");
            String mau = inputs.nextLine();

            System.out.print("Loại Khóa: ");
            String loaiKhoa = inputs.nextLine();

            System.out.print("Phong cách: ");
            String phongCach = inputs.nextLine();

            System.out.print("Loại Quần:");
            String loaiQuan = inputs.nextLine();

            int soLuong = 0;

            Quan quan = new Quan(tenSP, giaNhap, giaBan, soLuong, size, mauSac, chatLieu, xuatXu,
                    kieuDangQuan, mau, loaiKhoa, phongCach, loaiQuan );

            for(int i=0;i<App.SANPHAMQUAN.size();i++){
                if(checkIteration(App.SANPHAMQUAN.get(i), quan)){
                    App.SANPHAMQUAN.remove(i);
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

    public boolean checkIteration(Quan q1, Quan q2){
        boolean check ;
        if(q1.getTenSP().equals(q2.getTenSP())  && q1.getGiaNhap().equals(q2.getGiaNhap())  && q1.getGiaBan().equals(q2.getGiaBan())
                && q1.getSize().equals(q2.getSize())  &&
        q1.getMauSac().equals(q2.getMauSac())  && q1.getChatLieu().equals(q2.getChatLieu())  &&
                q1.getXuatXu().equals(q2.getXuatXu())
                && q1.getKieuDangQuan().equals(q2.getKieuDangQuan())  && q1.getMau().equals(q2.getMau())
                && q1.getLoaiKhoa().equals(q2.getLoaiKhoa())  &&
        q1.getPhongCach().equals(q2.getPhongCach())  && q1.getLoaiQuan().equals(q2.getLoaiQuan()) ){
            check = true;
        } else {
            check = false;
        }

        return check;
    }
}
