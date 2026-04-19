package baiTap.Buoi_5;

import java.util.Scanner;

public class Baitap_5 {
    public static void main(String[] args) {
        //BT quản lý sinh viên thông qua menu có 4 chức năng CHÍNH:
        //1. Thêm SV
        //2. Xoá SV
        //3. Hiển thị Danh sách sinh viên
        //4. Tìm sinh viên theo ID
        //5. Thoát chương trình
        //mỗi sv sẽ có các thuộc tính: ID, name, age, address

        //Mỗi 1 bước phải tạo ra cac file riêng lẻ để làm
        //1. Tạo ra class SV: (phụ) (nên thực hiện trước)
        //2. tạo class Quản lý SV để thực hiện các chức năng (phụ) (tạo ra lớp quản lý sv trước
        // Sau đó tạo ra phương thứuc THÊM SV
        //quay lại lớp menu và thử nhập phương thức THÊM và cho CHẠY để kiểm tra trước
        //Thực hiện tương tự với các phương thứuc còn lại
        //3. Tạo menu để người dùng lựa chọn các chức năng (bao gồm cả 2 phụ)


        //Tạo ra menu
        Scanner sc = new Scanner(System.in);
        quanLySinhVien quanLySinhVien = new quanLySinhVien();

        int choice; //dùng choice theo thứ đếm các case: 1: Thêm SV; 2: Xoá SV; 3. Hiển thị DSSV
        //Cần tạo ra 1 vòng lặp để máy liên tục chạy khi thông tin nhập hợp lệ
        do {
            System.out.println("==== QUẢN LÝ SINH VIÊN ====");
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.Hiển thị sinh viên");
            System.out.println("3.Tìm sinh viên theo ID");
            System.out.println("4.Xoá sinh viên theo ID");
            System.out.println("5.Thoát khỏi chương trình");
            System.out.println("========================");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    quanLySinhVien.themSinhVien(sc);
                    break;
                case 2:
                    quanLySinhVien.hienThiDanhSachSV();
                    break;
                case 3:
                    quanLySinhVien.timSinhVien(sc);
                    break;
                case 4:
                    quanLySinhVien.xoaSinhVien(sc);
                    break;
                case 5:
                    System.out.println("Thoát chương trình thành công!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
            }
        } while (choice != 5); //choice khác 5 - nếu đk người dùng =5 thì nó sẽ dừng chạy
    }
}
