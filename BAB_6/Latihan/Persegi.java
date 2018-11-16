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
public class Persegi extends BangunDatar{
    protected double sisi;

    @Override
    protected void hitungLuas() {
        super.luas = sisi * sisi;;
        System.out.println("Luas Persegi: "+ luas);
    }

    @Override
    protected double hitungKeliling() {
        super.keliling = (4 * sisi);
        System.out.println("Keliling Persegi: "+ keliling); 
        return keliling;
    }
    
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        
        persegi.sisi = 3;
        persegi.hitungLuas();
        persegi.hitungKeliling();
    }
}
