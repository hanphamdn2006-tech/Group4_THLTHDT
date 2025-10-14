public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Chuyen phieu luu cua toi", "Nguyen Van An", 2021, 60);
        Sach sach2 = new Sach("B002", "Con do nho", "Tran Thi Binh", 1900, 23);

        Sach sach3 = new Sach("B003", "Bau troi sao", "Le Van Chien", 20);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}
