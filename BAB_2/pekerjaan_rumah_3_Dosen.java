/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
import java.util.Date;
public class Dosen {
    Date date = new Date();
    String nama;
    int nik;
    String pendidikan;
    date tglLahir;
    
    String tampilkanNama(){
       return nama;
    }
    date tampilkanTglLahir(){
        return tglLahir;
    }
    int tampilkanNik(){
        return nik;
    }
}
