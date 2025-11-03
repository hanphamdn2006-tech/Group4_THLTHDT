

public interface IQuanLySach {
    void themSach(Sach s);
    Sach timKiemSach(String tieuDe); 
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
    Sach timKiemTheoMa(String maSach); 
    void capNhatSoLuong (String maSach, int soLuongMoi);
    void locSach (String loaiSach, String tieuChi, String tuKhoa);
}