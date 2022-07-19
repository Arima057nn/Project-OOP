package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class App {

    public static List<Quan> SANPHAMQUAN = new ArrayList<Quan>();
    public static List<Ao> SANPHAMAO = new ArrayList<Ao>();
    public static List<Giay> SANPHAMGIAY = new ArrayList<Giay>();
    public static List<NhanVien> NHANVIEN = new ArrayList<NhanVien>();
    public static List<CaLamViec> CALAMVIEC =  new ArrayList<CaLamViec>();
    public static List<DangKiCaLamViec> DANGKICALAMVIEC = new ArrayList<DangKiCaLamViec>();
    public static List<DangKiCaLamViec> CONG = new ArrayList<DangKiCaLamViec>();
    public static List<HoaDon> HOADON = new ArrayList<HoaDon>();
    public static List<ChiPhiPhu> CHIPHIPHU = new ArrayList<ChiPhiPhu>();
    private static final String COMMA_DELIMITER = ","; // Split by comma


    public static void menu(){
        System.out.println("_______________Quản lí cửa hàng bán quần áo__________________");
        System.out.println("1. Quản lí sản phẩm.");
        System.out.println("2. Quản lí nhân viên.");
        System.out.println("3. Quản lí ca làm việc");
        System.out.println("4. Quản lí lương nhân viên");
        System.out.println("5. Bán hàng");
        System.out.println("6. Quản lí doanh thu.");
        System.out.println("7. Thoát.");
    }


    public static void menu1(){
        System.out.println("--------------------Chọn loại sản phẩm------------------");
        System.out.println("1. Quần.");
        System.out.println("2. Áo.");
        System.out.println("3. Giày.");
        System.out.println("4. Thoát.");
    }

    public static void submenu1(){
        System.out.println("-----------------------Quản lí sản phẩm------------------");
        System.out.println("1. Thêm sản phẩm mới.");
        System.out.println("2. Chỉnh sửa.");
        System.out.println("3. Xóa sản phẩm.");
        System.out.println("4. Hiển thị danh sách các sản phẩm.");
        System.out.println("5. Doc file");
        System.out.println("6. Thoát");
    }

    public static void menu2(){ // Menu để quản lí nhân viên
        System.out.println("-----------------------Quản lí nhân viên-------------------");
        System.out.println("1. Thêm nhân viên mới");
        System.out.println("2. Chỉnh sửa thông tin nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Hiển thị danh sách nhân viên");
        System.out.println("5. Doc file");
        System.out.println("6. Thoát");

    }

    public static void menu3(){ // Menu để quản lí ca làm việc
        System.out.println("----------------------Quản lí ca làm việc-------------------");
        System.out.println("1. Thêm ca làm việc mới");
        System.out.println("2. Chỉnh sửa ca làm việc");
        System.out.println("3. Xóa ca làm việc");
        System.out.println("4. Hiển thị ca làm việc");
        System.out.println("5. Đăng kí ca làm việc");
        System.out.println("6. Doc file");
        System.out.println("7. Thoát");
    }

    public static void menu35(){ // Menu Quản lí đăng kí ca làm việc
        System.out.println("----------------------Đăng kí ca làm việc--------------------");
        System.out.println("1. Thêm đăng kí mới");
        System.out.println("2. Sửa đăng kí");
        System.out.println("3. Xóa đăng kí");
        System.out.println("4. Hiển thị danh sách đăng kí");
        System.out.println("5. Thoát");
    }

    public static void menu4(){ // Menu Quản lí lương
        System.out.println("----------------------Quản lí lương nhân viên------------------");
        System.out.println("1. Chấm công");
        System.out.println("2. Tính lương");
        System.out.println("3. Thoát.");
    }

    public static void menu41(){
        System.out.println("----------------------Chấm công----------------------------------");
        System.out.println("1. Thêm công mới.");
        System.out.println("2. Hiển thị danh sách công.");
        System.out.println("3. Xóa công đã chấm.");
        System.out.println("4. Thoát.");
    }

    public static void menu6(){
        System.out.println("1. Hiển thị hóa đơn bán hàng");
        System.out.println("2. Quản lí các chi phí phụ");
        System.out.println("3. Tính doanh thu theo khoảng thời gian.");
        System.out.println("4. Thoát.");
    }

    public static void menu62(){
        System.out.println("1. Thêm mới");
        System.out.println("2. chỉnh sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Hiển thị");
        System.out.println("5. Doc file");
        System.out.println("6. Thoát.");
    }

    public static void main(String args[]){


        for(int i=0;i<5;i++){

            Quan quan = new Quan("1" + i, 1.1 + i, 1.2+ i, 2, "L" + i, "Đen" + i,
                    "da" + i, "VN" + i,
                    "kieuDangQuan" + i, "mau" + i, "loaiKhoa" + i, "phongCach" + i, "loaiQuan" + i );
            App.SANPHAMQUAN.add(quan);
        }

        for(int i=0;i<5;i++){

            Ao ao = new Ao("1" + i, 1.1 + i, 1.2+ i, 2, "L" + i, "Đen" + i,
                    "da" + i, "VN" + i,
                    "coAo" + i, "mauAo" + i, "chieuDaiTayAo" + i, "loaiAo" + i);
            App.SANPHAMAO.add(ao);
        }

        for(int i=0;i<5;i++){

            Giay giay = new Giay("1" + i, 1.1 + i, 1.2+ i, 2, "L" + i, "Đen" + i,
                    "da" + i, "VN" + i,
                    "kieuCoGiay" + i, "dip" + i, "loaiGiay" + i);
            App.SANPHAMGIAY.add(giay);
        }

        for(int i=0;i<5;i++){

            NhanVien nhanvien = new NhanVien("nv" + i+ 1, "sdt" + i + 1, 2000 + 1000*i);
            App.NHANVIEN.add(nhanvien);
        }

        for(int i=0;i<5;i++){

            CaLamViec caLamViec = new CaLamViec("1" + i, "1" + i, "1"+ i, "7", "12");
            App.CALAMVIEC.add(caLamViec);
        }


        int function = 0, function1 = 0, subFunction1 = 0/* cho sản phẩm quần*/;
        int subFunction2 = 0; // cho sản phẩm áo
        int subFunction3 = 0; // cho sản phẩm Giay

        do{
            // Menu cấp 1
            menu();
            Scanner inputs = new Scanner(System.in);

            try{
                System.out.print("Chọn chức năng: ");
                function = inputs.nextInt();


                switch (function){

                    case 1:

                        // Quản lí sản phẩm
                        do {
                            menu1();// Menu cho phần chọn loại sản phẩm trong chức năng quản lí sản phẩm
                            Scanner input1s = new Scanner(System.in);
                            try {
                                System.out.print("Chọn chức năng: ");
                                function1 = input1s.nextInt();


                                switch (function1) {

                                    case 1: // Đã test xong
                                        // sản phẩm quần
                                        QuanLiSanPhamQuan qlspQuan = new QuanLiSanPhamQuan();
                                        do {
                                            submenu1(); // Menu cấp cho phần quản lí sản phẩm
                                            Scanner subinput1s = new Scanner(System.in);
                                            try {
                                                System.out.print("Chọn chức năng: ");
                                                subFunction1 = subinput1s.nextInt();


                                                switch (subFunction1) {

                                                    case 1: // Thêm sản phẩm quần
                                                        qlspQuan.insert();
                                                        break;
                                                    case 2:
                                                        qlspQuan.update();
                                                        break;
                                                    case 3:
                                                        qlspQuan.delete();
                                                        break;
                                                    case 4:
                                                        qlspQuan.show();
                                                        break;
                                                    case 5:
                                                        BufferedReader br = null;
                                                        try {
                                                            String line;
                                                            br = new BufferedReader(new FileReader("D:\\2021-2\\OOP\\Project\\src\\Data\\Quan.csv"));

                                                            // How to read file in java line by line?
                                                            while ((line = br.readLine()) != null) {
                                                                String[] splitData = line.split(COMMA_DELIMITER);
                                                                Quan quan1 = new Quan(splitData[0],Double.parseDouble(splitData[1]),
                                                                        Double.parseDouble(splitData[2]),Integer.parseInt(splitData[3]),splitData[4],
                                                                        splitData[5],splitData[6],splitData[7],
                                                                        splitData[8],splitData[9],splitData[10],splitData[11],splitData[12] );
                                                                App.SANPHAMQUAN.add(quan1);
                                                            }

                                                        } catch (IOException e) {
                                                            e.printStackTrace();
                                                        } finally {
                                                            try {
                                                                if (br != null)
                                                                    br.close();
                                                            } catch (IOException crunchifyException) {
                                                                crunchifyException.printStackTrace();
                                                            }
                                                        }

                                                        break;
                                                    default:
                                                        break;

                                                }

                                            } catch (InputMismatchException ei) {
                                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }


                                        } while(subFunction1 != 6);

                                        break;

                                    case 2:
                                        //Sản phẩm áo
                                        QuanLiSanPhamAo qlspAo = new QuanLiSanPhamAo();
                                        do {
                                            submenu1(); // Menu cấp cho phần quản lí sản phẩm
                                            Scanner subinput2s = new Scanner(System.in);
                                            try {
                                                System.out.print("Chọn chức năng: ");
                                                subFunction2 = subinput2s.nextInt();


                                                switch (subFunction2) {

                                                    case 1: // Thêm sản phẩm áo
                                                        qlspAo.insert();
                                                        break;
                                                    case 2:
                                                        qlspAo.update();
                                                        break;
                                                    case 3:
                                                        qlspAo.delete();
                                                        break;
                                                    case 4:
                                                        qlspAo.show();
                                                        break;

                                                    case 5:
                                                        BufferedReader br = null;
                                                        try {
                                                            String line;
                                                            br = new BufferedReader(new FileReader("D:\\2021-2\\OOP\\Project\\src\\Data\\Ao.csv"));

                                                            // How to read file in java line by line?
                                                            while ((line = br.readLine()) != null) {
                                                                String[] splitData = line.split(COMMA_DELIMITER);
                                                                Ao ao1 = new Ao(splitData[0],Double.parseDouble(splitData[1]),
                                                                        Double.parseDouble(splitData[2]),Integer.parseInt(splitData[3]),splitData[4],
                                                                        splitData[5],splitData[6],splitData[7],
                                                                        splitData[8],splitData[9],splitData[10],splitData[11]);
                                                                App.SANPHAMAO.add(ao1);
                                                            }

                                                        } catch (IOException e) {
                                                            e.printStackTrace();
                                                        } finally {
                                                            try {
                                                                if (br != null)
                                                                    br.close();
                                                            } catch (IOException crunchifyException) {
                                                                crunchifyException.printStackTrace();
                                                            }
                                                        }

                                                        break;
                                                    default:
                                                        break;

                                                }

                                            } catch (InputMismatchException ei) {
                                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }


                                        } while(subFunction2 != 6);

                                        break;
                                    case 3:
                                        // sản phẩm Giay
                                        QuanLiSanPhamGiay qlspGiay = new QuanLiSanPhamGiay();
                                        do {
                                            submenu1(); // Menu cấp cho phần quản lí sản phẩm
                                            Scanner subinput3s = new Scanner(System.in);
                                            try {
                                                System.out.print("Chọn chức năng: ");
                                                subFunction3 = subinput3s.nextInt();


                                                switch (subFunction3) {

                                                    case 1: // Thêm sản phẩm quần
                                                        qlspGiay.insert();
                                                        break;
                                                    case 2:
                                                        qlspGiay.update();
                                                        break;
                                                    case 3:
                                                        qlspGiay.delete();
                                                        break;
                                                    case 4:
                                                        qlspGiay.show();
                                                        break;
                                                    case 5:
                                                        BufferedReader br = null;
                                                        try {
                                                            String line;
                                                            br = new BufferedReader(new FileReader("D:\\2021-2\\OOP\\Project\\src\\Data\\Giay.csv"));

                                                            // How to read file in java line by line?
                                                            while ((line = br.readLine()) != null) {
                                                                String[] splitData = line.split(COMMA_DELIMITER);
                                                                Giay giay1 = new Giay(splitData[0],Double.parseDouble(splitData[1]),
                                                                        Double.parseDouble(splitData[2]),Integer.parseInt(splitData[3]),splitData[4],
                                                                        splitData[5],splitData[6],splitData[7],
                                                                        splitData[8],splitData[9],splitData[10]);
                                                                App.SANPHAMGIAY.add(giay1);
                                                            }

                                                        } catch (IOException e) {
                                                            e.printStackTrace();
                                                        } finally {
                                                            try {
                                                                if (br != null)
                                                                    br.close();
                                                            } catch (IOException crunchifyException) {
                                                                crunchifyException.printStackTrace();
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;

                                                }

                                            } catch (InputMismatchException ei) {
                                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }


                                        } while(subFunction3 != 6);

                                        break;

                                    default:
                                        break;

                                }

                            } catch (InputMismatchException ei) {
                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }


                        } while(function1 != 4);

                        break;
                    case 2: // Đã test xong
                        int functionNV = 0; // cho nhân viên
                        QuanliNhanVien qlnv = new QuanliNhanVien();
                        do{
                            menu2();
                            Scanner input2s = new Scanner(System.in);
                            try{
                                System.out.print("Chọn chức năng: ");
                                functionNV = input2s.nextInt();
                                switch (functionNV){
                                    case 1:
                                        qlnv.insert();
                                        break;
                                    case 2:
                                        qlnv.update();
                                        break;
                                    case 3:
                                        qlnv.delete();
                                        break;
                                    case 4:
                                        qlnv.show();
                                        break;
                                    case 5:
                                        BufferedReader br = null;
                                        try {
                                            String line;
                                            br = new BufferedReader(new FileReader("D:\\2021-2\\OOP\\Project\\src\\Data\\NhanVien.csv"));

                                            // How to read file in java line by line?
                                            while ((line = br.readLine()) != null) {
                                                String[] splitData = line.split(COMMA_DELIMITER);
                                                NhanVien nv1 = new NhanVien(splitData[0],splitData[1], Integer.parseInt(splitData[2]));
                                                App.NHANVIEN.add(nv1);
                                            }

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        } finally {
                                            try {
                                                if (br != null)
                                                    br.close();
                                            } catch (IOException crunchifyException) {
                                                crunchifyException.printStackTrace();
                                            }
                                        }

                                        break;
                                    default: break;
                                }

                            } catch(InputMismatchException ei){
                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                            } catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                        } while(functionNV != 5);

                        break;
                    case 3:
                        int functionCLV = 0; // cho nhân viên
                        QuanLiCaLamViec qlclv = new QuanLiCaLamViec();
                        QuanLiDangKiCaLamViec qldkclv = new QuanLiDangKiCaLamViec();
                        do{
                            menu3();
                            Scanner input3s = new Scanner(System.in);
                            try{
                                System.out.print("Chọn chức năng: ");
                                functionCLV = input3s.nextInt();
                                switch (functionCLV){
                                    case 1:
                                        qlclv.insert();
                                        break;
                                    case 2:
                                        qlclv.update();
                                        break;
                                    case 3:
                                        qlclv.delete();
                                        break;
                                    case 4:
                                        qlclv.show();
                                        break;
                                    case 6:
                                        BufferedReader br = null;
                                        try {
                                            String line;
                                            br = new BufferedReader(new FileReader("D:\\2021-2\\OOP\\Project\\src\\Data\\Calamviec.csv"));
                                            // How to read file in java line by line?
                                            while ((line = br.readLine()) != null) {
                                                String[] splitData = line.split(COMMA_DELIMITER);
                                                CaLamViec clv1 = new CaLamViec(splitData[0],splitData[1], splitData[2], splitData[3], splitData[4]);
                                                App.CALAMVIEC.add(clv1);
                                            }

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        } finally {
                                            try {
                                                if (br != null)
                                                    br.close();
                                            } catch (IOException crunchifyException) {
                                                crunchifyException.printStackTrace();
                                            }
                                        }


                                        break;
                                    case 5: // Quản lí đăng kí ca làm việc
                                        Integer functionQLDKCLV = 0;
                                        do {
                                            menu35();// menu quản lí đăng kí ca làm việc
                                            Scanner input35s = new Scanner(System.in);
                                            try {
                                                System.out.print("Chọn chức năng: ");
                                                functionQLDKCLV = input35s.nextInt();


                                                switch (functionQLDKCLV) {
                                                    case 1: // Thêm sản phẩm quần
                                                        qldkclv.insert();
                                                        break;
                                                    case 2:
                                                        qldkclv.update();
                                                        break;
                                                    case 3:
                                                        qldkclv.delete();
                                                        break;
                                                    case 4:
                                                        qldkclv.show();
                                                        break;
                                                    default:
                                                        break;

                                                }

                                            } catch (InputMismatchException ei) {
                                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }


                                        } while(functionQLDKCLV != 5);

                                        break;
                                    default: break;
                                }

                            } catch(InputMismatchException ei){
                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                            } catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                        } while(functionCLV != 6);
                        break;
                    case 4:
                        Integer functionCC= 0;
                        QuanLiChamCong qlcc = new QuanLiChamCong();
                        do {
                            menu4(); // Menu cấp cho phần quản lí sản phẩm
                            Scanner subinput4s = new Scanner(System.in);
                            try {
                                System.out.print("Chọn chức năng: ");
                                functionCC = subinput4s.nextInt();


                                switch (functionCC) {

                                    case 1: // Quản lí chấm công
                                        Integer functionChamCong = 0;
                                        do {
                                            menu41();// menu quản lí đăng kí ca làm việc
                                            Scanner input41s = new Scanner(System.in);
                                            try {
                                                System.out.print("Chọn chức năng: ");
                                                functionChamCong = input41s.nextInt();


                                                switch (functionChamCong) {
                                                    case 1: // Thêm sản phẩm quần
                                                        qlcc.insert();
                                                        break;
                                                    case 2:
                                                        qlcc.delete();
                                                        break;
                                                    case 3:
                                                        qlcc.show();
                                                        break;
                                                    default:
                                                        break;

                                                }

                                            } catch (InputMismatchException ei) {
                                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }


                                        } while(functionChamCong != 4);

                                        break;
                                    case 2: // Tính lương nhân viên
                                        qlcc.tinhLuong();
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        break;
                                }

                            } catch (InputMismatchException ei) {
                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } while(functionCC != 3);
                        break;
                    case 5:
                        QuanLiHoaDon qlhd = new QuanLiHoaDon();
                        qlhd.insert();
                        break;
                    case 6:
                        QuanLiHoaDon qlhd6 = new QuanLiHoaDon();
                        QuanLiChiPhiPhu qlcpp = new QuanLiChiPhiPhu();
                        QuanLiDoanhThu qldtobj = new QuanLiDoanhThu();
                        Integer functionQldt = 0;
                        do {
                            menu6();// menu quản lí doanh thu
                            Scanner input6s = new Scanner(System.in);
                            try {
                                System.out.print("Chọn chức năng: ");
                                functionQldt = input6s.nextInt();


                                switch (functionQldt) {
                                    case 1: // Hiển thị hóa đơn
                                        qlhd6.show();
                                        break;
                                    case 2: // Quản lí chi phí phụ
                                        Integer functionCPP = 0;
                                        do {
                                            menu62();// menu quản lí chi phí phụ
                                            Scanner input62s = new Scanner(System.in);
                                            try {
                                                System.out.print("Chọn chức năng: ");
                                                functionCPP = input62s.nextInt();


                                                switch (functionCPP) {
                                                    case 1: // Thêm sản phẩm quần
                                                        qlcpp.insert();
                                                        break;
                                                    case 2:
                                                        qlcpp.update();
                                                        break;
                                                    case 3:
                                                        qlcpp.delete();
                                                        break;
                                                    case 4:
                                                        qlcpp.show();
                                                        break;
                                                    case 5:
                                                        BufferedReader br = null;
                                                        try {
                                                            String line;
                                                            br = new BufferedReader(new FileReader("D:\\2021-2\\OOP\\Project\\src\\Data\\ChiPhiPhu.csv"));

                                                            // How to read file in java line by line?
                                                            while ((line = br.readLine()) != null) {
                                                                String[] splitData = line.split(COMMA_DELIMITER);
                                                                ChiPhiPhu cpp1 = new ChiPhiPhu(splitData[0], Integer.parseInt(splitData[1]), splitData[2],
                                                                        splitData[3],splitData[4]);
                                                                App.CHIPHIPHU.add(cpp1);
                                                            }

                                                        } catch (IOException e) {
                                                            e.printStackTrace();
                                                        } finally {
                                                            try {
                                                                if (br != null)
                                                                    br.close();
                                                            } catch (IOException crunchifyException) {
                                                                crunchifyException.printStackTrace();
                                                            }
                                                        }

                                                        break;
                                                    default:
                                                        break;

                                                }

                                            } catch (InputMismatchException ei) {
                                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }


                                        } while(functionCPP != 6);
                                        break;
                                    case 3:
                                        qldtobj.show();
                                        break;
                                    default:
                                        break;

                                }

                            } catch (InputMismatchException ei) {
                                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } while (functionQldt != 4);
                    default: break;

                }

            }
            catch(InputMismatchException ei){
                System.out.println("Bạn nhập sai giá trị, vui lòng nhập lại.");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }


        } while(function != 7);

        // Lưu giữ thông tin vào file


        System.out.println("Kết thúc.");
    }
}
