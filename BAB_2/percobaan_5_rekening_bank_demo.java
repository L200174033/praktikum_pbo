/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
 public class BankDemo {
    public static void main(String[] args){
        Bank Rekening = new Bank();
        
        Rekening.menabung(400000);
        Rekening.menarik(100000);
        Rekening.transfer(50000);
        Rekening.cek_saldo();
    }
}
