import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Buoi_1 {
    public static void main(String[] args){
        // để chạy 1 hàm cần có: public static + void (có giá trị/ kiểu dữ liệu trả vị) + main (hàm mặc định của 1 lớp đối tượng)String
        // snippet code: gõ code nhanh bằng cách gõ main và Tab: sẽ tự động tạo main
        // = comment code: ghi chú lại (khi chạy CT thì comment code sẽ bị bỏ qua; chỉ cần tô đen khu vực muốn comment, sau đó gõ: command và /
        // 1. Lệnh xuất/ in dữ liệu System.out.print (" ...");
        System.out.println("Hello Testing 14");
        // để xuất dữ liệu chọn biểu tượng play thứ 2 bên góc trái chọn tên Buoi_1 => dữ liệu in ra tại khung terminal ở dưới
        System.out.println("Hello Thanh Trúc");
        // câu lệnh in ra bị dính liền nhau "Hello Testing 14Hello Thanh Trúc' -> nên sử dụng println cho dòng ĐẦU TIÊN (in dữ liệu và xuống dòng)
        // gõ sout và Tab -> câu lệnh System.out.println
        System.out.println("Hello World");
        //2. Biến: tạo ra biến để lưu và chứa dữ liệu của biến trên bộ nhớ
        //cú pháp: <kiểu dữ liệu> <tên biến> = <giá trị>;
        //kiểu dữ liệu CHỮ: là 1 chuỗi - String
        //Kiểu dữ liệu SỐ: int (số nguyên), float (số thập phân), double (số thập phân)
        //float: 7-8 số sau dấu phẩy
        // double: 15-16 số sau dấu phẩy
        //boolean: true/false

        // Tạo ra biến tên là name:
        String name = "Thanh Trúc";
        String hoVaTen = "Testing 14";
        // Tên biến sẽ không dấu và không khoảng cách, chữ cái tiếp theo sẽ viết hoa (Vd: diaChi); ko được trùng với các từ khoá của JAVA
        int tuoi = 18;
        System.out.println(name);
        System.out.println(hoVaTen);
        // ko cần dùng "" khi dùng tên biến trong dòng lệnh System.out.println
        Boolean isStudent = true;
        Boolean isLogin = false;
        // Luôn đặt tên biến cho Boolean là "is" và "mệnh đề cần xác định"
        System.out.println("Họ và tên: " + name);
        // Luôn tạo khoảng cách sau dấu : để khi in ra có khoảng cách giữa mệnh đề và biến

        //3. Scanner: là thùng thư viện dùng để nhận dữ liệu từ người dùng nhập vào
        // Nhập import ngay từ bên ngoài dòng lệnh đầu tiên và sử dụng thư viện Java: lớp đối tượng được Java định nghĩa
        // Dùng dòng lệnh import java.util.Scanner;
        // Scanner sẽ không thuộc về các kiểu dữu liệu Chữ và Số
        Scanner sc = new Scanner(System.in); // nhận dữ liệu từ NGƯỜI DÙNG
        System.out.println("Nhập Họ và Tên: "); //để thông báo người dùng nhập giá trí vào
        // sc là tên biến
        // new Scanner vì bản thân Scanner là đối tượng của Java đã định nghĩa -> new Scanner tạo ra đối tượng mới và nhập System.in
        // -> sc là tên biến và là lớp đối tượng mới -> dùng tên biến này để nhập dữ liệu
        String fullName = sc.nextLine(); // nhận dữ liệu dạng chuỗi
        //Để nhận được giá trị từ người dùng thì phải gắn biến 'sc' vào 1 biến khác nữa
       // mỗi tên biến chỉ được khai báo 1 lần
        // <Kiểu dữ liệu> <tên biến mới> = tên biến 'sc'.netxtLine();
        System.out.println("Họ và Tên: " + fullName);

        //ví dụ: Nhập và in thông tin : Họ và tên, tuổi, trường, lớp
        //Sửa bài
        // Vì biến sc đã được khai là biến mới nên vẫn không cần khai các biến mới khác như bài làm trên
        //1. Nhập Họ và tên
        System.out.println("Nhập Họ và Tên: ");
        String hoTenHS = sc.nextLine();
        //2. Nhập tuổi HS
        System.out.println("Nhập Tuổi: ");
        int tuoiStudent = sc.nextInt(); //khi bạn nhập số xong và nhấn Enter, ký tự xuống dòng (\n) vẫn còn trong bộ nhớ.
        //nextInt: Không đọc Enter (tức là xuống dòng
        //nextline: đọc Enter
        //Vd: khi ngừoi dùng nhập "20" và nhấn Enter thì trong bộ nhớ: 20 = số được nhập và \n = ký tự xuống dòng Enter
        // khi gõ dòng lệnh "int tuoiStudent = sc.nextInt();" -> nextInt() chỉ nhận số được nhập; trong bộ nhớ vẫn còn \n
        //khi chạy đến dòng lệnh "String truongStudent = sc.nextLine();" thì sẽ thấy ngay \n -> lấy luôn và ko cho người dùng nhập tên trường
        sc.nextLine(); //thêm dòng này để bỏ ký tự Enter (\n)
        //3. Nhập tên Trường
        System.out.println("Nhập Trường: ");
        String truongStudent = sc.nextLine();
        //4. Nhập lớp HS
        System.out.println("Nhập Lớp: ");
        String lopHS = sc.nextLine();
        //Bắt dầu in các lệnh
        System.out.println("Họ và tên: " + hoTenHS);
        System.out.println("Tuổi " + tuoiStudent);
        System.out.println("Trường: " + truongStudent +  ", Lớp: " + lopHS);

        //4. Toán tử
        // 4.1: Toán tử số học: + - * / %
        int soA = 5;
        int soB = 10;
        // khi thực hiện bất kỳ phép tính gì cũng khai báo <kiểu dữ liệu> <tên biến> = phép tính;
        int tinhTong = soA +soB;
        int tinhHieu = soA - soB;
        int tinhTich = soA * soB;
        int tinhThuong = soA / soB;
        //% chia lấy dư
        int tinhDu = soA % soB;
        System.out.println("Tổng: " + tinhTong + ", Hiệu: " + tinhHieu + ", Tích: " + tinhTich + ", Thương: " + tinhThuong + ", Dư: " + tinhDu);
        //4.2: Toán tử so sánh
        // so sánh bằng ==
        Boolean kq1 = soA == soB;
        // các phép toán so sánh chỉ ra kết quả true/false
        System.out.println(kq1);

        //4.2. só sánh khác !=
        Boolean kq2 = soA != soB;
        System.out.println("kết quả 2: " + kq2);

        //4.3. So sánh bé hơn, lớn hơn, bé hơn bằng, lớn hơn bằng
        Boolean kq3 = soA >= soB;
        Boolean kq4 = soA < soB;
        System.out.println("kết quả 3: " + kq3 + ", kết quả 4: " + kq4);

        String a = "Hello";
        String b = "Hello";
        System.out.println(System.identityHashCode(a)); // Để tìm ID của biến a trên String pool
        System.out.println(System.identityHashCode(b));
        Boolean kq5 = a == b;
        System.out.println("kq5: " + kq5);
        String c = new String("Hello");
        System.out.println(System.identityHashCode(c));
        Boolean kq6 = c == b;
        Boolean kq7 = c.equals(b);
        System.out.println("Kết quả 6: " + kq6 + " ,Kết quả 67: " + kq7); // -> false và true
        //  Vì biến "c" là lớp đối tượng mới ko có trong 1 vùng nhớ của JAVA
        //-> Để so sánh kiểu dữ liệu String thì ko dùng "==" mà dùng "equals" (so sánh NỘI DUNG của biến)





    }



}
