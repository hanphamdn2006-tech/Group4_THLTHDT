import java.util.List;

public interface IQuanLySach {
    List<Sach> layDanhSach();
    void themSach (Sach sach);
    Sach timKiemSach (String maSach);
    void xoaSach(String maSach); 
    void hienThiDanhSach();
}
