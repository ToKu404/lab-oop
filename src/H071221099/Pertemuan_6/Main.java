public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(10000000, "ROG");
        smartphone.move();

        Car car = new Car(10, "Black", 1000);
        car.move();

        Bulldog bulldog = new Bulldog(1, 50);
        bulldog.describe();
        bulldog.move();
    }
}
