package baiTap;

import java.util.Scanner;
public class Baitap_1 {
    public static void main(String[] args) {
      // sử dụng mô hình IPO (Input: Dữ liệu đầu vào-Process: xử lý logic để đạt được Output-Output: kết quả mong muốn)



        // bài 1: Tính điểm trung bình của HS (cho phép nhập Họ và tên; điểm: toán, lý, hoá
        //sau đó in thông tin và điểm trung bình của hs
        //Input: Nhập Họ và tên, Toán, Lý, Hoá

        Scanner sc = new Scanner(System.in);
        // Nhập Họ và tên:
        System.out.println("Nhập Họ và tên: ");
        String hoTen = sc.nextLine();

        //Nhập điểm Toán
        System.out.println("Nhập điểm Toán: ");
        int diemToan = sc.nextInt();

        //Nhập điểm Lý
        System.out.println("Nhập điểm Lý: ");
        int diemLy = sc.nextInt();

        //Nhập điểm Hoá
        System.out.println("Nhập điểm Hoá: ");
        int diemHoa = sc.nextInt();

        //Tính điểm trung bình
        int diemTrungBinh = (diemToan + diemLy + diemHoa)/3;
        //In ra thông tin HS
//process:
        //output: in ra những thông tin sau : Tên, Toán, Lý, Hoá và điểm TB
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Ly: " + diemLy);
        System.out.println("Điểm Hoa: " + diemHoa);
        System.out.println("Điểm TB: " + diemTrungBinh);
        sc.nextLine(); // dọn bộ nhớ , cho phép dòng nextLine tiếp theo được nhập
        // bài 2: tính lương nhân viên. Cho phép nhập tên và tính lương nhân viên đó, lương cơ bản, số ngày làm việc
       //input: họ tên, lương cơ bản, số ngày làm
        System.out.println("Nhập tên nhân viên: ");
        String tenNhanVien = sc.nextLine();
        System.out.println("Nhập lương cơ bản ");
        double luongCoBan = sc.nextFloat();
        System.out.println("Nhập số ngày làm: ");
        int soNgayLam = sc.nextInt();
        //Tính lương thực nhận
        Double luongThucNhan = luongCoBan * soNgayLam;

        // process: tính lương nhận của nhân viên

        //output: In ra họ tên và lương cơ bản, số ngày làm và lương thực nhận
        System.out.println("Họ và Tên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Số ngày làm: " + soNgayLam);
        System.out.println("Lương thực nhận: " + luongThucNhan);

    }
}
