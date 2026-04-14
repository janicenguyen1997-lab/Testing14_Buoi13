package baiTap;
import java.util.Scanner;

public class Baitap_3 {
    public static void main(String[] args) {
        //BT1: Quản lý chi tiết cá nhân trong 7 ngày. Cho phép người dùng nhập vào
        // chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
        //chi tiêu cao nhất và thấp nhất trong 7 ngày
        Scanner sc =new Scanner(System.in);
        double[] chiTieu = new double[7];
        // Cho người dùng NHẬP chi tiêu 7 ngày
        for (int i = 0; i < chiTieu.length; i++ ){
            System.out.println("Nhập vào chi tiêu ngày " + (i+1) + ": ");
            chiTieu[i] = sc.nextDouble();
            System.out.println("Chi tiêu ngày " + (i+1) + ": " + chiTieu[i]);
            // chiTieu[i]: để in ra từng giá trị của từng vị trí trong mảng
        }
//process: Thực hiện các phép tính: Tổng và Trung bình
        // Để làm BT MIN/ MAX thì cứ mặc định max[0]
        // sau đó bắt đầu so sánh chiTieu[1] > max[0] => max = chiTieu[1]
        //lệnh vòng lặp sẽ dừng khi chiTieu[n+1] < max
        double tongChiTieu = 0;
        double chiTieuTB = 0;
        double chiTieuCaoNhat = chiTieu[0];
        double chiTieuThapNhat = chiTieu[0];
        for (double chiMoiNgay : chiTieu){
            tongChiTieu += chiMoiNgay; // tongChiTieu = tongChiTieu + chiMoiNgay
            // C1 MAX: if (chiMoiNgay > chiTieuCaoNhat) {
                //chiTieuCaoNhat = chiMoiNgay;}
            // C1 MIN: if (chiMoiNgay < chiTieuThapNhat) {
                  //chiTieuThapNhat = chiMoiNgay;}
        }
        //C2:
        for (int i = 0; i < chiTieu.length; i++){
            if (chiTieu[i] > chiTieuCaoNhat) {
                chiTieuCaoNhat = chiTieu[i];
            }
        }
        for (int i = 0; i < chiTieu.length; i++ ){
            if (chiTieu[i] < chiTieuThapNhat) {
                chiTieuThapNhat = chiTieu[i];}
        }
        chiTieuTB = tongChiTieu / chiTieu.length;

        // output: In ra
        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChiTieu);
        System.out.println("Chi tiêu trung bình của 7 ngày: " + chiTieuTB);
        System.out.println("Chi tiêu cao nhất trong 7 ngày: " + chiTieuCaoNhat);
        System.out.println("Chi tiêu thấp nhất trong 7 ngày: " + chiTieuThapNhat);
        System.out.println();


        //BT2: quản lý điểm số của HS trong 5 môn. Cho phép ngừoi dùng nhập vào
        //Điểm số của HS trong 5 môn, sau đó in ra điểm TB , điểm cao nhất và thấp nhất
        // và số môn học có điểm số >= 5.0

        //input: Nhập điểm số 5 môn:
        double[] mangDiem = new double[5];
        for (int i = 0; i < mangDiem.length; i++) {
            System.out.println("Nhập vào điểm môn " + (i + 1) + ": ");
            mangDiem[i] = sc.nextDouble();
            System.out.println("Điểm môn " + (i + 1) + ": " + mangDiem[i]);
        }

        //process: Tính điểm TB,
        double diemTB = 0;
        double tongDiem = 0;
        double diemCaoNhat = mangDiem[0];
        double diemThapNhat = mangDiem[0];
        int tongSoMon = 0;
        for (double diem : mangDiem){
            tongDiem += diem;

            if (diem > diemCaoNhat){
                diemCaoNhat = diem;
            }

            if (diem < diemThapNhat) {
                diemThapNhat = diem;
            }

            if (diem <= 5){
                tongSoMon++;
            }
        }
        diemTB = tongDiem / mangDiem.length;

        //output: In ra
        System.out.println("Điểm trung bình của 5 môn là: " + diemTB);
        System.out.println("Điểm cao nhất: " + diemCaoNhat);
        System.out.println("Điểm thấp nhất: " + diemThapNhat);
        System.out.println("Tổng số môn có điểm thấp hơn hoặc bằng 5 là: " + tongSoMon);
        System.out.println();


        //BT3: Quản lý thông tin của nhân viên
        //Cho phép ngừoi dùng nhập các thông tin: Họ tên, tuổi, lương cơ bản
        // số giờ làm mỗi ngày trong 1 tuần,
        // sau đó in ra tổng số giờ làm trong tuần, trung bình số giờ làm mỗi ngày
        // và số ngày làm việc có số giờ làm >= 8 giờ

        //input: Nhập các thông tin của nhân viên
        //Họ tên, tuổi, lương cơ bản
        System.out.println("Nhập Họ và tên nhân viên");
        String hoTen = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập tuổi của của nhân viên");
        int tuoi = sc.nextInt();
        sc.nextLine();
        double luongCoBan = sc.nextDouble();
        sc.nextLine();
        // Số giờ làm mỗi ngày trong tuần
        int[] mangNgay = new int[7];
        for (int i = 0; i < mangNgay.length; i++) {
            System.out.println("Nhập số giờ làm ngày " + (i + 1) + "trong tuần: ");
            mangNgay[i] = sc.nextInt();
            System.out.println("Ngày " + (i + 1) + ": " + mangNgay[i]);
        }

        //process: Tính Tổng giờ làm, TB số giờ mỗi ngày
        int tongSoGio = 0;
        double gioTrungBinh = 0;
        double tongSoNgay = 0;

        for (int gio : mangNgay){
            tongSoGio += gio;

            if (gio >= 8){
                tongSoGio++;
            }
        }
        gioTrungBinh = (double) tongSoGio / mangNgay.length; // do định nghĩa "tongSoGio" là int, chia cho .length
        // -> kết quả sẽ ra int , trong khi định nghĩa "gioTrungBinh" là double
        //-> ép kiểu sang double (do Tb sẽ có lẻ)
        // -> có thể viết lại thành: gioTrungBinh = (double) tongSoGio / mangNgay.length;
        // Hoặc khai báo như sau: Bỏ bước khai báo: double gioTrungBinh = 0; // Thay thế bằng
        // double gioTrungBinh = (double) tongSoGio / mangNgay.length;

        //output: In ra
        System.out.println("Họ và tên nhân viên: " + hoTen);
        System.out.println("Tuổi nhân viên: " + tuoi);
        System.out.println("Lương cơ bản " + luongCoBan);
        System.out.println("Tổng số giờ làm của nhân viên: " + tongSoGio);
        System.out.println("Số giờ trung bình mỗi ngày nhân viên làm: " + gioTrungBinh);
        System.out.println("Số ngày làm việc có số giờ ít hơn hoặc bằng 8 tiếng:" + tongSoNgay);

    }
}
