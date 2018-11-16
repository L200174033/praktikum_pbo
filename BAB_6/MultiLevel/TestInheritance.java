/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiLevel;

/**
 *
 * @author LAB-RPL
 */
public class TestInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.messageA();
        b.messageA();
        b.messageB();
        c.messageA();
        c.messageB();
        c.messageC();
    }
    
}
