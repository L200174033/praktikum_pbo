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
public class PersegiPanjang extends BangunDatar{
    protected int panjang;
    protected double lebar;

    @Override
    protected void hitungLuas() {
        super.luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: "+luas);
    }

    @Override
    protected double hitungKeliling() {
        super.keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang: "+ keliling);
        return keliling;
    }
    
    public static void main(String[] args) {
        PersegiPanjang pj = new PersegiPanjang();
        
        pj.panjang = 3;
        pj.lebar = 5;
        
        pj.hitungLuas();
        pj.hitungKeliling();
    }
}
