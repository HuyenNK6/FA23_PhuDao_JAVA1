/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author Khanh Huyen
 */
public class TruyenTranh extends Sach{
    private String nhanVat;

    public TruyenTranh() {
    }

    public TruyenTranh(String nhanVat) {
        this.nhanVat = nhanVat;
    }

    public TruyenTranh(String nhanVat, String ma, String ten, int gia, int namXuatBan) {
        super(ma, ten, gia, namXuatBan);
        this.nhanVat = nhanVat;
    }

    public String getNhanVat() {
        return nhanVat;
    }

    public void setNhanVat(String nhanVat) {
        this.nhanVat = nhanVat;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhan vat= "+ nhanVat);
    }
    
    
}
