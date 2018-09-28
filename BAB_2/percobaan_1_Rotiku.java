/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class Rotiku {
    String warna;
    String rasa;
    int berat;
    double harga;
    
    void beriWarna(String warnaRoti){
        warna = warnaRoti;
    }
    void beriRasa(String rasaRoti){
        rasa = rasaRoti;
    }
    void timbangBerat(int beratRoti){
        berat = beratRoti;
    }
    void hargaJual(double hargaRoti){
        harga = hargaRoti;
    }
    void infoRoti(){
        System.out.println("Warna Roti : "+warna+"\nRasa Roti : "+rasa+"\nBerat Roti : "+berat+" gr\nHarga Roti : Rp."+harga );
    }
}
