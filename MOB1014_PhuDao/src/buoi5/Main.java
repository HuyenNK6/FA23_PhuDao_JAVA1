/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        SachGiaoKhoa sgk = new SachGiaoKhoa(12, "SGK12", "Toan", 25000, 2022);
        sgk.inThongTin();
        
        TruyenTranh truyen = new TruyenTranh();
        truyen.setMa("Truyen01");
        truyen.setTen("Tam Cam");
        truyen.setGia(18000);
        truyen.setNamXuatBan(2020);
        truyen.setNhanVat("Tam");
        
        truyen.inThongTin();
        
        //
        Sach sgk2 = new SachGiaoKhoa(10, "SGK10", "Van", 32000, 2023);
        sgk2.inThongTin();
        Sach truyen2= new TruyenTranh("Me ghe", "Truyen02", "Tam Cam", 20000, 2023);
        truyen2.inThongTin();
        
        //Người -> GV, NV, SV
        //Động vật -> Mèo, Chó, Gà....
    }
}
