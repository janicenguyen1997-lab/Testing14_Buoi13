package baiTap.Buoi_5;

import java.util.ArrayList;
import java.util.Scanner;
//sinh vien = {id, name, address, score} -> dùng mảng arraylist do ko biết chính xác số lượng cụ thể

public class quanLySinhVien {
    //thuộc tính mảng
    private ArrayList<sinhVien> danhSachSinhVien = new ArrayList <> ();

    //phương thức thêm sinh viên
    public void themSinhVien (Scanner sc) {
        //tạo ra đối tượng sinh viên từ lớp đối tượng
        sinhVien sv = new sinhVien(); //truyền tham số vào cho đối tượng SV
        //gọi phương thức input để nhập thông tin sinh viên
        sv.input(sc);
        //thêm sinh viên vào danh sách
        danhSachSinhVien.add(sv);
        System.out.println("Thêm sinh viên thành công!");
    }

    //phương thức hiển thị DS SV
    public void hienThiDanhSachSV() {
        //2 trường hợp
        //a. nếu DS SV rỗng thì hiển thị thông báo rỗng
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
        }
        //b. nếu DS SV không rỗng thì hiển thị thông tin SV
        else {
            for (sinhVien sv : danhSachSinhVien) {
                sv.display();
            }

        }
    }

    //Phương thức xoá Sv dựa vào ID (Ko có giá trị trở về)
public void xoaSinhVien (Scanner sc){
    System.out.println("Nhập ID sinh viên cần xoá:");
    String id = sc.nextLine();
    //giải quyết theo phương pháp đặt cờ hiệu
    boolean found = false; //chưa tìm thấy SV cần xoá
    //bắt đầu tạo ra vòng lặp để kiểm tra từng SV
    for (sinhVien sv : danhSachSinhVien) // nếu ID được lấy ra trùng với ID được nhập từ người dùng thì found = true
        // ứng với phương thức xoá
        {
        if (sv.getID().equals(id)) // .equals = trùng
        {
            danhSachSinhVien.remove(sv);
            System.out.println("Xoá sinh viên thành công!");
            found = true;
            break;
        }
    }
    if (!found) //!: lật ngược điều kiện: found = true
    {
        System.out.println("Không tìm thấy sinh viên với ID: " + id);
    }
    }
    //phương thức tìm SV dựa vào ID
    public void timSinhVien (Scanner sc) {
        System.out.println("Nhập ID sinh viên cần tìm:");
        String id = sc.nextLine();
        //giải quyết theo phương pháp đặt cờ hiệu
        boolean found = false; //chưa tìm thấy SV cần xoá
        //bắt đầu tạo ra vòng lặp để kiểm tra từng SV
        for (sinhVien sv : danhSachSinhVien) // nếu ID được lấy ra trùng với ID được nhập từ người dùng thì found = true
        // ứng với phương thức xoá
        {
            if (sv.getID().equals(id)) // .equals = trùng
            {
                System.out.println("Thông tin sinh viên cần tìm: ");
                sv.display();
                found = true; //tìm thấy SV cần tìm
                break;
            }
        }
        if (!found) //!: lật ngược điều kiện: found = true -> flase
        {
            System.out.println("Không tìm thấy sinh viên với ID: " + id);
        }
    }


}



