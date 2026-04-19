package baiTap_18;

import java.util.Scanner;

public class baiTap_18 {
    public static void main(String[] args) {
        //Đề bài: Quản lý học sinh
        // 1. thêm học sinh
        // 2. hiển thị danh sách học sinh
        // 3. xóa học sinh dựa vào id
        // 4. tìm kiếm học sinh dựa vào id
        // 5. tìm học sinh có điểm trung bình cao nhất
        // 6. tìm học sinh có điểm trung bình thấp nhất
        // 7. sắp xếp học sinh theo tên
        // 8. cập nhật thông tin học sinh dựa vào id
        // 9. hiển thị ra học sinh có tổng điểm 3 môn trên 24đ
        // 10. hiển thị ra học sinh có tổng điểm dưới 18đ
        // 11. hiển thị ra danh sách học sinh đạt chất lượng giỏi (đtb > 8)
        // 12. thoát khỏi chương trình// học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}

        //tạo ra menu Quản lý HS
        Scanner sc = new Scanner(System.in);
        quanLyHocSinh qlhs = new quanLyHocSinh();
        int choice;
        //Cần tạo ra 1 vòng lặp để máy liên tục chạy khi thông tin nhập hợp lệ
        do {
            System.out.println("==== QUẢN LÝ HỌC SINH ====");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xoá học sinh theo ID");
            System.out.println("4. Tìm học sinh theo ID");
            System.out.println("5. Tìm học sinh có điểm trung bình cao nhất");
            System.out.println("6. Tìm học sinh có điểm trung bình thấp nhất");
            System.out.println("7. Sắp xếp học sinh theo tên");
            System.out.println("8. Cập nhật thông tin của học sinh dựa ID");
            System.out.println("9. Tìm các học sinh có tổng điểm trên 24 điểm");
            System.out.println("10. Tìm các học sinh có tổng điểm dưới 18 điểm");
            System.out.println("11. Tìm các học sinh có điểm trung bìh dưới 8 điểm ");
            System.out.println("12.Thoát khỏi chương trình");
            System.out.println("========================");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    qlhs.themHocSinh(sc);
                    break;
                case 2:
                    qlhs.hienThiDanhSachHocSinh();
                    break;
                case 3:
                   qlhs.xoaHocSinhtheoID(sc);
                   break;
                case 4:
                   qlhs.timKiemHocSinhTheoID(sc);
                   break;
                   case 5:
                    qlhs.timHocSinhCoDiemTBCaoNhat();
                    break;
                case 6:
                    qlhs.timHocSinhCoDiemTBThapNhat();
                    break;
                case 7:
                    qlhs.sapXepTen();
                    break;
                case 8:
                    qlhs.capNhatThongTinNhanVien(sc);
                    break;
                case 9:
                   qlhs.timCacHocSinhCoTongDiemTren24();
                  break;
              case 10:
                    qlhs.timCacHocSinhCoTongDiemDuoi18();
                    break;
                case 11:
                    qlhs.timCacHocSinhCoDiemTBDuoi8();
                    break;
                case 12:
                    System.out.println("Thoát chương trình thành công!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
            }
        } while (choice != 12);



    }
}





