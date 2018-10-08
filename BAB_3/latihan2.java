
 public class VariabelLokal {
    int umur;
    public void usia(){
        umur = 0;
        int tahunSekarang = 2015;
        int tahunLahir = 1995;
        umur = tahunSekarang - tahunLahir;
        System.out.println("Usia saya : "+umur );
    }
    public void beratBadan(){
        int beratLahir = 5;
        float beratBadan;
        beratBadan = beratLahir + (umur/2);
        System.out.println("Berat badan : "+beratBadan );
    }
    public static void main(String[] args){
        VariabelLokal me = new VariabelLokal();
        me.usia();
        me.beratBadan();
    }
}
