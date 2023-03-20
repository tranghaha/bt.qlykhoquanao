/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.quanlykho;

import java.util.Scanner;

public class Mathang {

    public int MaSanPham;
    public int soluong;
    public String color, size, loai;

    public Mathang() {
    }

    public Mathang(int MaSanPham, int soluong, String color, String size, String loai) {
        this.MaSanPham = MaSanPham;
        this.soluong = soluong;
        this.color = color;
        this.size = size;
        this.loai = loai;
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "Mathang{" + "MaSanPham=" + MaSanPham + ", soluong=" + soluong + ", color=" + color + ", size=" + size + ", loai=" + loai + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sản phẩm: ");
        MaSanPham = sc.nextInt();
        System.out.print("Số lượng: ");
        soluong = sc.nextInt();
        System.out.print("Màu sắc: ");
        color = sc.nextLine();
        System.out.print("Size: ");
        size = sc.nextLine();
        System.out.print("Loại: ");
        loai = sc.nextLine();
    }

    public void hien() {
        System.out.print("{MaSanPham: " + getMaSanPham() + ", soluong: " + getsoluong() + ", color: " + getcolor() + ", size: " + getsize() + ", loai: " + getloai() + "}");
    }

    private String getsoluong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getcolor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getsize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getloai() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
