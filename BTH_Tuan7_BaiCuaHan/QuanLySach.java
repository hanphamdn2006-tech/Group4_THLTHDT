import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class QuanLySach 
{
    private List<Sach> danhSachSach;
    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    /**
     * Chức năng: Thêm một đối tượng Sach (hoặc lớp con của nó) vào danh sách.
     * @param sach Đối tượng Sach cần thêm.
     */
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("-> Da them sach: " + sach.gettieude());
    }

    /**
     * Chức năng: Hiển thị toàn bộ danh sách sách.
     * Thể hiện Đa hình: Lệnh System.out.println(sach) sẽ gọi phương thức toString() 
     * được ghi đè (override) phù hợp với loại sách (Sach, SachGiaoTrinh, SachTieuThuyet).
     */
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
        }
        System.out.println("-----------------------------------------------------------------");
    }
    
    /**
     * Chức năng: Tìm kiếm sách theo Mã Sách.
     * @param maSach Mã sách cần tìm.
     * @return Đối tượng Sach nếu tìm thấy, null nếu không tìm thấy.
     */
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getmasach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    /**
     * Chức năng: Cập nhật số lượng sách theo Mã Sách.
     * @param maSach Mã sách cần cập nhật.
     * @param soLuongMoi Số lượng mới.
     * @return true nếu cập nhật thành công, false nếu không tìm thấy.
     */
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sachCanCapNhat = timKiemTheoMa(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setsoluong(soLuongMoi); 
            System.out.println("-> CAP NHAT THANH CONG SACH CO MA " + maSach + ". SO LUONG MOI: " + soLuongMoi);
            return true;
        }
        System.out.println("-> ERROR: KHONG TIM THAY SACH CO MA " + maSach + " DE CAP NHAT.");
        return false;
    }
    
    /**
     * Chức năng: Xóa sách theo Mã Sách.
     * @param maSach Mã sách cần xóa.
     * @return true nếu xóa thành công, false nếu không tìm thấy.
     */
    public boolean xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSachSach.iterator();
        while (iterator.hasNext()) {
            Sach sach = iterator.next();
            if (sach.getmasach().equalsIgnoreCase(maSach)) {
                iterator.remove();
                System.out.println("-> DA XOA SACH CO MA: " + maSach + " (" + sach.gettieude() + ")");
                return true;
            }
        }
        System.out.println("->  ERROR: KHONG TIM THAY SACH CO MA " + maSach + " DE XOA.");
        return false;
    }
}
