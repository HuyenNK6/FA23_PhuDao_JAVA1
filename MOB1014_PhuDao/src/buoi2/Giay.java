/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

/**
 *
 * @author Khanh Huyen
 */
public class Giay {

    //1. thuộc tính -> private tất cả thuộc tính
    private int id;
    private String hang;
    private int size;
    private String mau;
    private int loai; //1-giày nam, 2-giày nữ

    //2. constructor
    //ctrl+ cách + enter
    //2.1 constructor không tham số
    public Giay() {
    }

    //2.1 constructor có tham số
    public Giay(int id, String hang, int size, String mau, int loai) {
        this.id = id;
        this.hang = hang;
        this.size = size;
        this.mau = mau;
        this.loai = loai;
    }

    //3. getter & setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    //insert code-> toString()
    @Override
    public String toString() {
        return "Giay{" + "id=" + id + ", hang=" + hang + ", size=" + size + ", mau=" + mau + ", loai=" + loai + '}';
    }

    //4. phương thức in thông tin
    public void inThongTin() {
        //toString();
        System.out.println("Giay{"
                + "id=" + id
                + ", hang=" + hang
                + ", size=" + size
                + ", mau=" + mau
                + ", loai=" + (loai == 1 ? "giay nam" : "giay nu") + '}');
        System.out.println(getLoaiGiay());
        //if.. else...
    }

    //toán tử 3 ngôi
    //<biểu thức điều kiện> ? <kết quả đúng> : <kết quả sai>
    public String getLoaiGiay() {
        if (loai == 1) {
            return "giay nam";
        }
        ///.........
        return "giay nu";
    }
}
