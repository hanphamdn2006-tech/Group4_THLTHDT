public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo, double giaCoBan, String viTri )
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.monHoc=monHoc;
        this.capDo=capDo;
    }


    public String getmonHoc () {
       return monHoc;
    }
    public void setmonHoc (String monHoc) {
       this.monHoc=monHoc;
    }

    public String getcapDo () {
       return capDo ;
    }
    public void setcapDo (String capDo) {
       this.capDo=capDo;
    }

    public void hienThiThongTin ()
    {
        System.out.println (this.toString());
        System.out.println ("------------------------------------");
    }   

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getnamxuatban();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "[Giao Trinh] " + super.toString() +"\n"+
                " Mon hoc: " + monHoc +"\n"+
                " Gia ban: " + tinhGiaBan() + " VND";
    }
 
}
