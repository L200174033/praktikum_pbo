/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
public class BicycleDemo {
    public static void main(String[] args){
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        
        bike1.changeCadance(50);
        bike1.speedUp(20);
        bike1.changeGear(2);
        bike1.printInfo();
        
        bike1.changeCadance(50);
        bike1.speedUp(20);
        bike1.changeGear(2);
        bike1.changeCadance(40);
        bike1.speedUp(10);
        bike1.changeGear(1);
        bike1.printInfo();
    }
}
