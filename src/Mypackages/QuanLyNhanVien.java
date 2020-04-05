/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackages;

import java.util.ArrayList;



/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy
{
     ArrayList<NhanVien> ds = new ArrayList<>();
     
    public QuanLyNhanVien() {
      
    }
     
    @Override
    public void themNhanVien(NhanVien nv) 
    {
        ds.add(nv);
    }

    @Override
    public void inDS() {
    for (NhanVien i : ds) {
      System.out.println("Họ Tên: "+i.Ten);
      System.out.println("Tuổi: "+i.Tuoi);
      System.out.println("Địa Chỉ: "+i.DiaChi);
      System.out.println("Tiền Lương: "+i.TienLuong);
      System.out.println("Tổng Số Giờ Làm: "+i.TongGioLam);
      System.out.println("Tiền Thưởng: "+i.tinhThuong());
      System.out.println("---------------------------");
    }
    }
    
}
