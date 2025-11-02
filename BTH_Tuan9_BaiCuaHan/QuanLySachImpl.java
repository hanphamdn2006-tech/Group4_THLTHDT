import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach 
{
    private List<Sach> danhSachSach;
    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("-> Da them sach: " + sach.gettieude());
    }


    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach sach : danhSachSach) {
            if (sach.gettieude().equalsIgnoreCase(tieuDe)) {
                return sach;
            }
        }
        return null;
    }


    @Override
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getmasach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) {
         s.setsoluong(soLuongMoi);
            System.out.println("Da cap nhat so luong sach [" + s.gettieude() + "] thanh: " + soLuongMoi);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) {
            danhSachSach.remove(s);
            System.out.println("-> Da xoa sach co ma: " + maSach);
            return true;
        } else {
            System.out.println("⚠ Khong tim thay sach co ma: " + maSach);
            return false;
        }
    }

    @Override
    public void locSach(String loaiSach, String tieuChi, String tuKhoa) 
    {
    boolean timThay = false;
    for (Sach s : danhSachSach) 
        if (loaiSach.equalsIgnoreCase("tieuthuyet") && s instanceof SachTieuThuyet)
        {
            SachTieuThuyet stt = (SachTieuThuyet) s;
            if (tieuChi.equalsIgnoreCase("theloai") && stt.gettheLoai().equalsIgnoreCase(tuKhoa)) 
            {
                System.out.println(stt);
                timThay = true;
            } 
            else if (tieuChi.equalsIgnoreCase("series")) {
                boolean laSeries = tuKhoa.equalsIgnoreCase("co") ||
                                   tuKhoa.equalsIgnoreCase("yes") ||
                                   tuKhoa.equalsIgnoreCase("true");
                if (stt.islaSachSeries()==laSeries) 
                {
                    System.out.println(stt);
                    timThay = true;
                }
            }
        }
        else if (loaiSach.equalsIgnoreCase("giaotrinh") && s instanceof SachGiaoTrinh) 
        {
            SachGiaoTrinh sgt = (SachGiaoTrinh) s;

            if (tieuChi.equalsIgnoreCase("monhoc") && sgt.getmonHoc().equalsIgnoreCase(tuKhoa)) 
            {
                System.out.println(sgt);
                timThay = true;
            } 
            else if (tieuChi.equalsIgnoreCase("capdo") && sgt.getcapDo().equalsIgnoreCase(tuKhoa)) 
            {
                System.out.println(sgt);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach phu hop.");
        }
    }



    public void hienThiDanhSach() {
    if (danhSachSach.isEmpty()) {
        System.out.println("Danh sach hien dang trong.");
        return;
    }
    System.out.println("\n--- DANH SACH TAT CA SACH (Tong: " + danhSachSach.size() + " cuon) ---");
    for (Sach sach : danhSachSach) {
        // Đa hình: Phương thức toString() được gọi sẽ khác nhau tùy thuộc vào loại đối tượng thực tế
        System.out.println(sach); 
        System.out.println("Gia ban uoc tinh: " +sach.tinhGiaBan());
        System.out.println("------------------");
    }
    System.out.println("-----------------------------------------------------------------");
}

}
