import java.util.Scanner;

public class Test_Tuan8 {
    public static void main(String[] args) {
        QuanLySachImpl ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Cap nhat so luong sach");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("6. Kiem tra ton kho");
            System.out.println("7. Cap nhat vi tri sach");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("Ban muon them loai sach nao?");
                    System.out.println("1. Sach giao trinh");
                    System.out.println("2. Sach tieu thuyet");
                    System.out.print("Chon: ");
                    int loai = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int namXuatBan = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap so luong: ");
                    int soLuong = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap gia co ban: ");
                    double giaCoBan = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap vi tri: ");
                    String viTri = sc.nextLine();

                    if (loai == 1) {
                        System.out.print("Nhap mon hoc: ");
                        String monHoc = sc.nextLine();
                        System.out.print("Nhap cap do: ");
                        String capDo = sc.nextLine();
                        ql.themSach(new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri, monHoc, capDo));
                    } else if (loai == 2) {
                        System.out.print("Nhap the loai: ");
                        String theLoai = sc.nextLine();
                        System.out.print("Co phai series khong (y/n): ");
                        String luaChon = sc.nextLine().toLowerCase();
                        boolean laSeries = luaChon.equals("y");
                        ql.themSach(new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri, theLoai, laSeries));
                    } else {
                        System.out.println("Lua chon khong hop le.");
                    }
                    break;

                case 2:
                    ql.hienThiDanhSach();
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = ql.timKiemTheoMa(maTim);
                    if (s != null) {
                        System.out.println(s);
                        System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
                    } else {
                        System.out.println("Khong tim thay sach.");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String maCN = sc.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int slMoi = Integer.parseInt(sc.nextLine());
                    ql.capNhatSoLuong(maCN, slMoi);
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                    break;

                case 6:
                    System.out.print("Nhap so luong toi thieu de kiem tra ton kho: ");
                    int soLuongToiThieu = Integer.parseInt(sc.nextLine());
                    ql.kiemTraTonKho(soLuongToiThieu);
                    break;

                case 7:
                    System.out.print("Nhap vi tri moi cho sach: ");
                    String viTriMoi = sc.nextLine();
                    ql.capNhatViTri(viTriMoi);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (chon != 0);

        sc.close();
    }
}
