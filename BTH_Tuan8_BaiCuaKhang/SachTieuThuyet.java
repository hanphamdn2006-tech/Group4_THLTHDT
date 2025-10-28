public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String viTri, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
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
    public double tinhGiaBan() {
        if (namXuatBan == 0) {
            return -1;
        } else {
            return giaCoBan + (laSachSeries ? 15000 : 0);
        }
    }

    @Override
    public String toString() {
    return super.toString()
        + "\nThe loai: " + theLoai
        + "\nLa sach series: " + (laSachSeries ? "Co" : "Khong");
}

}
