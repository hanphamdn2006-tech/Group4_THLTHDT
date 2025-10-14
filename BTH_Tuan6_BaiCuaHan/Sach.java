public class Sach {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
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


    public void hienThiThongTin ()
    {
        System.out.println (this.toString());
        System.out.println ("------------------------------------");
    }   

    @Override
    public String toString() {
        return String.format("Ma Sach: %s | Tieu de: %s | Tac gia: %s | Nam XB: %d | So luong: %d",
                             maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }
}

