import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    public void xoaSach(String maSach) {
        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            Sach s = danhSach.get(i);
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(i);
                System.out.println("Da xoa sach co ma: " + maSach);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        boolean timThay = false;
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach ma " + maSach + " thanh: " + soLuongMoi);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach hien dang rong.");
        } 
        else {
            System.out.println("===== DANH SACH SACH =====");
            for (Sach s : danhSach) {
                System.out.println(s);
                System.out.println ("------------------------------------");

            }
        }
    }
}
