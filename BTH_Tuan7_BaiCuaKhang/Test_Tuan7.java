public class Test_Tuan7 {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        Sach sg1 = new SachGiaoTrinh("GT001", "Lap trinh Java", "Nguyen Van A", 2020, 5, 80000, "CNTT", "Dai hoc");
        Sach st1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2005, 3, 100000, "Phieu luu", true);
        Sach st2 = new SachTieuThuyet("TT002", "Mat biec", "Nguyen Nhat Anh", 0, 2, 90000, "Tinh cam", false);

        ql.themSach(sg1);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("\n=== Danh sach sach hien co ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== Tim sach theo ma TT001 ===");
        Sach timThay = ql.timKiemTheoMa("TT001");
        if (timThay != null) {
            System.out.println(timThay);
        } else {
            System.out.println("Khong tim thay sach.");
        }

        System.out.println("\n=== Cap nhat so luong sach GT001 ===");
        ql.capNhatSoLuong("GT001", 15);
        ql.hienThiDanhSach();

        System.out.println("\n=== Xoa sach TT002 ===");
        ql.xoaSach("TT002");
        ql.hienThiDanhSach();

    }
}
