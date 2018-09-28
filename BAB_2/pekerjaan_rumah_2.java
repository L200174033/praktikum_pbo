/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class Hewan {
    String nama;
    int kaki;
    String makanan;
    String type;
    
    void inputNama(String iNama){
        nama = iNama;
    }
    void inputKaki(int iKaki){
        kaki = iKaki;
    }
    void inputMakanan(String iMakan){
        makanan = iMakan;
    }
    void inputType(String iType){
        type = iType;
    }
    void infoHewan(){
        System.out.println(
            "Nama Hewan : "+nama+
            "\nJumlah Kaki : "+kaki+
            "\nMakanan : "+makanan+
            "\nType Hewan : "+type );
    }
}
