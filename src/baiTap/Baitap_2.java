package baiTap;
import java.util.Scanner;
public class Baitap_2 {
    public static void main(String[] args) {
        // BT: kiểm tra sinh viên có qua môn ko dựa trên điểm số với điều kiện: điểm TB >= 5.0;
        // không được nghỉ quá 3 buổi

        //input: điểm TB, số buổi nghỉ
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();
        System.out.println("Nhập số ngày nghỉ: ");
        int ngayNghi = sc.nextInt();
        sc.nextLine();

        //process: kiểm tra điều kiện
        Boolean isQuaMon = diemTB >= 5.0 && ngayNghi <= 3;
        // dùng "&&" kết hợp 2 điều kiện.
        // Tích hợp If ... else
        if (isQuaMon){
            // logicA == true
            System.out.println("Sinh viên qua môn");
        }
        else {
            System.out.println("Sinh viên ko qua môn");
        }

        //output: in ra kết quả SV có qua môn hay không
        //System.out.println("Kết quả sinh viên có qua môn hay không: " + isQuaMon);
        System.out.println();

        //BT 2: Kiểm tra xem KH có được giảm giá ko
        //ĐK: Kh là SV hay không hoặc tổng đơn hàng >= 500.000đ tổng đơn hàng
        //Boolean isSV = sc.nextBoolean(); // để nhập true/false

        //input: isSV, nhập tổng số tiền
        System.out.println("Khách Hàng có phải là Sinh viên hay không? (true/false)");
        Boolean isSV = sc.nextBoolean(); // nhập true/false để xác định là SV hay không
        System.out.println("Nhập Tổng số tiền:");
        Double tongSoTien = sc.nextDouble();
        sc.nextLine();

        // process: Kiểm tra:
        // KH là SV HOẶC Tổng tiền >= 500.000 đồng
        Boolean isGiamGia = isSV || tongSoTien >= 500000;
        //tích hơp if else
        if (isGiamGia){
            System.out.println("Khách hàng được giảm giá");
        }
        else {
            System.out.println("Khách hàng ko được giảm giá");
        }

        //Output: KH được giảm giá hay ko
        //System.out.println("Khách hàng được giảm giá: " + isGiamGia);

    }
}
