/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaithanhdat_59130291_baitapjava;

import Mypackages.NhanVien;
import Mypackages.QuanLyNhanVien;


/**
 *
 * @author Admin
 */
public class ThaiThanhDat_59130291_Baitapjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      NhanVien Dat = new NhanVien("Thái Thành Đạt",21,"Nha Trang",10000000,210);
      NhanVien Phap = new NhanVien("Phạm Văn Pháp",21,"Chicago",7000000,170);
      NhanVien Hoang = new NhanVien("Đỗ Minh Hoàng",21,"Nha Trang",5000000,90);
      NhanVien Long = new NhanVien("Nguyễn Hoàng Long",21,"Nha Trang",5000000,200);
      NhanVien Nhac = new NhanVien("Phạm Vương Lam Nhạc", 21, "Nha Trang", 4500000,150);
        System.err.println("--------Bài 1: Nhân Viên-------");
        System.out.println(Long.GetTT());
        System.out.println(Nhac.GetTT());
        
//        System.err.println("------------Bài 2: Hiện List------------");
//        QuanLyNhanVien list = new QuanLyNhanVien();
//        list.themNhanVien(Long);
//        list.themNhanVien(Nhac);
//        list.themNhanVien(Dat);
//        list.themNhanVien(Phap);
//        list.themNhanVien(Hoang);
//        list.inDS();
                 
    }
    
}
