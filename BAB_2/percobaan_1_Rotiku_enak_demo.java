/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class RotiEnak {
    public static void main(String[] args){
        Rotiku rotienak1 = new Rotiku();
        Rotiku rotienak2 = new Rotiku();
        Rotiku rotienak3 = new Rotiku();
        
        rotienak1.beriWarna("Merah");
        rotienak1.beriRasa("Pisang Strawberry");
        rotienak1.timbangBerat(50);
        rotienak1.hargaJual(3000);
        rotienak1.infoRoti();
        
        rotienak2.beriWarna("Kuning");
        rotienak2.beriRasa("Pisang Keju");
        rotienak2.timbangBerat(50);
        rotienak2.hargaJual(4000);
        rotienak2.infoRoti();

        rotienak3.beriWarna("Coklat");
        rotienak3.beriRasa("Pisang Coklat");
        rotienak3.timbangBerat(50);
        rotienak3.hargaJual(3000);
        rotienak3.infoRoti();        
    }
}
