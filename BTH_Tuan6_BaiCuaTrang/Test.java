public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lap trinh Java", "Nguyen Van A", 2023, 10);

        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Co so du lieu");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2022);
        sach2.setSoLuong(5);

        System.out.println("=== Thong tin Sach 1 ===");
        sach1.hienThiThongTin();

        System.out.println("\n=== Thong tin Sach 2 ===");
        sach2.hienThiThongTin();
    }
}