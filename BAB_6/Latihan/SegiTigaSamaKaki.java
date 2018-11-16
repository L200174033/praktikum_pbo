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
public class SegiTigaSamaKaki extends SegiTiga{
    protected double sisiMiring;

    @Override
    protected void hitungLuas() {
        super.luas = (super.alas * (Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow((super.alas/2), 2))))/2;
        System.out.println("Luas Segitiga Sama Kaki: "+luas);
    }

    @Override
    protected double hitungKeliling() {
        super.keliling = super.alas + (sisiMiring * 2);
        System.out.println("Keliling Segitiga Sama Kaki: "+keliling);
        return keliling;
    }
    
    public static void main(String[] args) {
        SegiTigaSamaKaki stsm = new SegiTigaSamaKaki();
        
        stsm.sisiMiring = 5;
        stsm.alas = 6;
        
        stsm.hitungLuas();
        stsm.hitungKeliling();
    }
}
