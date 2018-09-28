/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
import java.util.Scanner; 
public class Kalimat {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Tuliskan sebuah kalimat");
        String Kalimat = reader.nextLine();
        System.out.println("Jumlah karakter = "+Kalimat.length());
    }
}
