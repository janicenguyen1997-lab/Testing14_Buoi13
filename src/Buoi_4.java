import java.util.ArrayList;
import java.util.Collections;

public class Buoi_4 {
    public static void main(String[] args) {
        //Array: Kích thước cố định, Nhanh , Dùng cho dữ liệu đơn giản
        // Không thể thêm/xóa

        //ArrayList: Kích thước thay đổi được, Thêm / xóa dễ dàng, Dùng nhiều trong thực tế

        //9. ArrayList: là 1 cấu trúc dữ liệu rộng, có thể THAY ĐỔI LÍCH THƯỚC trong quá trình khai báo biến và chạy chương trình
        //cú pháp: ArrayList <kiểu dữ liệu> tenMang = new ArrayList<>();

        //ví dụ: nhập mảng String điện thoại: iphone, samsung, xiaomi, oppo, realme
        ArrayList<String> mangDienThoai = new ArrayList<>();

        //CRUD của ArrayList: Create, Read, Update, Delete

        //9.1: GÁN giá trị vào từng vị trí trong mảng Arraylist: sử dụng phương thức add()
        // cú pháp: tenMang.add(giá trị);
        mangDienThoai.add("iphone"); //mangDienThoai = ["iphone]
        mangDienThoai.add("samsung"); //mangDienThoai = ["iphone", "samsung"]
        mangDienThoai.add("xiaomi"); //...
        mangDienThoai.add("oppo"); //...
        mangDienThoai.add("realme"); //mangDienThoai = ["iphone", "samsung", "xiaomi", "oppo", "realme"]
        System.out.println("Giá trị của mảng điện thoại: " + mangDienThoai);
        //Kết quả máy chạy: Giá trị của mảng điện thoại: [iphone, samsung, xiaomi, oppo, realme]

        //9.2: THÊM vào vị trí cụ thể: sử dụng phương thức .add(index, giá trị); (lưu ý index bắt đầu từ 0)
        mangDienThoai.add( 1,  "nokia"); // ==> mangDienThoai = [iphone, nokia, samsung, xiaomi, oppo, realme]
        System.out.println("Giá trị của mảng điện thoại sau khi thêm nokia vào vị trí index 1: " + mangDienThoai);
        //Kết quả máy chạy: Giá trị của mảng điện thoại sau khi thêm nokia vào vị trí index 1: [iphone, nokia, samsung, xiaomi, oppo, realme]

        //9.3: CẬP NHẬT giá trị mới vào vị trí cụ thể trong mảng: sử dụng phương thức .set(index, giá trị);
        mangDienThoai.set(3, "huawei"); //mangDienThoai = mangDienThoai = [iphone, nokia, samsung, huawei, oppo, realme]
        System.out.println("Giá trị của mảng điện thoại sau khi cập nhật huawei vào vị trí index 3: " + mangDienThoai);
        //Kết quả máy chạy: Giá trị của mảng điện thoại sau khi cập nhật huawei vào vị trí index 3: [iphone, nokia, samsung, huawei, oppo, realme]

        //9.4: XOÁ 1 phần tử trong mảng: sử dụng phương thức .remove(index;
        mangDienThoai.remove(2); //mangDienThoai = mangDienThoai = [iphone, nokia, huawei, oppo, realme]
        System.out.println("Giá trị của mảng điện thoại sau khi xoá giá trị vị trí index 2: " + mangDienThoai);
        //Kết quả máy chạy: Giá trị của mảng điện thoại sau khi xoá giá trị vị trí index 2: [iphone, nokia, huawei, oppo, realme]

        //9.5: DUYỆT MẢNG: sử dụng vòng lặp "for" để duyệt qua TẤT CẢ phần tử của mảng
        for( String dienThoai: mangDienThoai){
            System.out.println("Tên các điện thoại: " + dienThoai);
        } //Kết quả máy chạy:
//        Tên các điện thoại: iphone
//        Tên các điện thoại: nokia
//        Tên các điện thoại: huawei
//        Tên các điện thoại: oppo
//        Tên các điện thoại: realme

        // 9.6: ĐẾM số lượng phần tử trong mảng: sử dụng phương thức .size();
        int soLuong = mangDienThoai.size();
        System.out.println("Số lượng phần tử trong mảng điện thoại: " + soLuong);
        //Kết quả máy chạy: Số lượng phần tử trong mảng điện thoại: 5

        ArrayList<Integer> mangSo = new ArrayList<>();
        mangSo.add(3);
        mangSo.add(1);
        mangSo.add(5);
        mangSo.add(4);
        mangSo.add(9);
        //9.7: SĂP XẾP các phần tử trong mảng:
        //9.7.1: Sắp xếp theo thứ tụ TĂNG DẦN: .sort();
        Collections.sort(mangSo);
        System.out.println("Giá trị của mảng số sau khi sắp xếp theo thứ tự TĂNG DẦN: " + mangSo);
        //Kết quả máy chạy: Giá trị của mảng số sau khi sắp xếp theo thứ tự TĂNG DẦN: [1, 3, 4, 5, 9]

        //9.7.2: sau khi sắp xếp tăng dần thì ĐẢO NGƯỢC lại: .reverse();
        Collections.reverse(mangSo);
        System.out.println("Giá trị của mảng số sau khi sắp xếp theo thứ tự GIẢM DẦN: " + mangSo);
        //Kết quả máy chạy: Giá trị của mảng số sau khi sắp xếp theo thứ tự GIẢM DẦN: [9, 5, 4, 3, 1]

        //9.8: TÌM KIẾM phần tử trong mảng: .contains(giá trị muốn tìm);
        Boolean ketQua = mangDienThoai.contains("iphone");
        // Kết quả: true (giá trị muốn tìm có TỒN TẠI trong mảng
        // Kết quả: false (giá trị muốn tìm KHÔNG tồn tại trong mảng
        Boolean ketQua2 = mangSo.contains(2);
        System.out.println("Kết quả tìm kiếm 'iphone' trong mảng điện thoại: " + ketQua);
        //Kết quả máy chạy: Kết quả tìm kiếm 'iphone' trong mảng điện thoại: true
        System.out.println("Kết quả tìm kiếm '2' trong mảng số: " + ketQua2);
        //Kết quả máy chạy: Kết quả tìm kiếm '2' trong mảng số: false



    }
}
