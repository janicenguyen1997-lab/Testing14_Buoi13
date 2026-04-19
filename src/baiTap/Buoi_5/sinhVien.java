package baiTap.Buoi_5;

import java.util.Scanner;

public class sinhVien {
    //thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double score;

    //constructor mặc định ko có tham số nếu người dùng ko truyền vào
    public sinhVien (){}

    //constructor: nhận giá trị vào trong thuộc tính
    public sinhVien (String id, String name, int age, String address, double score){
        this.id = id;
        this.name = name;
        this.age= age;
        this.address = address;
        this.score = score;
    }

    //phương thức
    //lấy các giá trị thông qua .get and .set
    public void input(Scanner sc){ // dùng void vì chỉ gắn giá trị chứ không lấy giá trị trở về
        System.out.println("Nhập ID: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine(); //để đọc bỏ dòng mới sau khi nhập age
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Nhập điểm: ");
        this.score = sc.nextDouble();
        sc.nextLine();
    }

    //phương thức display để hiển thị thông tin của SV
    public void display(){
        System.out.println("Thông tin sinh viên: " + id +
                "| Name " + name +
                "| Age " + age +
                "| Address " + address +
                "| Score" +  + score);
    }
//phương thức getID để lấy id SV
    public String getID(){
        return id;
    }
}
