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
public class SegiTigaSamaSisi extends SegiTiga{
    protected double sisi;

    @Override
    protected void hitungLuas() {
        super.luas = (sisi * (Math.sqrt(Math.pow(sisi, 2) - Math.pow((sisi/2), 2))))/2;
        System.out.println("Luas Segitiga Sama Sisi: "+luas);
    }

    @Override
    protected double hitungKeliling() {
        super.keliling = sisi * 3;
        System.out.println("Keliling Segitiga Sama Sisi: "+keliling);
        return keliling;
    }
    
    public static void main(String[] args) {
        SegiTigaSamaSisi stsm = new SegiTigaSamaSisi();
        
        stsm.sisi = 6;
        
        stsm.hitungLuas();
        stsm.hitungKeliling();
    }
}
