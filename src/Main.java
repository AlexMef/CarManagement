import Cars.*;

public class Main {
    public static void main(String[] args){
        LightCar lightCar1 = new LightCar("black");
        HeavyCar heavyCar1 = new HeavyCar("orange");

        lightCar1.getFuel();
        heavyCar1.getFuel();

        lightCar1.drive(20);
        heavyCar1.drive(20);

        lightCar1.getFuel();
        heavyCar1.getFuel();

        lightCar1.getDistance();
        heavyCar1.getDistance();

        lightCar1.drive(120);
        heavyCar1.drive(120);

        lightCar1.getFuel();
        heavyCar1.getFuel();

        lightCar1.getDistance();
        heavyCar1.getDistance();

        lightCar1.getColor();
        heavyCar1.getColor();




    }
}
