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
public class Foo {
    public static void main(String[] args) {
        System.out.println("DefaultModifier");
        DefaultModifier df = new DefaultModifier();
        System.out.println("DefaultModifier tidak bisa diakses lain package");
        System.out.println("\n");
        
        System.out.println("Public Modifier");
        PublicModifier pm = new PublicModifier();
        pm.kali();
        pm.tambah();
        pm.kurang();
        pm.bagi();
        pm.nilairata();
        System.out.println("\n");
        
        System.out.println("Protected Modifier");
        ProtectedModifier promo = new ProtectedModifier();
        
        promo.printInfo();
                
        System.out.println("Protected Modifier tidak bisa dipanggil beda package");
        System.out.println("\n");
        
        System.out.println("Private Modifier");
        PrivateModifier primo = new PrivateModifier();
//       primo.printInfo();
        System.out.println("Private Modifier tidak bisa dipanggil beda package");
    }
}
