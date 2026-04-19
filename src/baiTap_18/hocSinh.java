package baiTap_18;

import java.util.Scanner;

public class hocSinh {
    public String getID;
    //thuộc tính
    // học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}
    private String id;
    private String hoTen;
    private String lop;
    private String diaChi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    //constructor: để nhận giá trị vào trong thuộc tính
    public hocSinh(String id, String hoTen, String lop, String diaChi, double diemToan, double diemLy, double diemHoa) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diaChi = diaChi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    //phương thức: tính tổng điểm của 3 môn
    public double tongDiem(){
        return diemToan + diemLy + diemHoa;
    }
    //phương thức: tính điểm TB
    public double diemTrungBinh(){
        return tongDiem() / 3;
    }

    //phương thức display để hiển thị thông tin của HS
    public void displayInfo() {
        System.out.println("Số ID của học sinh: " + id +
                "| Họ và tên: " + hoTen +
                "| Lớp: " + lop +
                "| Địa Chỉ: " + diaChi +
                "| Điểm Toán: " + diemToan +
                "| Điểm Lý: " + diemLy +
                "| Điểm Hoá: " + diemHoa +
                "| Tổng điểm 3 môn: " + tongDiem() +
                "| Điểm trung bình: " + diemTrungBinh());
    }

    //phương thức getID để lấy id SV
    public String getID() {
        return id;
    }
    public String getHoTen (){
        return hoTen;
    }
    public double getTongDiem (){
        return tongDiem();
    }
    public double getDiemTB (){
        return diemTrungBinh();
    }





    }

