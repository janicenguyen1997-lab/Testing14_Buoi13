package baiTap;
import java.util.Scanner;
public class Baitap_2A {
    public static void main(String[] args) {
        //BT: Xếp loại HS dựa trên điểm TB
        //ĐTB < 5.0: HS yếu
        // 5.0 <= ĐTB < 7.0: HS TB
        // 7.0 <= ĐTB <= 8.5: HS khá
        // 8.5 < ĐTB <= 10.0: HS giỏi
        // Nhập điểm  Toán, ANh, văn + Họ tên
        Scanner sc = new Scanner(System.in);

        // input: Nhập Họ tên, điểm Toán, Văn, Anh
        System.out.println("Nhập Họ và tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập điểm Anh:");
        Float diemAnh = sc.nextFloat();
        System.out.println("Nhập điểm Toán:");
        Float diemToan = sc.nextFloat();
        System.out.println("Nhập điểm Văn:");
        Float diemVan = sc.nextFloat();
        sc.nextLine();
        System.out.println();
        // process:
        // Tính Điểm TB
        Float diemTB = (diemAnh + diemVan + diemToan)/3;
        //Xét điểm TB
        String xepLoai = "";
//        Khai báo biến xepLoai kiểu String
//        Gán giá trị ban đầu là chuỗi rỗng ("")
        if (diemTB < 5.0){
            xepLoai = "Yếu";
        } else if (diemTB >= 5.0 && diemTB < 7.0) {
            xepLoai = "Trung bình";
        } else if (diemTB >= 7.0 && diemTB < 8.5) {
            xepLoai = "Khá";
        } else if (diemTB >= 8.5 && diemTB <= 10.0) {
            xepLoai = "Giỏi";
        } else {
            xepLoai = "Điểm không hợp lệ - vui lòng nhập lại";
        }
        // output: in ra các thông tin và thông báo xếp loại của HS
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm Anh: " + diemAnh + ", Điểm Toán: " + diemToan + ", Điểm Văn: " + diemVan);
        System.out.println("Nhập điểm trung bình: " + diemTB);
        System.out.println("Xếp loại là: " + xepLoai);
        System.out.println();

        //BT2: tính tiền điện
        // ĐK: số điện tiêu thụ <= 50kwh thì giá điện = 1000đ/kw
        // số điện tiêu thụ <= 100kwh thì giá điện = 1200đ/kww
        // số điện tiêu thụ > 100kwh thì giá điện = 1500đ/kww

        //input: nhập số điện tiêu thụ
        System.out.println("Nhập số điện tiêu thụ");
        Double soDienTieuThu = sc.nextDouble();

        //process: tính giá điện
        //khai báo 2 biến soDienTieuThu và giaDien NGOÀI vòng if else
        double giaDien = 0; // gán cho biến = 0 khi chưa biết biến đó có giá trị CỤ THỂ nào
        double tienDienThu = 0;
        if (soDienTieuThu <= 50){
            giaDien = 1000.0;
            tienDienThu = soDienTieuThu * giaDien;
        } else if (soDienTieuThu <= 100){
            giaDien = 1200.0;
            tienDienThu = soDienTieuThu * giaDien;
        } else if (soDienTieuThu > 100) {
            giaDien = 1500.0;
            tienDienThu = soDienTieuThu * giaDien;
        } else {
            System.out.println("Số điện tiêu thụ không hợp lệ - vui lòng nhập lại");
        }

        System.out.println("Số điện tiêu thụ: " + soDienTieuThu + " kw/h" + ", Giá điện: " + giaDien + " đồng" + ", Tiền Điện: " + tienDienThu + " đồng");
        System.out.println();


        //BT3: tính tiền taxi
        // ĐK: 1 km đầu tiên là 20000đ/km
        // km tiếp theo (2-5km) là 15000đ/km
        // km tiếp theo (5-10km) là 12000đ/km
        // km tiếp theo > 10km) là 10000đ/km

        //input: nhập số km, gán các biến giá tiền 1 km và tổng giá tiền
        System.out.println("Nhập số km đi được");
        double soKm = sc.nextDouble();
        double tongTienTaxi = 0;

        //process: xét ĐK và tính tiền
        if (soKm <= 1){
            tongTienTaxi = 20000;
        } else if (soKm > 1 && soKm <=5){
            tongTienTaxi = 20000 + (soKm -1) * 15000; //Tính cả giá của km đầu tiên nên là 20000 + số km còn lại * 15000
        } else if (soKm > 5 && soKm <=10) {
            tongTienTaxi = 20000 + 4 * 15000 + (soKm - 5) * 12000; //Tính cả giá của km đầu tiên (200000 + giá của Số km trong khoảng 2-5  + số km còn lại * 15000
        } else if (soKm > 10) {
            tongTienTaxi = 20000 + 4 * 15000 + 5 * 12000 + (soKm - 10) * 10000; //Tương tự
        } else {
            System.out.println("Số km không hợp lệ - vui lòng nhập lại");
        }

         //output: In ra kết quả
        System.out.println("Số Km đi được: " + soKm + "km" + ", Tiền Taxi: " + tongTienTaxi + "đồng");
        System.out.println();

    }
}
