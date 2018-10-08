
 public class TugasRumah {
    int nilaiMID;
    int nilaiTugas;
    int nilaiUAS;
    
    int MID(int iMid){
        return nilaiMID = iMid;
    }
    int Tugas(int iTugas){
        return nilaiTugas = iTugas;
    }
    int UAS(int iUas){
        return nilaiUAS = iUas;
    }
    void info(){
        System.out.println("Nilai MID : "+nilaiMID+"\nNilai Tugas : "+nilaiTugas+"\nNilai UAS : "+nilaiUAS );
    }
    public static void main(String[] args){
        TugasRumah tugas = new TugasRumah();
        
        tugas.MID(90);
        tugas.Tugas(60);
        tugas.UAS(76);
        tugas.info();
    }
}
