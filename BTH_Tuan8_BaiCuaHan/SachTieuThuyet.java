public class SachTieuThuyet extends Sach 
{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String viTri, double giaCoBan, String theLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.theLoai=theLoai;
        this.laSachSeries=laSachSeries;
    }

    public String gettheLoai () {
       return theLoai;
    }
    public void settheLoai (String theLoai) {
       this.theLoai=theLoai;
    }

    public boolean islaSachSeries () {
       return laSachSeries;
    }
    public void setlaSachSeries (boolean laSachSeries) {
       this.laSachSeries=laSachSeries;
    }


   @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "[Tiểu Thuyết] " + super.toString() +
                ", Là series: " + (laSachSeries ? "Đúng" : "Sai") +
                ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
