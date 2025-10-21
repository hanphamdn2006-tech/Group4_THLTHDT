public class Test_Tuan7 {
    public static void main (String[] args) 
    {
        QuanLySach manager = new QuanLySach();

        System.out.println("===== 1. KHOI TAO VA THEM SACH =====");
        SachGiaoTrinh sgt01 = new SachGiaoTrinh ("sgt01", "TOAN ROI RAC", 
        "Nguyen Thi Mo", 2020, 100, "TOAN", "Dai hoc", 50000);
        SachTieuThuyet stt01 = new SachTieuThuyet ("stt01", "PASSION", 
        "YUUJI", 2024, 1000, "ROMANCE", true, 50000);
        manager.themSach(sgt01);
        manager.themSach(stt01);
        
        System.out.println("\n===== 2. HIEN THI DANH SACH (DA HINH) =====");
        manager.hienThiDanhSach();

        System.out.println("===== 3. TIM KIEM VA CAP NHAT =====");
        String maCanTim = "stt01";
        Sach sachTimThay = manager.timKiemTheoMa(maCanTim);
        if (sachTimThay != null) 
        {
            System.out.println("-> TIM THAY SACH CO MA" + maCanTim + ":");
            System.out.println(sachTimThay);
            
            manager.capNhatSoLuong(maCanTim, 150);
        } 
        else 
        {
            System.out.println("-> KHONG TIM THAY " + maCanTim);
        }

        System.out.println("\n===== 4. HIEN THI LAI SAU CAP NHAT =====");
        manager.hienThiDanhSach();

        System.out.println("===== 5. XOA SACH =====");
        // Xóa sách giáo trình
        manager.xoaSach("sgt01");
        // Thử xóa sách không tồn tại
        manager.xoaSach("S999");
        
        System.out.println("\n===== 6. DANH SACH CUOI CUNG =====");
        manager.hienThiDanhSach();

       }
}
