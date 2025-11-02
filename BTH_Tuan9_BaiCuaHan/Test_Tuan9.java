import java.util.Scanner;

public class Test_Tuan9 {

    private static IQuanLySach quanLy = new QuanLySachImpl();
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {

        khoiTao();
        Menu();
    }

    private static void khoiTao () {
        System.out.println("===== 1. KHOI TAO VA THEM SACH =====");
        SachGiaoTrinh sgt01 = new SachGiaoTrinh ("sgt01", "TOAN ROI RAC", 
        "Nguyen Thi Mo", 2020, 100, "TOAN", "Dai hoc", 50000, "A1");
        SachTieuThuyet stt01 = new SachTieuThuyet ("stt01", "PASSION", 
        "YUUJI", 2024, 1000, "A2", 50000, "ROMANCE", true);
        quanLy.themSach(sgt01);
        quanLy.themSach(stt01);
    }

    private static void Menu() {
        while (true) {
            System.out.println("\n======= MENU QUAN LY SACH =======");
            System.out.println("1. Them sach moi (Giao trinh / Tieu thuyet)");
            System.out.println("2. Hien thi toan bo danh sach sach");
            System.out.println("3. Xoa sach theo ma");
            System.out.println("4. Tim sach theo tieu de");
            System.out.println("5. Kiem tra ton kho (theo ma sach)");
            System.out.println("6. Cap nhat vi tri (theo ma sach)");
            System.out.println("7. Cap nhat so luong (theo ma sach)");
            System.out.println("8. Loc thuoc tinh cua sach (theo loai sach)");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");

            try {
                int luaChon = Integer.parseInt(sc.nextLine());
                switch (luaChon) {
                    case 1:
                        themMoiSach();
                        break;
                    case 2:
                        quanLy.hienThiDanhSach();
                        break;
                    case 3:
                        xoaSach();
                        break;
                    case 4:
                        timSachTheoTieuDe();
                        break;
                    case 5:
                        kiemTraTonKho();
                        break;
                    case 6:
                        capNhatViTri();
                        break;
                    case 7:
                        capNhatSoLuong();
                        break;
                    case 8:
                        locSach();
                        break;
                    case 0:
                        System.out.println("Dang thoat chuong trinh...");
                        return; // Thoat khoi ham main
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap so.");
            }
        }
    }

    private static void capNhatSoLuong() {
        System.out.print("Nhap ma sach can cap nhat so luong: ");
        String ma = sc.nextLine();
        Sach s = quanLy.timKiemTheoMa(ma);
        if (s == null) {
            System.out.println("Khong tim thay sach nao co ma: " + ma);
            return;
        }
        System.out.println("So luong hien tai: " + s.getsoluong());
        System.out.print("Nhap so luong moi: ");
       int soLuongMoi = sc.nextInt();
        s.capNhatSoLuong(soLuongMoi);
    }

    private static void themMoiSach() {
        System.out.println("Chon loai sach (1: Sach Giao Trinh, 2: Sach Tieu Thuyet): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam XB: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vi tri: ");
        String viTri = sc.nextLine();
        System.out.print("Nhap gia co ban: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        Sach sachMoi;
        if (loai == 1) {
            System.out.print("Nhap mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.print("Nhap cap do: ");
            String capDo = sc.nextLine();
            sachMoi = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, monHoc, capDo, giaCoBan, viTri);
        } else {
            System.out.print("Nhap the loai: ");
            String theLoai = sc.nextLine();
            
            // Sửa lỗi logic từ câu hỏi trước của bạn
            System.out.print("Sach Series hay khong (y/n hoac yes/no): ");
            String traLoi = sc.nextLine();
            boolean laSachSeries = traLoi.equalsIgnoreCase("y") || traLoi.equalsIgnoreCase("yes") || traLoi.equalsIgnoreCase("co");
            
            sachMoi = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, viTri, giaCoBan, theLoai, laSachSeries);
        }
        quanLy.themSach(sachMoi);
    }

    private static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        if (quanLy.xoaSach(ma)) {
            System.out.println("Da xoa sach co ma " + ma);
        } else {
            System.out.println("Khong tim thay sach co ma " + ma);
        }
    }

    private static void timSachTheoTieuDe() {
        System.out.print("Nhap tieu de sach can tim: ");
        String tieuDe = sc.nextLine();
        Sach s = quanLy.timKiemSach(tieuDe);
        if (s != null) {
            System.out.println("--- SACH TIM THAY ---");
            System.out.println(s);
        } else {
            System.out.println("Khong tim thay sach nao co tieu de: " + tieuDe);
        }
    }

    private static void kiemTraTonKho() {
        System.out.print("Nhap ma sach can kiem tra: ");
        String ma = sc.nextLine();
        Sach s = quanLy.timKiemTheoMa(ma);

        if (s == null) {
            System.out.println("Khong tim thay sach.");
            return;
        }

        System.out.print("Nhap so luong ton toi thieu ban muon kiem tra: ");
        int min = Integer.parseInt(sc.nextLine());

        if (s.kiemTraTonKho(min)) {
            // Giả định bạn có getter là gettieude() và getsoluong()
            System.out.println("OK. Sach '" + s.gettieude() + "' (con " + s.getsoluong() + ") dap ung du so luong toi thieu (" + min + ").");
        } else {
            System.out.println("CANH BAO. Sach '" + s.gettieude() + "' (con " + s.getsoluong() + ") KHONG du so luong toi thieu (" + min + ").");
        }
    }

    private static void capNhatViTri() 
    {
        System.out.print("Nhap so luong sach can cap nhat vi tri: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soLuong; i++) 
        {
            System.out.println("\n--- Cap nhat sach thu " + (i + 1) + " ---");
            System.out.print("Nhap ma sach: ");
            String maSach = sc.nextLine();
            Sach s = quanLy.timKiemTheoMa(maSach);
            if (s == null) 
            {
                System.out.println("Khong tim thay sach co ma: " + maSach);
            } else 
            {
                System.out.println("Vi tri hien tai: " + s.getViTri());
                System.out.print("Nhap vi tri moi: ");
                String viTriMoi = sc.nextLine();
                s.capNhatViTri(viTriMoi);
                System.out.println("Da cap nhat vi tri cho sach '" + maSach + "' sang: " + viTriMoi);
            }
        }
    }

    
    private static void locSach() 
    {
        System.out.println("Chon loai sach can loc: \n (1. Sach tieu thuyet) \n (2. Sach giao trinh)");
        int loai = Integer.parseInt(sc.nextLine());
        String loaiSach = (loai == 1) ? "tieuthuyet" : "giaotrinh";
        String tieuChi = "";
        if (loai == 1) 
        {
            System.out.println("Loc theo (1. The loai, 2. Series): ");
            int chon = Integer.parseInt(sc.nextLine());
            tieuChi = (chon == 1) ? "theloai" : "series";
        } else 
        {
            System.out.println("Loc theo (1. Mon hoc, 2. Cap do): ");
            int chon = Integer.parseInt(sc.nextLine());
            tieuChi = (chon == 1) ? "monhoc" : "capdo";
        }
        System.out.print("Nhap tu khoa can loc: ");
        String tuKhoa = sc.nextLine();
        quanLy.locSach(loaiSach, tieuChi, tuKhoa);
    }
}
