/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class HewanDemo {
    public static void main(String[] args){
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();
        
        hewan1.inputNama("Harimau");
        hewan1.inputKaki(4);
        hewan1.inputMakanan("Daging");
        hewan1.inputType("Karnivora");
        hewan1.infoHewan();
        System.out.println("");
        hewan2.inputNama("Kerbau");
        hewan2.inputKaki(4);
        hewan2.inputMakanan("Rumput");
        hewan2.inputType("Karnivora");
        hewan2.infoHewan();
    }
}
