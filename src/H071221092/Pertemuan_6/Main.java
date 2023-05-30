public class Main {
    public static void main(String[] args) {
        System.out.println("========== BULLDOG ==========");
        Bulldog bulldog = new Bulldog(12, 5);
        bulldog.move();
        bulldog.describe();
        System.out.println("========== SMARTPHONE ==========");
        Smartphone hp = new Smartphone(9900, "Iphone");
        System.out.println("Price: " + hp.getPrice());
        System.out.println("Brand: " + hp.getBrand());
        hp.move();
        System.out.println("========== CAR ==========");
        Car car = new Car (12, "red", 10);
        System.out.println("Total Forward Gear: " + car.getTotalForwardGear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Max Speed: " + car.getMaxSpeed());
        car.move();
    }
}
