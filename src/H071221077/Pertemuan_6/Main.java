public class Main {
    public static void main(String[] args){
        Smartphone smartphone = new Smartphone(18000, "iPhone");
        smartphone.move();

        Car car = new Car(10, "Red", 1000);
        car.move();

        Pitbull pitbull = new Pitbull(0, 50);
        pitbull.move();
    }
}