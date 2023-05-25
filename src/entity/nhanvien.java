/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Haru
 */
public class nhanvien {
    String manv;
    String tennv;
    String gioitinh;
    String quequan;
    String sdt;
    float hesoluong;
    Date ngaysinh;
    float luong;

    public nhanvien(){
        
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public nhanvien(String manv, String tennv, Date ngaysinh, String gioitinh, String quequan, String sdt, float hesoluong, float luong) {
        this.manv = manv;
        this.tennv = tennv;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.sdt = sdt;
        this.hesoluong = hesoluong;
        this.ngaysinh = ngaysinh;
        this.luong=luong;
    }

    
}
