/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 * THỪA KẾ (Inheritance)
 * Cho phép định nghĩa một lớp đối tượng 
 * dựa trên các thuộc tính có sẵn của một lớp đã có.
 */

public class Sach {
    //1.. thuộc tính chung -> LỚP CHA
    private String ma;
    private String ten;
    private int gia;
    private int namXuatBan;
    
    //2. constructor
    //ctrl + cách x2
    public Sach() {
    }

    public Sach(String ma, String ten, int gia, int namXuatBan) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.namXuatBan = namXuatBan;
    }
    
    //3. Getter & Setter 

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    
    //4. in thông tin

    @Override
    public String toString() {
        return "Sach{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", namXuatBan=" + namXuatBan + '}';
    }
    public void inThongTin(){
        System.out.println("Sach{" 
                + "ma=" + ma 
                + ", ten=" + ten 
                + ", gia=" + gia 
                + ", namXuatBan=" + namXuatBan + '}');
    }
    
}
