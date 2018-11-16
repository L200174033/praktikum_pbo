
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-RPL
 */
public class CustomerData {
    String nama, alamat, pekerjaan;
    Date tanggalLahir;
    int gaji;
    
    CustomerData(String namacus, String alamatcus, Date tanggalLahircus, String pekerjaancus, int gajicus){
        this.nama = namacus;
        this.alamat = alamatcus;
        this.tanggalLahir = tanggalLahircus;
        this.pekerjaan = pekerjaancus;
        this.gaji = gajicus;
        System.out.println(
        "Nama: "+this.nama+"\n"+
        "Alamat: "+this.alamat+"\n"+
        "Tanggal Lahir: "+this.tanggalLahir+"\n"+
        "Pekerjaan: "+this.pekerjaan+"\n"+
        "Gaji: "+this.gaji+"\n");
    }
    
    CustomerData(String pekerjaancus, int gajicus){
        this.pekerjaan = pekerjaancus;
        this.gaji = gajicus;
        System.out.println(
        "Nama: "+this.nama+"\n"+
        "Alamat: "+this.alamat+"\n"+
        "Tanggal Lahir: "+this.tanggalLahir+"\n"+
        "Pekerjaan: "+this.pekerjaan+"\n"+
        "Gaji: "+this.gaji+"\n");
    }
}
