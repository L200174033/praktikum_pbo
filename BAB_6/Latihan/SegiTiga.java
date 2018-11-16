/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author LAB-RPL
 */
public class SegiTiga extends BangunDatar{
    protected double alas, tinggi;

    @Override
    protected void hitungLuas() {
        super.luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga: "+ luas);
    }

    @Override
    protected double hitungKeliling() {
        super.keliling = alas + tinggi + (Math.sqrt(Math.pow(alas, 2)+ Math.pow(tinggi, 2)));
        System.out.println("Keliling Segitiga: "+keliling);
        return keliling;
    }
    
    public static void main(String[] args) {
        SegiTiga segitiga = new SegiTiga();
        
        segitiga.alas = 3;
        segitiga.tinggi = 4;
        
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
    }
    
}
