/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        //khởi tạo đối tượng
        //1. constructor có tham số
        Giay g1= new Giay(1, "Adidas", 36, "den", 1);
        Giay g2= new Giay(2, "Adidas", 37, "trang", 1);
        Giay g3= new Giay(3, "Adidas", 38, "do", 2);
        
        g1.inThongTin();
        g2.inThongTin();
        g3.inThongTin();
        
        //2. constructor không tham số
        Giay g4= new Giay();
        g4.setId(1);
        g4.setHang("Converse");
        g4.setSize(40);
        g4.setMau("vang");
        g4.setLoai(2);
        g4.inThongTin();
        System.out.println(g4.getHang());
        
        //tạo ArrayList
        //import java.util.ArrayList;
        //arrayList không định kiểu
        ArrayList lst= new ArrayList();
        lst.add(g1);
        lst.add("poly");
        lst.add(true);
        lst.add(1000);
        //arrayList có định kiểu
        //List<Giay> lstGiay= new ArrayList<>();
        ArrayList<Giay> lstGiay= new ArrayList<>();
        lstGiay.add(g1);
        lstGiay.add(g2);
        lstGiay.add(g3);
        lstGiay.add(g4);
//        lstGiay.add("poly");
//        lstGiay.add(true);
//        lstGiay.add(1000);
        System.out.println("Duyet danh sach");
        System.out.println("Cach 1---------");
        //for tab
        for (int i = 0; i < lstGiay.size(); i++) {
            lstGiay.get(i).inThongTin();
        }
        System.out.println("Cach 2---------");
        //fore tab
        for (Giay giay : lstGiay) {
            giay.inThongTin();
        }
    }
}
