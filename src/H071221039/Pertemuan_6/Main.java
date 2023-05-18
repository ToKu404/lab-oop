package H071221039.Pertemuan_6;
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(40));
        System.out.println("INI DARI CLASS RAS");
        Pitbull pitbull = new Pitbull(0,50);
        pitbull.move();
        pitbull.move();
        pitbull.describe();

        System.out.println("=".repeat(40));
        System.out.println("INI DARI CLASS SMARTPHONE");
        Smartphone smartphone = new Smartphone(5_000_000, "Mito");
        smartphone.move();
        System.out.printf("Harga\t: Rp. %s%n",smartphone.price);
        System.out.println("Brand\t: " + smartphone.brand);

        System.out.println("=".repeat(40));
        System.out.println("INI DARI CLASS CAR");
        Car car = new Car(5, "Hijau Sage", 240);
        car.move();
        System.out.println("Gear toal\t: " + car.totalForwardGear);
        System.out.println("Warna\t\t: " + car.color);
        System.out.printf("Max Speed\t: %s km/jam", car.maxSpeed);
    }
}
