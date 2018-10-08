
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    void data(String iNama, int iNip, double iGaji){
        nama = iNama; nip = iNip; gaji = iGaji;
    }
    void infoPegawai(){
        System.out.println("Nama : "+nama+"\nNIP : "+nip+"\nGaji : Rp."+gaji+"\n" );
    }
    public static void main(String[] args){
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        
        pegawai1.data("Ilham",1212,500000);
        pegawai1.infoPegawai();
        
        pegawai2.data("Dimas",4212,700000);
        pegawai2.infoPegawai();
        
        pegawai3.data("Budi",2212,200000);
        pegawai3.infoPegawai();
        
        pegawai4.data("Yohana",5212,900000);
        pegawai4.infoPegawai();
        
        pegawai5.data("Putri",7212,400000);
        pegawai5.infoPegawai();  
    }
}
