public class Test {
    public static void main (String[] args) {

        Sach s01 = new Sach ("s01", "Toan roi rac", "Nguyen Thi Mo", 2025, 100);
        Sach s02 = new Sach ("s02", "Do hoa may tinh", "Nguyen Tho Mong", 2015, 10);

        s01.hienThiThongTin();
        s02.hienThiThongTin();

        s01.setsoluong(105);
        System.out.println ("Sau khi cap nhat so luong:");
        s01.hienThiThongTin();
    }

}