/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-RPL
 */
public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;
    
    Buku(String pengarang, String judul, int terbit, int cetakan, double harga){
        this.namaPengarang = pengarang;
        this.judulBuku = judul;
        this.tahunTerbit = terbit;
        this.cetakanKe = cetakan;
        this.hargaJual = harga;
    }
    
    public void infoBuku(){
        System.out.println(
                "Pengarang: "+this.namaPengarang+"\n"+
                "Judul: "+this.judulBuku+"\n"+
                "Tahun terbit: "+this.tahunTerbit+"\n"+
                "Cetakan ke: "+this.cetakanKe+"\n"+
                "Harga jual: "+this.hargaJual+"\n");
    }
}
