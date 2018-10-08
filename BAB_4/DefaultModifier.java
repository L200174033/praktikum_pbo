
package modul.praktikum.pbo;


class DefaultModifier {
    int a=1, b=2, c;
    
    void jumlah(){
        c = a+b;
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        DefaultModifier jumlah1 = new DefaultModifier();
        
        jumlah1.jumlah();
    }
}
