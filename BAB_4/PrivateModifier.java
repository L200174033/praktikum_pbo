/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.praktikum.pbo;

/**
 *
 * @author LAB-RPL
 */
public class PrivateModifier {
    private String nama;
    private int umur;
    private void printInfo(){
        System.out.println("private modifier");
    }
    
    public static void main(String[] args) {
        PrivateModifier primo = new PrivateModifier();
        
        primo.printInfo();
    }
}
