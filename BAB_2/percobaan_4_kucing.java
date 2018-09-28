/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class Kucingku {
    int umur;
    String warna_bulu;
    
    void meong(String iWarna){
        warna_bulu = iWarna;
    }
    void umur(int iUmur){
        umur = iUmur;
    }
    void infoKucing(){
        System.out.println("Warna bulu : "+warna_bulu+"\nUmur : "+umur+" bulan");
    }
}
