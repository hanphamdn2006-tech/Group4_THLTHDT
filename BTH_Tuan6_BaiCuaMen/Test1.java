package BTH_Tuan6_BaiCuaMen;
public class Test1 {
    public static void main (String[] args) 
    {
        QuanLySach manager = new QuanLySach();
        System.out.println("1.KHOI TAO VA THEM SACH");
        SachGiaoTrinh  SGT01 = new SachGiaoTrinh ("SGT01", "Lap Trinh Huong Doi Tuong", 
        "Nguyen Van A", 2000, 400, "Cong Nghe Thong Tin", "Dai hoc");
        SachTieuThuyet STT01 = new SachTieuThuyet ("STT01", "Harry Potter va hon da phu thuy", 
        "J.K.Jack", 1990, 800, "Gia tuong", true);
        Sach S01 = new Sach ("S01", "Dac Nhan Tam", 
        "Nguyen Van B", 1999, 1000);
        manager.themSach(SGT01);
        manager.themSach(STT01);
        manager.themSach(S01);
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