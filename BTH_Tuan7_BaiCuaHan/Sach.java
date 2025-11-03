public abstract class Sach {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;
    
    public Sach () {};

    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getmasach () {
        return maSach;
    }
    public void setmasach (String maSach) {
        this.maSach = maSach;
    }

    public String gettieude () {
        return tieuDe;
    }
    public void settieude (String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String gettacgia () {
        return tacGia;
    }
    public void settacgia (String tacGia) {
        this.tacGia = tacGia;
    }

    public int getnamxuatban () {
        return namXuatBan;
    }
    public void setnamxuatban (int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getsoluong (int soLuong) {
        return soLuong;
    }
    public void setsoluong (int soLuong) {
        this.soLuong = soLuong;
    }

     public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }


    public void hienThiThongTin ()
    {
        System.out.println (this.toString());
        System.out.println ("------------------------------------");
    }   

    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
                ", Tên sách: " + tieuDe +
                ", Tác giả: " + tacGia +
                ", Năm xuất bản: " + namXuatBan +
                ", Số lượng: "+ soLuong+
                ", Giá cơ bản: " + giaCoBan + " VNĐ";
    }

}

