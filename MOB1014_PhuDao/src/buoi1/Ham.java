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
public class Ham {
    //Bài 2: Nhập 2 số dương a,b tính tổng, hiệu tích thương 
    //và in các kết quả ra màn hình
    //toàn cục
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        tinhTong();
        System.out.println("----------------");
        System.out.print("Nhap a= ");
        int a= Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b= ");
        int b= Integer.parseInt(sc.nextLine());
        tinhHieu(a, b);
        System.out.println("------------");
        int tich= tinhTich();
        System.out.print("Tich= "+ tich);
        System.out.println("----------------");
        System.out.print("Nhap c= ");
        int c= Integer.parseInt(sc.nextLine());
        System.out.print("Nhap d= ");
        int d= Integer.parseInt(sc.nextLine());
        double thuong= tinhThuong(c, d);
        System.out.print("Thuong= "+ thuong);
        System.out.println("");
    }
    //1. Hàm ko trả về, ko có tham số
    public static void tinhTong(){
        System.out.print("Nhap a= ");
        int a= Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b= ");
        int b= Integer.parseInt(sc.nextLine());
        int tong = a+b;
        System.out.print("Tong= "+ tong);
        System.out.println("");
    }
    //2. Hàm ko trả về,  có tham số
     public static void tinhHieu(int a, int b){
         //ctrl + R: rename
        int hieu = a-b;
        System.out.print("Hieu= "+ hieu);
        System.out.println("");
    }
    //3. Hàm trả về, ko có tham số
    public static int tinhTich(){
        System.out.print("Nhap a= ");
        int a= Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b= ");
        int b= Integer.parseInt(sc.nextLine());
        int tich = a*b;
        return tich;
    }
    //4. Hàm trả về, có tham số
    public static double tinhThuong(int x, int y){
        double thuong = (double)x/y;
        return thuong;
    }
}
