package BTH_Tuan8_BaiCuaMen;
import java.util.Scanner;

public class Test_Tuan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new IQuanLySachImpl();

        int chon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: {
                    System.out.println("\n--- Nhap thong tin sach giao trinh ---");
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Vi tri: ");
                    String vt = sc.nextLine();
                    System.out.print("Mon hoc: ");
                    String mh = sc.nextLine();
                    System.out.print("Cap do: ");
                    String cd = sc.nextLine();

                    Sach gt = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, vt, mh, cd);
                    quanLy.themSach(gt);
                    break;
                }

                case 2: {
                    System.out.println("\n--- Nhap thong tin sach tieu thuyet ---");
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Vi tri: ");
                    String vt = sc.nextLine();
                    System.out.print("The loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La sach series? (true/false): ");
                    boolean series = Boolean.parseBoolean(sc.nextLine());

                    Sach tt = new SachTieuThuyet(ma, td, tg, nam, sl, gia, vt, tl, series);
                    quanLy.themSach(tt);
                    break;
                }

                case 3:
                    System.out.println("\n--- DANH SACH SACH ---");
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("\nNhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach sachTim = quanLy.timKiemSach(maTim);
                    if (sachTim != null) {
                        System.out.println("\nDa tim thay sach:");
                        System.out.println(sachTim);
                    } else {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 5:
                    System.out.print("\nNhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        } while (chon != 0);
    }
}
