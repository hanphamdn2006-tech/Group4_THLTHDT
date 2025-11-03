import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach;

    public QuanLySachImpl() {
        danhSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    @Override
    public void xoaSach(String maSach) {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            System.out.println("Da cap nhat so luong sach [" + s.getTieuDe() + "] thanh: " + soLuongMoi);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach hien dang rong.");
        } else {
            System.out.println("===== DANH SACH SACH =====");
            for (Sach s : danhSach) {
                System.out.println(s);
                double giaBan = s.tinhGiaBan();
                System.out.println("Gia ban uoc tinh: " + giaBan + " VND");
                System.out.println("------------------------------------");
            }
        }
    }

    public void kiemTraTonKho(int soLuongToiThieu) {
        boolean coSachThieu = false;
        for (Sach s : danhSach) {
            if (!s.kiemTraTonKho(soLuongToiThieu)) {
                System.out.println("Sach [" + s.getTieuDe() + "] khong du ton kho (con " + s.getSoLuong() + ")");
                coSachThieu = true;
            }
        }
        if (!coSachThieu) {
            System.out.println("Tat ca sach deu du ton kho (>= " + soLuongToiThieu + ")");
        }
    }

    public void capNhatViTri(String viTriMoi) {
        for (Sach s : danhSach) {
            s.capNhatViTri(viTriMoi);
        }
        System.out.println("Da cap nhat vi tri cho tat ca sach sang: " + viTriMoi);
    }
}
