package BTH_Tuan7_BaiCuaMen;
public class SachGiaoTrinh extends Sach implements IKiemKe{
    private String monHoc;
    private String capDo;
    
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc=monHoc;
        this.capDo=capDo;
    }
    public String getMonHoc() {
        return monHoc;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc=monHoc;
    }
    public String getCapDo(){
        return capDo;
    }
    public void setCapDo(String capDo) {
        this.capDo=capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMon hoc: " + monHoc +
                "\nCap do: " + capDo +
                "\nGia ban: " + tinhGiaBan();
    }
    @Override
    public double tinhGiaBan() {
    int soNam = 2025 - getNamXuatBan();
    return getGiaCoBan() + (soNam * 5000);
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println(" Da chuyen sach\"" + getTieuDe() + "\" den khu vuc: " + viTriMoi);
    }
}
