package BTH_Tuan6_BaiCuaMen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<Sach> danhSach; 
    private Scanner sc = new Scanner(System.in);

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach() {
        System.out.println("THEM SACH MOI");
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        int sl = Integer.parseInt(sc.nextLine());
        System.out.print("Chon loai sach (1. Giao trinh  2. Tieu thuyet): ");
        int loai = Integer.parseInt(sc.nextLine());

        Sach sach = null;
        if (loai == 1) {
            System.out.print("Nhap mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.print("Nhap cap do: ");
            String capDo = sc.nextLine();
            sach = new SachGiaoTrinh(ma, tieuDe, tacGia, nam, sl, monHoc, capDo);
        } else if (loai == 2) {
            System.out.print("Nhap the loai: ");
            String theLoai = sc.nextLine();
            System.out.print("Sach co thuoc series khong? (true/false): ");
            boolean laSeries = Boolean.parseBoolean(sc.nextLine());
            sach = new SachTieuThuyet(ma, tieuDe, tacGia, nam, sl, theLoai, laSeries);
        }

        danhSach.add(sach);
        System.out.println("Them sach thanh cong!");
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void xoaSach(String ma) {
        Iterator<Sach> it = danhSach.iterator(); 
        boolean found = false;
        while (it.hasNext()) {
            Sach s = it.next();
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                it.remove();
                found = true;
                System.out.println("Da xoa sach co ma: " + ma);
                break;
            }
        }
        if (!found) System.out.println("Khong tim thay ma sach nay!");
    }

    public void capNhatSach(String ma) {
        boolean found = false;
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                found = true;
                System.out.print("Nhap tieu de moi: ");
                s.setTieuDe(sc.nextLine());
                System.out.print("Nhap tac gia moi: ");
                s.setTacGia(sc.nextLine());
                System.out.print("Nhap nam xuat ban moi: ");
                s.setNamXuatBan(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhap so luong moi: ");
                s.setSoLuong(Integer.parseInt(sc.nextLine()));
                System.out.println("Cap nhat thanh cong!");
                break;
            }
        }
        if (!found) System.out.println("Khong tim thay ma sach!");
    }
    public void capNhatSoLuong(String ma, int soLuongMoi) {
        boolean found = false;
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Cap nhat so luong thanh cong cho sach ma: " + ma);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sach co ma: " + ma);
        }
    }
    public Sach timKiemTheoMa(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }
    public void timSachTheoMa() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                System.out.println("Thong tin sach tim thay:");
                System.out.println(s.toString());
                return;
            }
        }
        System.out.println("Khong tim thay sach co ma " + ma);
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            System.out.println("DANH SACH SACH");
            for (Sach s : danhSach) {
                System.out.println(s.toString());
            }
        }
    }
}