public class Buoi_2 {
    public static void main(String[] args) {
        //4.3. Toán tử gán:
        //4.3.1: gán giá trị "="
        String ngay = "Thứ 2: 24/5/456";
        System.out.println("Ngày: " + ngay);

        //4.3.2: gán biến với phép tính
        int soA = 10;
        // vì đã khai báo biến "soA" với Int nên khi làm phép tính sẽ ko khai báo lại biến soA với Int
        soA += 5; //tương đương : soA = soA + 5
        System.out.println("So A 1: " + soA);
        soA -= 3; //tương đương : soA = soA - 3
        System.out.println("So A 2: " + soA);
        soA *= 7; //tương đương : soA = soA * 7
        System.out.println("So A 3: " + soA);
        soA /= 4; //tương đương : soA = soA / 4
        System.out.println("So A 4: " + soA);
        // output in ra :
//        So A 1: 15
//        So A 2: 12
//        So A 3: 84
//        So A 4: 21
        System.out.println(); // xuống dòng khi chạy chương trình.

        //4.4: Toán tử logic: &&, ||, !
        //4.4.1: "&&" kết hợp TẤT CẢ các điều kiện của các biến Boolean
        //Chỉ dùng với các biến có kiểu dữ liệu là Boolean
        Boolean logicA = true;
        Boolean logicB = true;
        Boolean logicC = true;
        Boolean logicD = false;
        Boolean logicE = false;
        Boolean ketQua1 = logicA && logicB && logicC; // kết quả là true
        System.out.println("Kết quả 1: " + ketQua1);

        //4.4.2: "||" hoặc biến Boolean này hoặc biến Boolean kia
        Boolean ketQua2 = logicA || logicE || logicD;
        // Chỉ cần có 1 trường hợp TRUE thì cả phép sẽ là TRUE
        System.out.println("Kết quả 2: " + ketQua2);

        //4.4.3: "!" đảo ngược giá trị của biến Boolean
        Boolean ketQua3 = !logicA;
        // Phủ định gía trị của biến logicA
        System.out.println("Kết quả 3: " + ketQua3);
        System.out.println();

        //5. Cấu trúc câu điều kiện:
        //5.1. IF statement:
        // if (điều kiện ĐÚNG) ==> {thực hiện logic}
        int thu = 2;
        if (thu == 2 || thu == 6) {
            System.out.println("Hôm nay tôi ko đi học");
        }
        //5.2: if ... else:
        // if (điều kiện 1 ĐÚNG) {thực hiện logic A} else { thực hiện logicB}
        int soBuoiNghi = 4;
        float dtb = 7;
        Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 3;
        if (isQuaMon) {
            // Nếu điều kiện ĐÚNG thì thực hiện logicA
            System.out.println("SV qua môn");
        } else {
            // Nếu điều kiện SAI thì thực hiện logicB
            System.out.println("SV ko qua môn");
        }
        // if ...else if ...: ĐIỀU KIỆN
        // if (điều kiện A ĐÚNG) {thực hiện logic A} else if (điều kiện B ĐÚNG){ thực hiện logicB} else {thực hiện logic C}
        // thực hiện logic C khi cả A và B SAI
        // Xem file Baitap_2A
//        Khi nào dùng if-else?
//        So sánh điều kiện phức tạp
//        Có >, <, >=, <=
//        Có && (và), || (hoặc)
        // --> Dùng khi có tính toán, so sánh

        // 5.3: switch case statement: LỰA CHỌN
        // switch (biểu thức CHƯA ĐƯỢC kiểm tra) --> sẽ chia ra NHIỀU trường hợp khác nhau
        // kiểm tra với giá trị: nếu case 1 == giá trị 1 --> thực hiện logic1; break; //BẮT BUỘC dùng "break" để DỪNG
        // case1 giá trị 1: thực hiện logic1; break;
        // case2 giá trị 2: thực hiện logic2; break;
        //case3 giá trị 3: thực hiện logic3; break;
        // nếu ko có "break" thì sẽ thực hiện tiếp logic2 mà KHÔNG kiểm tra giá trị case 2.
        // khi Không có giá trị nào khớp với điều kiện yêu cầu thì sẽ thực hiện lệnh "default"
        //default: thực hiện logic mặc định; break;
//        2. Khi nào dùng switch-case?
//        So sánh giá trị cụ thể (==)
//        Có nhiều trường hợp rõ ràng
        // --> Dùng khi menu, chọn chức năng

        //ví dụ:
        int soC = 2;
        switch (soC) {
            case 1:
                System.out.println("Số C là 1");
                break;
            case 2:
                System.out.println(" Số C là 2");
                break;
            case 3:
                System.out.println("Số C là 3");
                break;
            default:
                System.out.println("Số C không phải là 1, 2 hoặc 3");
                break;
        }

        // nếu có vài case cùng 1 logic:
        switch (soC) {
            case 1:
                System.out.println("Số C là 1");
                break;
            case 2:
            case 3:
                System.out.println("Số C là 2 hoặc 3");
                break;
            default:
                System.out.println("Số C không phải là 1, 2 hoặc 3");
                break;
        }

        // 5.4: Vòng lặp:
        // 5.4.1: Vòng lặp while
        // cú pháp: while (điều kiện đúng) {thực hiện logicA}
        // nếu Đk luôn ĐÚNG thì sẽ logic sẽ được thực hiện vô tận cho đến khi ĐK SAI
        //Ví dụ: while (true) {
        // System.out.println(" Vòng lặp chạy lại ...");}

        int soD = 2;
        while (soD <= 10) {
            System.out.println("Số D: " + soD);
            soD += 2; // soD = soD + 2 => 4 -> 6 -> 8 -> 10 -> 12 -> vòng lặp dừng chạy)
        }

        int soE = 1;
        while (soE <= 5) {
            System.out.println("Số E: " + soE);
            soE++; // soE += 1 => soE++ -> "++" tức là tăng lên 1 đơn vị; "--" giảm đi 1 đơn vị
            //"++", "--" là hậu tố: dùng biến đó thực hiện 1 logic/ phép tính, SAU ĐÓ tăng/ giảm đi 1 đơn vị => HẬU TỐ
        }

        //5.4.2: Vòng lặp do ... while
        // cú pháp: do {thực hiện logic A} while (điều kiện ĐÚNG);
        // Thực hiện logic của "do" trước rồi mới kiểm tra điều kiện của while (dù ĐK ĐÚNG hay SAI)

        int soF = 1;
        do {
            System.out.println("Số F: " + soF);
            soF++;
        } while (soF <= 3);// cho đến khi ĐK = false -> vòng lặp sẽ dừng

        //5.4.3: Vòng lặp For (*): Viết các dòng code gọn hơn
        // For: luôn CẦN giá trị khởi tạo và BIẾT TRƯỚC số lần lặp lại CỤ THỂ
        //cú pháp: for (giá trị khởi tạo; điều kiện ĐÚNG; giá trị thay đổi) {thực hiện logic}
        //Vd: giá trị khởi tạo: int soF =1; điều kiện ĐÚNG: soF <= 3;
        // giá trị khởi tạo LUÔN BẮT ĐẦU = 0 hoặc 1
        for (int i =1; i < 5; i++){
            System.out.println("i: " + i);
        }
        // Kết quả máy chạy: i: 1; i: 2; ...; i: 5 => Vòng lặp FOR dừng lại
    }
}




