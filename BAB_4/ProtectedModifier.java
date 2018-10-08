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
class ProtectedModifier {
    protected void printInfo(){
        System.out.println("Protected Modifier");
    }
    
    protected void sendMessage(){
        System.out.println("this is a message");
    }
    
    public static void main(String[] args) {
        ProtectedModifier promo = new ProtectedModifier();
        
        promo.printInfo();
        promo.sendMessage();
    }
}
