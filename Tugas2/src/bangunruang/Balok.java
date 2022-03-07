/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;
import bangundatar.PersegiPanjang;

/**
 *
 * @author ridwa
 */
public class Balok extends PersegiPanjang implements BangunRuang{
    private double tinggi, volumeIsi,  luasPermukaanIsi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
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
       this.volumeIsi = this.tinggi*super.getLuasIsi();
    }

    @Override
    public void luasPermuukaan() {
        this.luasPermukaanIsi = 2*(super.getPanjang()*this.tinggi+super.getPanjang()*super.getLebar()+super.getLebar()*this.tinggi);
    }

  
    public double getVolumeIsi() {
        return volumeIsi;
    }

    public double getLuasPermukaanIsi() {
        return luasPermukaanIsi;
    }
    
    
}
