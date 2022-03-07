/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ridwa
 */
public class PersegiPanjang implements BangunDatar{
    private double panjang, lebar, luasIsi, kelilingIsi;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void luas() {
       this.luasIsi = this.panjang*this.lebar;
    }

    @Override
    public void keliling() {
        this.kelilingIsi = 2*(this.panjang+this.lebar);
    }
    
        public double getLuasIsi() {
        return luasIsi;
    }

    public double getKelilingIsi() {
        return kelilingIsi;
    }
    
}
