public abstract class Sach implements IGiaBan, IKiemKe {

    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    protected String viTri;
    


    public Sach () {};

    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri;
    }


    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
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

    public int getsoluong () {
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
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri=viTriMoi;
        System.out.println("Da chuyen sach " + tieuDe + " den khu vuc:" + viTriMoi);
        
    }

    public void capNhatSoLuong(int soLuongMoi) {
    this.soLuong=soLuongMoi;
    System.out.println("Da cap nhat" + soLuongMoi);
    
}

    @Override
    public String toString() {
        return "Ma sach: " + maSach +"\n"+
                " Ten sach: " + tieuDe +"\n"+
                " Tac gia: " + tacGia +"\n"+
                " NXB: " + namXuatBan +"\n"+
                " So luong: "+ soLuong+"\n"+
                " Vi tri: " + viTri +"\n"+
                " Gia co ban: " + giaCoBan + " VND";
    }


}

