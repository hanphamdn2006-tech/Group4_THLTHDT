package BTH_Tuan8_BaiCuaMen;
import java.util.ArrayList;
import java.util.List;

public class IQuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSachSach;

    public IQuanLySachImpl() {
        danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null; // không tìm thấy
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach sachCanXoa = timKiemSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Da xoa sach co ma: " + maSach);
            return true;
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
            return false;
        }
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.println("Danh sach cac sach");
            for (Sach s : danhSachSach) {
                System.out.println("----------------------------------");
                s.hienThiThongTin();
            }
        }
    }
}