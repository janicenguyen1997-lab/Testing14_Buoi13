public class Buoi_5 {
    public static void main(String[] args) {
        //Tính đóng gói
        student st1 = new student("A", 21, "mầm");
        //st1.name; // không làm được vì name là "private", chỉ lấy được thông qua phương thức
        String name = st1.getName(); // chỉ lấy name của HS qua phương thức .getName
        //do .getName có giá trị trở về nên gán được .getName vào biến khác
        System.out.println("Họ tên: " + name);
        //Kết quả máy chạy: Họ tên: A

        //Tính kế thừa
        giamDoc gd1 = new giamDoc("Giám đoc A", 40, "phòng sales", "giám đốc");
        gd1.thongTinNhanVien();
        //gd1.thongTinGiamDoc();
        //do đã sử dụng @Override ở phương thức của class giamDoc nên không cần khai báo
    }
}
    //4 tính chất của OOP: tính đóng gói, tính kế thừa, tính đa hình và tính trừu tượng
//1. Tính đóng gói: là một tính chất OOP, CHỈ CHO PHÉP truy cập các thuộc tính của đối tượng thông qua các phương

class student {
        //thuộc tính
        private String name;// = "Nguyễn A" // Vd gắn giá trị trực tiếp trong class
        private int age;
        private String lop;

        //constructor
        public student(String name, int age, String lop) {
            this.name = name; // this: đại diện class student gọi đến thuộc tính "name" 1 của private String name;,
            // và "name" 2 của public student (String name, ...) gắn với tham số constructor của hàng trên
            this.age = age;
            this.lop = lop;
        }

        //tạo ra phương thức để truy cập được vào thuộc tính
        public String getName() {
            return name;
        }// Sau đó cuộn lên và dùng câu lệnh:

        // student st1 = new student();
        // st1.getName();
        public int getAge() {
            return age;
        }

        public String getLop() {
            return lop;
        }
        // có 3 cách để gắn giá trị cho thuộc tính:
        // thông qua phương thức constructor; thông qua phương thức set; thông qua phương thức get
        //1. Gắn trực tiép vào trong class (bị cố định 1 giá trị với 1 thuộc tính)
        //-> không dùng
        // 2. Gắn giá trị thông qua constructor: (kiểu phổ biến)
        //B1: tạo ra constructor
        // public tenNhom (<kiểu dữ liệu 1> tenBien1, <kiểu dữ liệu 2> tenBien2, ...)
        //Xem dòng 17 -23
        //Khi dùng construcstor, thì ngừoi dùng LUÔN PHẢI tạo ra đầy đủ các giá trị trong lớp đối tượng đó trước (nếu ko khai báo sẽ bị lỗi)
        //Vd: student st1 = new student("A", 21, "mầm");
        //3. Gắn giá trị thông qua phương thức set (sử dụng phương thức có giá trị trở về)
//    public void setName(String name) {
//        this.name = name;
    }

    //2. Tính kế thừa: cho phép tạo lớp mới từ lớp đã tồn tại và kế thừa TOÀN BỘ các thuộc tinh, constructors và phương thức của lớp cha
// có thể thêm các thuộc tính, constructor và phương thức mới
class nhanVien {

    //thuộc tính
    public String name;
    private int age;
    private String phongBan;

    //constructor:
    public nhanVien(String name, int age, String phongBan) {
        this.name = name;
        this.age = age;
        this.phongBan = phongBan;
    }

    //phương thức
    public void thongTinNhanVien() {
        System.out.println("Đây là nhân viên:");
    }
}

class giamDoc extends nhanVien {
    //thuộc tính
//    public String name;
//    private int age;
//    private String phongBan;
    private String chucVu;

    //constructor
    public giamDoc(String name, int age, String phongBan, String chucVu) {
        //super: là từ khoá của constructor của lớp cha (lớp nhanVien) để khởi tạo các thuộc tính của lớp cha
        // nó phải được gọi ở dòng đầu tiên của constructor cửa lớp con (lớp giamDoc)
        //chỉ cần khai báo lại các tham số của lớp cha
        super(name, age, phongBan);
        //this.name = name;
//        this.age = age;
//        this.phongBan = phongBan;
        this.chucVu = chucVu;
    }

    //phương thức
//    public void thongTinGiamDoc() {
//        System.out.println("Đây là Giám đốc:");
//    }
    // tính đa hình; sử dụng lại phương thức của lớp cha và ghi đè phương thức
    @Override
    // dùng phường thức của lớp cha (class nhanVien)
    public void thongTinNhanVien() {
        System.out.println("Đây là giám đốc:");
    }

// cả 2 lớp đối tượng nhanVien và giamDoc đều có các thuộc tính giống nhau,
// nên có kế thừa thuộc tính, constructor và phương thức từ nhân viên cho lớp đối tượng của giamDoc
// thông qua thêm extends từ nhanVien: class giamDoc extends nhanVien
// --> nên ko cần khai báo lại các dòng giống phương thức, constructor và thuộc tính từ dòng 80-82; 86-89,
//Không cần khai báo biến String name, int age, String phongBan
//CHỈ CẦN khai báo những tính năng mới mà CHỈ có lớp đối tượng giamDoc mới có (thuộc tính, constructor, phương thức)
}

//Tính đa hình: Cho phép sử dụng phương thức CÙNG tên/ tham số nhưng có hoạt động khác nhau
//một hành động/ phương thứuc có nhiều cách thực hiện khác nhau
//sử dụng @Override để ghi đè

//Tính trừu tượng: chỉ cần khai báo các phương thức mà KHÔNG cần triển khai, CHỈ triển khia ở các lớp con
//Ví dụ: Tính diện tích của 1 hình học
abstract class hinhHoc {
    //thuộc tính
    public String tenHinh;
    public int canhA;
    public int canhB;

    //constructor
    public hinhHoc(String tenHinh, int canhA, int canhB) {
        this.tenHinh = tenHinh;
        this.canhA = canhA;
        this.canhB = canhB;
    }

    //phương thức:
    abstract public int tinhDienTich();
        //cho máy biết ở đây có phương thức tinhDienTích
        // Để thực hiện phương thức từ lớp CHA thì phải có abstract ở lớp Cha đó và ở phương thức
}

class hinhChuNhat extends hinhHoc {
    //constructor
    public hinhChuNhat(String tenHinh, int canhA, int canhB) {
        super(tenHinh, canhA, canhB);
    }

    //triển khai phương thức trừu tượng:
    @Override // Không cần thiết
    public int tinhDienTich() {
        return canhA * canhB;
    }
}
class hinhVuong extends hinhHoc {
    //constructor
    public hinhVuong(String tenHinh, int canhA, int canhB) {
        super(tenHinh, canhA, canhB);
    }

    //triển khai phương thức trừu tượng:
    @Override // Không caanf thiết
    public int tinhDienTich() {
        return canhA * canhB;
    }
    //Do khi khai báo định nghĩa abstract (trừu tượng) tức là ko có logic,
    // nên khi triển khai logic ở phương thức của lớp con, Không cần dùng @Override
    //Lớp đối tượng có tính trừu tượng: Ko cần định nghĩa thuộc tính (có thể định nghĩa trong các lớp con nếu các thuộc tính ko giống như của lớp CHA),
    // NHƯNG PHẢI định nghĩa phương thức của lớp đó
}




