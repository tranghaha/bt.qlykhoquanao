/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.quanlykho;
import java.util.Scanner
import java.util.ArrayList
/**
 *
 * @author USER
 */
public class Quan extends Mathang{
    public String kieu,kichco;
    private ArrayList<NhapXuat> nx;

    public Quan() {
        super();
    }

    public Quan(String kieu, String kichco, ArrayList<NhapXuat> nx, int MaSanPham, int soluong, String color, String size, String loai) {
        super(MaSanPham, soluong, color, size, loai)
        this.kieu = kieu;
        this.kichco = kichco;
        this.nx = nx;
    }
    
}
