public class Test_Tuan7 {
    public static void main (String[] args) 
    {
        QuanLySach manager = new QuanLySach();
        System.out.println("1.KHOI TAO VA THEM SACH");
        SachGiaoTrinh  SGT01 = new SachGiaoTrinh ("SGT01", "TOAN ROI RAC", 
        "Hoang Thi My Le", 2021, 500,50000, "TOAN", "Dai hoc");
        SachTieuThuyet STT01 = new SachTieuThuyet ("STT01", "GENIE", 
        "HONGJU", 2025, 1000,50000, "ADVENTURE", true);
        manager.themSach(SGT01);
        manager.themSach(STT01);
        System.out.println("\n2.HIEN THI DANH SACH");
        manager.hienThiDanhSach();
        System.out.println("3.TIM KIEM VA CAP NHAT");  
        String maCanTim = "STT01";
        Sach sachTimThay = manager.timKiemTheoMa(maCanTim);
        if (sachTimThay != null) 
        {
            System.out.println("DA TIM THAY SACH CO MA" + maCanTim + ":");
            System.out.println(sachTimThay);
            manager.capNhatSoLuong(maCanTim, 150);
        } 
        else 
        {
            System.out.println("KHONG TIM THAY SACH CO MA" + maCanTim);
        }
        System.out.println("\n4.HIEN THI LAI SAU CAP NHAT");
        manager.hienThiDanhSach();
        System.out.println("5.XOA SACH");
        manager.xoaSach("SGT01");
        manager.xoaSach("S02");
        System.out.println("\n6.DANH SACH CUOI CUNG");
        manager.hienThiDanhSach();       
    }
}