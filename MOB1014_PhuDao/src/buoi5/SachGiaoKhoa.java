/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 * SachGiaoKhoa: LỚP CON
 * -> có thể kế thừa được tất cả thuộc tính & phương thức của LỚP CHA
 * -> TRỪ CONSTRUCTOR
 */
public class SachGiaoKhoa extends Sach{
    //bổ sung thêm thuộc tính riêng
    private int lop;
    
    //constructor
    //ctrl + cách x3 lần
    //constructor ko tham số
    public SachGiaoKhoa() {
    }
    //constructor có tham số -> thuộc tính lớp con
    public SachGiaoKhoa(int lop) {
        this.lop = lop;
    }
    //constructor có tham số -> FULL
    //this: tham chiếu tới đối tượng của lớp hiện tại
    //super: tham chiếu tới đối tượng của lớp CHA
    public SachGiaoKhoa(int lop, String ma, String ten, int gia, int namXuatBan) {
        super(ma, ten, gia, namXuatBan);
        this.lop = lop;
    }
    //getter & setter
    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }
    
    //click chuột phải -> insert code -> override method
    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("lop= "+ lop);
    }
    /*
    ĐA HÌNH (Polymorphism)
            Thể hiện rõ nhất khi gọi đến 1 phương thức của đối tượng giống nhau nhưng kết quả của phương
            thức đó có thể khác nhau.
            + NẠP CHỒNG (Overloading): Nạp chồng phương thức cùng tên cùng kiểu phương thức nhưng
            khác tham số truyền vào. Khi đưa đúng số lượng tham số truyền vào sẽ gọi đúng phương thức
            cần được thực hiện.
            + GHI ĐÈ (Overriding): Ghi đè phương thức có cùng tên cùng tham số giữa lớp cha và lớp con.
            Các phương thức của lớp con kế thừa từ lớp cha từ kiểu phương thức, tên, tham số truyền vào
            nhưng tại các lớp con có thể viết lại code hành động khác theo nghiệp vụ của nó với phương 
            thức được kế thừa.
    */
   
    
}
