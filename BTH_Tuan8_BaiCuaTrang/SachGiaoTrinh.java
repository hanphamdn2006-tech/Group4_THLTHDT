public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,String viTri, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNamDaXuatBan * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Đã chuyển sách " + getTieuDe() + " đến khu vực: + viTriMoi");
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nMon hoc: " + monHoc +
                "\nCap do: " + capDo +
                "\nGia ban: " + tinhGiaBan();
    }
}
