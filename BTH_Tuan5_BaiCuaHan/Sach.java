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

    public void hienThiThongTin () {
        System.out.println ("Ma sach:" + maSach);
        System.out.println ("Tieu de:" + tieuDe);
        System.out.println ("Tac gia:" + tacGia);
        System.out.println ("Nam xuat ban:" + namXuatBan);
        System.out.println ("So luong:" + soLuong);
        System.out.println ("------------------------------------");
    }   
}