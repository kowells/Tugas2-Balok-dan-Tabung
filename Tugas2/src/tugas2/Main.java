/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import bangunruang.Balok;
import bangunruang.Tabung;
import java.util.Scanner;

/**
 *
 * @author ridwa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu, ulangi;
        double panjang, lebar, tinggiBalok, tinggiTabung, jari;
        Scanner input = new Scanner (System.in);
        
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            menu = input.nextInt();

            switch(menu){
                case 1 :
                    System.out.print("Input Panjang: "); panjang = input.nextDouble();
                    System.out.print("Input Lebar: "); lebar = input.nextDouble();
                    System.out.print("Input Tinggi: "); tinggiBalok = input.nextDouble();
                    Balok balok = new Balok(tinggiBalok,panjang,lebar);
                    balok.luas();balok.keliling(); balok.volume(); balok.luasPermuukaan();
                    System.out.println("Luas Persegi Panjang= "+ balok.getLuasIsi());
                    System.out.println("Keliling Persegi Panjang= "+balok.getKelilingIsi());
                    System.out.println("Volume Balok= "+balok.getVolumeIsi());
                    System.out.println("Luas Permukaan Balok= "+balok.getLuasPermukaanIsi());
                    
                    break;

                case 2 :
                    System.out.print("Input Tinggi: "); tinggiTabung = input.nextDouble();
                    System.out.print("Input Jari - jari: "); jari = input.nextDouble();
                    Tabung tabung = new Tabung(tinggiTabung, jari);
                    tabung.luas(); tabung.keliling();tabung.volume(); tabung.luasPermuukaan();
                    System.out.println("Luas Lingkaran= "+tabung.getLuasIsi());
                    System.out.println("Keliling Lingkaran= "+tabung.getKelilingIsi());
                    System.out.println("Volume Tabung= "+tabung.getVolumeIsi());
                    System.out.println("Luas Permukaan Tabung= "+tabung.getLuasPermukaanIsi());
                    
                    break;

                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                    break;
            } System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
               ulangi = input.nextInt();
        
        
        } while (ulangi ==1 );
        
    }
    
}
