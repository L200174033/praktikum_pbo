/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-RPL
 */
public class TugasRumah {
    int nilaiMID, nilaiTugas, nilaiUAS;
    double mid, tugas, uas;
    
    public double setMID(int nilaiMID){
        this.nilaiMID = nilaiMID;
        mid = this.nilaiMID * 1.0;
        return mid;
    }
    
    public double setTugas(int nilaiTugas){
        this.nilaiTugas = nilaiTugas;
        tugas = this.nilaiTugas * 1.0;
        return tugas;
    }
    
    public double setUAS(int nilaiUAS){
        this.nilaiUAS = nilaiUAS;
        uas = this.nilaiUAS * 1.0;
        return uas;
    }
    
    void setTotal(){
        System.out.println(
          "Nilai MID: "+this.nilaiUAS+"\n"+
          "Nilai Tugas: "+this.nilaiTugas+"\n"+
          "Nilai UAS: "+this.nilaiUAS+"\n"+
          "Total: "+((mid+tugas+uas)/3)
        );
    }
    
    public static void main(String[] args) {
        TugasRumah nilai = new TugasRumah();
        
        nilai.setMID(90);
        nilai.setTugas(90);
        nilai.setUAS(80);
        nilai.setTotal();
    }
}