/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(2, 50);
        pitbull.describe();
        System.out.println("Current Pitbull position: "+ pitbull.getPosition());
        pitbull.move();
        System.out.println("Current pitbull position: " + pitbull.getPosition());

        Smartphone smartphone = new Smartphone(10000, "Iphone");
        smartphone.move();

        Car car = new Car(10, "pink", 180);
        car.move();
        
    }
}