public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public String toString() {
        return String.format("%s | Mon hoc: %s | Cap do: %s",super.toString(), monHoc,capDo);
    }
}
