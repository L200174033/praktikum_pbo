/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class Bank {
    double saldo;
    int no_rekening;
    String nama;
    
    void cek_saldo(){
        System.out.println(
                "----------------------------------------------\n"
                + "Saldo anda : Rp."+saldo+
                "\n----------------------------------------------\n" );
    }
    void menabung(int iJumlah){
        saldo += iJumlah;
        System.out.println(
                "----------------------------------------------\n"
                + "+++++++++++++++++++++++++++++++++++++++++++\n"
                + "+ Terima kasih sudah menabung di bank Wow +\n"
                + "+++++++++++++++++++++++++++++++++++++++++++\n"
                + "Jumlah yang ditabung : Rp."+iJumlah+"\n"
                + "Saldo anda sekarang : Rp."+saldo+
                "\n----------------------------------------------\n" );
    }
    void menarik(int iJumlah){
        saldo -= iJumlah;
        System.out.println(
                "----------------------------------------------\n"
                + "+++++++++++++++++++++++++++++++++++++++\n"
                + "+ Sukses menarik tabungan di bank Wow +\n"
                + "+++++++++++++++++++++++++++++++++++++++\n"
                + "Jumlah yang ditarik : Rp."+iJumlah+"\n"
                + "Saldo angka sekarang : Rp."+saldo+
                "\n----------------------------------------------\n" );
    }
    void transfer(int iJumlah){
        saldo -= iJumlah;
        System.out.println(
                "----------------------------------------------\n"
                + "+++++++++++++++++++\n"
                + "+ Sukses transfer +\n"
                + "+++++++++++++++++++\n"
                + "Jumlah yang ditransfer : Rp."+iJumlah+"\n"
                + "Saldo anda sekarang : Rp."+saldo+
                "\n----------------------------------------------\n" );
    }
}
