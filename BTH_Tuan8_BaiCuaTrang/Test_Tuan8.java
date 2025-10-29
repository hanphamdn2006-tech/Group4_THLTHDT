import java.util.Scanner;

public class Test_Tuan8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach manager = new QuanLySach();
        int chon;

        do {
            System.out.println("\n-----MENU QUAN LY SACH-----");
            System.out.println("1.THEM SACH");
            System.out.println("2.HIEN THI DANH SACH");
            System.out.println("3.TIM KIEM SACH THEO MA");
            System.out.println("4.CAP NHAT SO LUONG SACH");
            System.out.println("5.XOA SACH KHOI DANH SACH");
            System.out.println("0.THOAT");
            System.out.println("MOI CHON THAO TAC");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: 
                    ((QuanLySach) manager).themSach();
                    break;
                case 2:
                    manager.hienThiDanhSach();
                    break;
                case 3: 
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    Sach s = manager.timKiemSach(maCanTim);
                    if(s!=null) {
                        System.out.println("Da tim thay: ");
                        System.out.println(s);
                    }
                    else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                case 4: 
                    System.out.println("Nhap ma sach can cap nhat: ");
                    String maCapNhat = sc.nextLine();
                    System.out.print("Nhap so luong sach moi: ");
                    int soLuongMoi = Integer.parseInt(sc.nextLine());
                    ((QuanLySach) manager).capNhatSoLuong(maCapNhat, soLuongMoi);
                    break;
                case 5: 
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    manager.xoaSach(maXoa);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Khong hop le! Vui long chon lai.");
            }
        }
        while (chon!=0);
    }
}
     
        
        
        
        
        