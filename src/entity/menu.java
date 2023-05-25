/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Frinkin
 */
public class menu {

    String tenh;
    int dongia;

    public menu() {
    }
    public String getTenh() {
        return tenh;
    }

    public void setTenh(String tenh) {
        this.tenh = tenh;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    public menu(String tenh,int dongia){
        this.tenh = tenh;
        this.dongia = dongia;
    }
}
