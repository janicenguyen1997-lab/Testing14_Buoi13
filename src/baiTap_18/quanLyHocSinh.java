package baiTap_18;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLyHocSinh {
    //thuộc tính
    private static ArrayList<hocSinh> danhSachHocSinh = new ArrayList<>();
    //-> [hocSinh, hocSinh, hocSinh, ...]


    //phương thức
    //1. Thêm học sinh:
    public void themHocSinh(Scanner sc) {
        System.out.println("Nhập ID của học sinh");
        String id = sc.nextLine();

        //Kiểm Tra nếu ID TỒN TẠI
        //nếu khác null = đã tồn tại và ko cho thêm
        if (timHSTheoID(id) != null) {
            System.out.println("ID đã tồn tại. Vui lòng nhập ID kahsc!");
            return;//dừng phương thức nếu ID đã tồn tai
        }


        // ID CHƯA tồn tại thì THÊM
        System.out.println("Nhập họ và tên học sinh: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập lớp của học sinh: ");
        String lop = sc.nextLine();
        System.out.println("Nhập địa chỉ của học sinh: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm Toán của học sinh: ");
        double diemToan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Lý học sinh: ");
        double diemLy = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Hoá của học sinh: ");
        double diemHoa = Double.parseDouble(sc.nextLine());
        hocSinh hs = new hocSinh(id, hoTen, lop, diaChi, diemToan, diemLy, diemHoa);
        danhSachHocSinh.add(hs);
        System.out.println("Thêm học sinh thành công!");
    }

    // 2. hiển thị danh sách học sinh
    public void hienThiDanhSachHocSinh() {
        //a. nếu DS HS rỗng thì hiển thị thông báo rỗng
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh rỗng!");
            return; //dừng phương thức và ko thực hiện lệnh for của phương thức
        }
        //b. nếu DS HS không rỗng thì hiển thị thông tin HS
        for (hocSinh hs : danhSachHocSinh) {
            hs.displayInfo();
        }
    }

    //xoá HS theo ID
    public void xoaHocSinhtheoID(Scanner sc) {
        System.out.println("Nhập ID học sinh cần xoá");
        String id = sc.nextLine();
        boolean found = false;
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.getID().equals(id)) {
                danhSachHocSinh.remove(hs);
                System.out.println("Xoá học sinh thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với ID: " + id);
        }

    }

    // 4. tìm kiếm học sinh dựa vào id
    public void timKiemHocSinhTheoID(Scanner sc) {
        System.out.println("Nhập ID học sinh cần tìm:");
        String id = sc.nextLine();
        //đặt cờ hiệu: chưa tìm thấy HS = false
        boolean found = false; //chưa tìm thấy HS cần tìm
        //bắt đầu tạo ra vòng lặp để kiểm tra từng HS
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.getID().equals(id)) // .equals = trùng
            {
                hs.displayInfo();
                found = true;
                break;//tìm thấy HS cần tìm
            }
        }
        if (!found) //!: lật ngược điều kiện: found = true -> flase
        {
            System.out.println("Không tìm thấy học sinh với ID: " + id);
        }
    }

    //tìm HS theo ID
    public hocSinh timHSTheoID(String id) {
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.getID().equals(id))
                return hs; //trả về học sinh nếu tìm thấy
        }
        return null; //trả về null nếu ko tìm thấy
    }

    //5. Tìm HS có điểm TB cao nhất
    public void timHocSinhCoDiemTBCaoNhat() {
        //kiểm tra rỗng
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }

        double diemTBMax = danhSachHocSinh.get(0).diemTrungBinh();

        //tìm kiếm
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.diemTrungBinh() > diemTBMax) {
                diemTBMax = hs.diemTrungBinh();
            }
        }
        System.out.println("Học sinh có điểm trung bình cao nhất:");
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.diemTrungBinh() == diemTBMax) {
                hs.displayInfo();
            }
        }
    }

    //6. Tìm HS có điểm TB thấp nhất
    public void timHocSinhCoDiemTBThapNhat() {
        //kiểm tra rỗng
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }

        double diemTBMin = danhSachHocSinh.get(0).diemTrungBinh();

        //tìmthấpkiếm
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.diemTrungBinh() < diemTBMin) {
                diemTBMin = hs.diemTrungBinh();
            }
        }
        System.out.println("Học sinh có điểm trung bình thấp nhất:");
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.diemTrungBinh() == diemTBMin) {
                hs.displayInfo();
            }
        }
    }

    //7. Sắp xếp HS theo tên
    public void sapXepTen() {
        //kiểm tra rỗng
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }

        //sắp xếp tên
        danhSachHocSinh.sort((hs1, hs2) -> hs1.getHoTen().compareTo(hs2.getHoTen()));
        System.out.println("Danh sách học sinh sau khi sắp xếp theo tên: ");
        for (hocSinh hs : danhSachHocSinh) {
            hs.displayInfo();
        }

    }

    //8. Cập nhật thông tin HS dựa trên ID
    public void capNhatThongTinNhanVien(Scanner sc) {
        //kiểm tra rỗng
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }

        //Tìm thấy HS cần cập nhật dựa trên ID
        System.out.println("Nhập ID học sinh cần cập nhật: ");
        String id = sc.nextLine();
        hocSinh hs = timHSTheoID(id);
        //Kiểm tra nếu ko tìm thấy HS
        if (hs == null) {
            System.out.println("Không tìm thấy học sinh với ID: " + id);
            return;
        }
        //Nếu tìm thấy HS
        System.out.println("Nhập họ và tên mới của học sinh: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập lớp mới của học sinh: ");
        String lop = sc.nextLine();
        System.out.println("Nhập địa chỉ mới của học sinh: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm Toán mới của học sinh: ");
        double diemToan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Lý mới học sinh: ");
        double diemLy = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Hoá mới của học sinh: ");
        double diemHoa = Double.parseDouble(sc.nextLine());
        //Tạo ra bản sao của HS có ID cần cập nhật
        hs = new hocSinh(id, hoTen, lop, diaChi, diemToan, diemLy, diemHoa);
        //ghi đè lên thông tin của HS cần cập nhật
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            if (danhSachHocSinh.get(i).getID().equals(id)) {
                danhSachHocSinh.set(i, hs);
                break;
            }
        }
        System.out.println("Cập nhật thông tin mới của học sinh thành công!");
    }

    //9. tìm các học sinh có tổng điểm 3 môn trên 24đ
    public void timCacHocSinhCoTongDiemTren24() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }
        System.out.println("Các học sinh có tổng điểm 3 môn trên 24 điểm");
//       //Tạo list mới để lưu trữ
        ArrayList<hocSinh> listHocSinhTren24 = new ArrayList<>();
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.getTongDiem() > 24) {
                listHocSinhTren24.add(hs);
            }
        }
        if (listHocSinhTren24.isEmpty()) {
            System.out.println("Không có học sinh nào có tổng điểm 3 môn trên 24 điểm");
        } else {
            for (hocSinh hs : listHocSinhTren24) {
                hs.displayInfo();
            }
        }
    }

    //10. tìm các học sinh có tổng điểm 3 môn dưới 18đ
    public void timCacHocSinhCoTongDiemDuoi18() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }
        System.out.println("Các học sinh có tổng điểm 3 môn dưới 18 điểm");
        //Tạo list mới để lưu trữ
        ArrayList<hocSinh> listHocSinhDuoi18 = new ArrayList<>();
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.getTongDiem() < 18) {
                listHocSinhDuoi18.add(hs);
            }
        }
        if (listHocSinhDuoi18.isEmpty()) {
            System.out.println("Không có học sinh nào có tổng điểm 3 môn dưới 18 điểm");
        } else {
            for (hocSinh hs : listHocSinhDuoi18) {
                hs.displayInfo();
            }
        }
    }

    //10. tìm các học sinh có điểm trung bình dưới 8 điểm
    public void timCacHocSinhCoDiemTBDuoi8() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách Học sinh rỗng");
            return; //dừng phương thức
        }
        System.out.println("Các học sinh có điểm trung bình dưới 8 điểm");
        //Tạo list mới để lưu trữ
        ArrayList<hocSinh> listHocSinhTBDuoi8 = new ArrayList<>();
        for (hocSinh hs : danhSachHocSinh) {
            if (hs.getDiemTB() < 8) {
                listHocSinhTBDuoi8.add(hs);
            }
        }
        if (listHocSinhTBDuoi8.isEmpty()) {
            System.out.println("Không có học sinh nào có điểm trung bình dưới 8 điểm");
        } else {
            for (hocSinh hs : listHocSinhTBDuoi8) {
                hs.displayInfo();
            }
        }
    }
}



