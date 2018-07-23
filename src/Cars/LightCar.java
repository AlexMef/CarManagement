package Cars;

public class LightCar implements Car {
    private String color;
    private int fuel;
    private double distance;

    public LightCar(){
        this.color = "default";
        this.fuel = 40;
    }

    public LightCar(String color) {
        this.color = color;
        this.fuel = 40;
    }

    @Override
    public void getFuel() {
        System.out.println("Осталось " + this.fuel + " литров");
    }

    @Override
    public void addFuel(int litres) {
        this.fuel += litres;
        System.out.println("Машина заправлена на " + litres + " литров");
    }

    @Override
    public void drive(int distance) {
        if (this.fuel == 0){
            System.out.println("Топливо закончилось");
        }
        else {
            if ((this.fuel - (distance / 3)) < 0){
                System.out.println("Данное расстояние невозможно проехать");
            }
            else {
                this.fuel -= distance / 3;
                this.distance += distance;
                System.out.println("Лёгкая машина проехала " + distance + " км");
            }
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColor() {
        System.out.println("Цвет машины " + this.color);
    }

    public void getDistance() {
        System.out.println("Машина проехала " + this.distance);
    }
}
