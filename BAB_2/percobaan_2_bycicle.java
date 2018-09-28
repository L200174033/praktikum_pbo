/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class Bicycle {
    int cadance;
    int speed;
    int gear;
    
    void changeCadance(int iCadance){
        cadance = iCadance;
    }
    void speedUp(int iSpeed){
        speed = iSpeed;
    }
    void changeGear(int iGear){
        gear = iGear;
    }
    void printInfo(){
        System.out.println("Cadance : "+cadance+"\nSpeed : "+speed+"\nGear : "+gear );
    }
}
