import java.util.Arrays;
// 6. MẢNG: Arrays
//6.1: Khai báo từng giá trị của từng VỊ TRÍ trong mảng
public class Buoi_3 {
    public static void main(String[] args) {
        // array: mảng, là một cấu trúc dữ liệu dùng để lưu NHIỀU giá trị với CÙNG MỘT MỤC ĐÍCH SỬ DỤNG
        //khai báo biến: <kiểu dữ liệu> tenBien = giá trị;
        // khai báo MẢNG: <kiểu dữ liệu> [] tenMang = new <kiểu dữ liệu>[kích thước]; -> số lượng các phần tửcuar mảng
        int [] mangSo = new int[5];
        //Vị trí của mảng index sẽ bắt đầu đếm từ số 0, tức là vị trí cuối cùng = tổng sô -1
        mangSo[0] = 1; //định nghĩa giá trị của vị trí 0
        mangSo[1] = 4;
        mangSo[2] = 2;
        mangSo[3] = 7;
        mangSo[4] = 6;
        System.out.println("Giá trị của phần tử có index 4: " + mangSo[4]);
        //Kết quả máy chạy: Giá trị của phần tử có index 4: 6
        System.out.println("Giá trị của mảng:" + Arrays.toString(mangSo));
        // Kết quả máy chạy: Giá trị của mảng:[1, 4, 2, 7, 6]
        // Giá trị được in ra THÔNG QUA Arrays.toString() thì sẽ hiện kết quả có dấu [...]

        //6.2: Khai báo mảng: <kiểu dữu liệu>[] tenMang = {giá trị 1, giá trị 2, giá trị 3, ...};
        String[] mangTen = {"Nguyễn A", "Nguyễn B", "Nguyễn C"};
        // Để đổi giá trị của VỊ TRÍ 2
        mangTen[2] = "Lê D";
        System.out.println("Tên ở Vị trí 3: " + mangTen[2]);
        // Kết quả máy chạy: Tên ở Vị trí 3: Lê D
        System.out.println("Số lượng phần tử có bên trong mảng: " + mangTen.length);
        //.length: Trả về số lượng phần tử của mảng
        //Kết quả máy chạy ra: Số lượng phần tử có bên trong mảng: 3

        //6.3: Duyệt mảng: sử dụng vòng lặp "for" để duyệt qua TỪNG phần tử của mảng
        for (int i = 0; i < mangTen.length; i++){
            // mangTen.length: Tổng các vị trí của mảng
            // i < mangTen.length: i = tổng các vị trí - 1
            System.out.println("Phần tử có index " + i + " là: " + mangTen[i]);
        }
        //Kết quả máy chạy ra:
        //Phần tử có index 0 là: Nguyễn A
        //Phần tử có index 1 là: Nguyễn B
       // Phần tử có index 2 là: Lê D

        //6.4: For each: CHỈ dùng cho MẢNG
        //khai báo tên mảng trước: String[] tenMang = {các giá trị của mạng};
        //cú pháp: for (kiểu dữ liệu tenBien : tenMang) {logic sử dụng với từng tenBien}
        int a =1;
        for (String ten: mangTen){
            System.out.println("Tên học sinh " + a + ": " + ten);
            a++;
        }
        //Kết quả máy chạy:
        // Tên học sinh 1: Nguyễn A
        //Tên học sinh 2: Nguyễn B
        //Tên học sinh 3: Lê D

        //if else statement:
        //Vd:
        int diem = 85;
        if (diem >= 80) {
            System.out.println("Đạt điều kiên");
        }else {
            System.out.println("Không đạt điều kiện");
        }
        //Có thể viết ngắn gọn hơn bằng phương pháp sau:
        //7. Toán tử 3 ngôi: dùng với các logic đơn giản, in ra các dữ liệu/ giá trị đơn giản
        //cú pháp: điều kiện ĐÚNG ? thực hiện logicA : thực hiện logicB
        //Cách hiểu: Nếu điều kiện ĐÚNG thì sẽ thực hiện logicA, nếu SAI sẽ thực hiên logicB
        //lưu ý: logicA hay B sẽ trả ra 1 giá trị
        //C1:
        System.out.println(diem >= 80 ? "Đạt điều kiên" : "Không đạt điều kiện");
        //C2:
        String ketQua = diem <= 80 ? "Đạt điều kiên" : "Không đạt điều kiện";
        System.out.println(ketQua);
        System.out.println ();

        //8.ÉP kiểu dữ liệu: CHUYỂN từ kiểu dữ liệu này SANG kiểu dữ liệu khác
        //8.1. ÉP kiểu NGẦM ĐỊNH: TỰ ĐỘNG chuyển kiểu dữ liệu NHỎ hơn sang kiểu dữ liệu LỚN hơn
        // (của cùng 1 loại dữ liệu: là số: byte < short < int < long < float < double
        byte so1 = 10;
        int so2 = so1; // -> tự động chuyển từ byte sang int
        System.out.println("Giá trị của số 2: " + so2);

        //8.2. ÉP kiểu TƯỜNG MINH: TỰ ĐỘNG chuyển kiểu dữ liệu LỚN hơn sang kiểu dữ liệu NHỎ hơn
        // (của cùng 1 loại dữ liệu: là số: double > float > long > int > short > byte
        //Cú pháp: <kiểu dữ liệu cần chuyển> tenBien = (kiểu dữ liệu cần chuyển) biến/giá trị cần chuyển;
        double so3 = 3.14;
        int so4 = (int) so3;
        System.out.println("Số 4: " + so4);

        //8.3. ÉP từ SỐ sang CHữ/ từ CHữ sáng SỐ
        int so5 =100;
        String str5 = Integer.toString(so5); // ép từ SÔ sang CHỮ
        String str5_1 = String.valueOf(so5); // cách khác ép từ SỐ sang CHỮ
        System.out.println("st5: " + str5);
        //Ngược lại:
        String str6 = "200";
        int so6 = Integer.parseInt(str6);// ép từ CHỮ sang SỐ
        //cú pháp: <kiểu dữ liệu cần chuyển> bienMuonChuyen = Integer.parse<kiểu dữ liệu cần chuyển>(biến cần chuyển)
        //chỉ chuyển int SỐ sang string SỐ
        System.out.println("Số 6: " +so6);






    }
}
