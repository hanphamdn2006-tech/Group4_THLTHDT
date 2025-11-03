public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public Sach(String maSach, String tieuDe, String tacGia, int soLuong) {
        this(maSach, tieuDe, tacGia, 0, soLuong);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        String nam;
            if (namXuatBan == 0) {
                nam = "Chua xac dinh";
            } else {
                nam = String.valueOf(namXuatBan);
            }       
        return "Ma sach: " + maSach + ", Tieu de: " + tieuDe + ", Tac gia: " + tacGia + ", Nam xuat ban: " + nam + ", So luong: " + soLuong;
    }
        public void hienThiThongTin ()
    {
        System.out.println (this.toString());
        System.out.println ("------------------------------------");
    }
    
}

