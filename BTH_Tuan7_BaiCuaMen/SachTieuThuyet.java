package BTH_Tuan7_BaiCuaMen;
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;       
    private boolean laSachSeries; 
    
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public boolean isLaSachSeries() {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
   
    @Override
    public String toString() {
        return super.toString() +
                "\nThe loai: " + theLoai +
                "\nLa sach series: " + (laSachSeries ? "Co" : "Khong") +
                "\nGia ban: " + tinhGiaBan();
    }
    @Override
    public double tinhGiaBan(){
        return getGiaCoBan() + (laSachSeries ? 15000 :0);
    }
    @Override
     public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen den \"" + getTieuDe() + "\" Den khu vuc: " + viTriMoi);
    }
}
