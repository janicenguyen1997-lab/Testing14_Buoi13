public class Buoi_4b {
    public static void main(String[] args) {
        //10. Object và Class:
        //10.1: class: khuôn mãu của 1 lớp đối tượng, nó định nghĩa CÁC thuộc tính khác nhau và phương thức dùng chung của đối tượng
        //10.2: object: là 1 thực thể CỤ THỂ được TẠO RA TỪ CLASS, nó có các thuộc tính và phương thứuc riêng của nó
        //class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng dựa trên bản thiết kế đó.

        //ví dụ: sinh viên: tên, tuổi, điểm: Lý, Hoá, điểm trung bình, xếp loại
        //tạo đối tượng sinh viên từ class sinhVien
        // cú pháp : tênClass tênĐốiTượng = new tênClass(giá trị thuộc tính);
       sinhVien sv1 = new sinhVien ("Nguyễn A", 20, 8.5, 9.0);
       sinhVien sv2 = new sinhVien ("Nguyễn B", 19, 6.5, 7.0);

       //truy cập vào các thuộc tính và phương thức của đối tượng để lấy ra ngoài
        double diemTB1 = sv1.tinhDiemTrungBinh();//do sử dụng giá trị trả về để tính điểm TB -> GẮN vào biến
        // String xl1 = sv1.xepLoai();// do sử dụng "void" ko có giá trị trả về -> KHÔNG THỂ gắn vào biến
        System.out.println("Điểm trung bình của " + sv1.ten + " là: " + diemTB1);
        sv1.xepLoai();
        double diemTB2 = sv1.tinhDiemTrungBinh();//do sử dụng giá trị trả về để tính điểm TB -> GẮN vào biến
        // String xl1 = sv1.xepLoai();// do sử dụng "void" ko có giá trị trả về -> KHÔNG THỂ gắn vào biến
        System.out.println("Điểm trung bình của " + sv2.ten + " là: " + diemTB2);
        sv2.xepLoai();
        // Kết quả máy chạy: Điểm trung bình của Nguyễn A là: 8.75
        //Học sinh giỏi
        //Điểm trung bình của Nguyễn B là: 8.75
        //Học sinh khá
        //System.out.println("Số tuổi của " + sv1.ten + " là: " + sv1.tuoi);
        //Lỗi vì thuộc tính "tuoi" là private, không thể truy cập trực tiếp từ bên ngoài class
        // Kết quả máy chạy LỖI: tuoi has private access in sinhVien


    }
}

// Ra khỏi public class Buoi_4b và tạo class mới
class sinhVien{
    //thuộc tính:
    //String ten;
    //int tuoi;
    //Nhưng để đảm bảo những thuộc được truy cập/ cập nhật giá trị bên trong thuộc tính an toàn thì sẽ dùng "public"
    //"public": là 1 phạm vi truy cập, cho phép truy cập từ bất kỳ đâu trong chương trình.
    //"private": là 1 phạm vi truy cập, chỉ cho phép truy cập từ bên trong class (truy cập thông qua các phương thức)
    //readonly: chỉ cho phép truy cập từ bên trong class, không cho phép sửa đổi giá trị của thuộc tính (truy cập thông qua các phương thức)

    public String ten;
    private int tuoi;
    // nếu dùng private thì người dùng không thể trực tiếp cập nhật/ chỉnh sửa/ gọi các thuộc tính ra ngoài để chỉnh sửa
    // người dùng phải dùng các phương thức được người dùng định nghĩa sau đó để lấy các thuộc tính ra ngoài, đọc và chỉnh sửa
    private double diemLy;
    private double diemHoa;

    //constructor: phương thức do Java định nghĩa để khởi tạo các lớp đối tượng, có cùng với tên class
    //có nhiệm vụ là gắn lại các giá trị do người dùng truyền vào và gắn vào các thuộc tính
    public sinhVien(String ten, int tuoi, double diemLy, double diemHoa)
        //Thông qua constructor là "sinhVien", thì người dùng có thể truyền vào các giá trị tên, tuổi, ... theo thứ tự được sắp đặt
    //Sau đó, thông qua .this để tự động match truyền các giá trị vào các thuộc tính tương ứng
    {
        this.ten =ten; //
        this.tuoi = tuoi;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    //phương thức:
    //TẠO HÀM/ TẠO PHƯƠNG THỨC:
    //1. CÓ giá trị trả về: sử dụng để in ra màn hình, đánh giá hoặc dùng để sử dụng cho các phương thức tiếp theo
    public double tinhDiemTrungBinh() {
        // public <kiểu dữ liệu muốn trả về> tenPhuongThuc () {logic sử dụng các thuộc tính của đối tượng; returr giá trị}
        double diemTrungBinh = (diemHoa + diemLy) / 2;
        return diemTrungBinh;
    }

    //xếp loại: sử dụng phương thức không có giá trị trở về
    //2. KHÔNG có giá trị trả về: public void tenPhuongThuc () {logic sử dụng các thuộc tính của đối tượng}
    public void xepLoai () {
        //sử dụng phương thức tinhDiemTrungBinh để xếp loại học sinh
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8) {
            System.out.println("Học sinh giỏi");
        } else if (diemTrungBinh >= 6.5){
            System.out.println("Học sinh khá");
        } else if (diemTrungBinh >= 5) {
            System.out.println("Học sinh trung bình");
        } else {
            System.out.println("Học sinh yếu");
        }
// Để xác định có giá trị trở về hay không thì xác định nếu có ý định sử dụng giá trị này cho các phương thức khác hay không
        //Nếu có, phải dùng giá trị trở về: public <kiểu dữ liệu muốn trả về> tenPhuongThuc() {}

    }

}
