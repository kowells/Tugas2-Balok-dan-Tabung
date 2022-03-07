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
public class Lingkaran implements BangunDatar{
    private double jari,luasIsi, kelilingIsi;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
        public Lingkaran() {
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    

    @Override
    public void luas() {
        this.luasIsi = (PHI * Math.pow(this.jari, 2));
    }

    @Override
    public void keliling() {
        this.kelilingIsi = (2 * PHI * this.jari);
    }

    public double getKelilingIsi() {
        return kelilingIsi;
    }

    public double getLuasIsi() {
        return luasIsi;
    }
    
    
}
