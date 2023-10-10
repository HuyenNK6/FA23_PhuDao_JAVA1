/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class NhapXuat {
    //main tab
    public static void main(String[] args) {
         /* nhập và xuất thông tin về Trà sữa NYC thích:
        - hãng TS: string
        - vị: string
        - topping: string
        - giá: int
        - số lượng: int
        - size: char (S, M, L)
         */
         //Lớp Scanner: lớp hỗ trợ việc nhập xuất dữ liệu từ bàn phím
         //khởi tạo đối tượng sc từ lớp Scanner
         //ctrl + cách
         Scanner sc= new Scanner(System.in);
         //sout tab
         System.out.println("-----------NHAP-----------");
         System.out.println("Nhap hang TS: ");
         String hang= sc.nextLine();
         System.out.println("Nhap vi TS: ");
         String vi= sc.nextLine();
         System.out.println("Nhap topping TS: ");
         String top= sc.nextLine();
         System.out.println("Nhap gia TS: ");
         int gia= Integer.parseInt(sc.nextLine());
         System.out.println("Nhap so luong TS: ");
         int soLuong= Integer.parseInt(sc.nextLine());
         System.out.println("Nhap size TS: ");
         char size= sc.nextLine().charAt(0);
//         System.out.println("Nhap dia chi mua:");
//         String diaChi= sc.nextLine();
        
         //ctrl+ shift+ mũi tên lên/xuống
         System.out.println("-----------XUAT-----------");
         System.out.println("Hang: "+ hang);
         System.out.println("Vi: "+ vi);
         System.out.println("Topping: "+ top);
         System.out.println("Gia: "+ gia);
         System.out.println("So luong: "+ soLuong);
         System.out.println("Size: "+ size);
         
         
    }
}
