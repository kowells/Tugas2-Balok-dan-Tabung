/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;
import bangundatar.Lingkaran;

/**
 *
 * @author ridwa
 */
public class Tabung extends Lingkaran implements BangunRuang{
    private double tinggi, volumeIsi, luasPermukaanIsi;

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    

    @Override
    public void volume() {
       this.volumeIsi = (super.getLuasIsi()*this.tinggi);
    }

    @Override
    public void luasPermuukaan() {
        this.luasPermukaanIsi = (super.getKelilingIsi()*(super.getJari()+this.tinggi));
    }

    public double getVolumeIsi() {
        return volumeIsi;
    }

    public double getLuasPermukaanIsi() {
        return luasPermukaanIsi;
    }
    
    
}
