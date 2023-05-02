package TugasPraktikum.Pertemuan6;

interface Move {
    void move();
}

abstract class Dog implements Move{
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();
}

class Pitbull extends Dog{
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
    }

    @Override
    void describe() {
        System.out.println("Pitbull memiliki rahang yang kuat dan mengunci.");
    }
}

class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
    }

    @Override
    void describe() {
        System.out.println("Bulunya tebal dan panjang serta memiliki warna yang cukup beragam.");
    }
}

class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 1;
    }

    @Override
    void describe() {
        System.out.println("memiliki bentuk mata bulat, hidung berwarna hitam dengan lubang hidung berukuran besar.");
    }
}

class GermanShepherd extends Dog{

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
    }

    @Override
    void describe() {
        System.out.println("Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.");
    }
}


class Smartphone implements Move {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

public class MainPert06 {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 58);
        System.out.println("Posisi Pitbull           : " + pitbull.position);
        pitbull.move();
        System.out.println("Posisi Setelah Bergeser  : " + pitbull.position);
        System.out.println("Panjang rata-rata        : " + pitbull.averageLength);
        pitbull.describe();

        Smartphone smartphone = new Smartphone(10000000, "Iphone 11");
        System.out.println("\nNama Barang : " + smartphone.brand);
        System.out.println("Harga       : " + smartphone.price);
        smartphone.move();

        Car car = new Car(5, "Putih", 325);
        System.out.println("\nWarna Mobil  : " + car.color);
        System.out.println("Top Speed    : " + car.maxSpeed);
        System.out.println("Forward Gear : " + car.totalForwardGear);
        car.move();
    }
}