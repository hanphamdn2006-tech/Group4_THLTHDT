public class Test1 {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT001", "Giai tich 1", "Nguyen Van A", 2020, 10, "Toan hoc", "Dai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2001, 5, "Phieu luu", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT002", "Nha gia kim", "Paulo Coelho", 2015, 8, "Truyen cam hung", false);

        ql.themSach(sg1);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("\n=== Danh sach sach hien co ===");
        ql.hienThiTatCa();

        System.out.println("\n=== Tim sach theo ma TT001 ===");
        Sach timThay = ql.timKiemTheoMa("TT001");
        if (timThay != null) {
            System.out.println(timThay);
        }
        else {
            System.out.println("Khong tim thay sach.");
        }

        System.out.println("\n=== Cap nhat so luong sach GT001 ===");
        ql.capNhatSoLuong("GT001", 15);
        ql.hienThiTatCa();

        System.out.println("\n=== Xoa sach TT002 ===");
        ql.xoaSach("TT002");
        ql.hienThiTatCa();
    }
}
