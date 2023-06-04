interface Dog{
    void move();
    void describe();
}

abstract class Alat {
    abstract void move();
}

class Pitbul implements Dog{
    private int position = 0;
    private int averageLength;

    @Override
    public void describe(){
        System.out.println("Ciri-ciri : Anjing Pitbul memiliki tubuh yang berotot dan gagah");
    }
    @Override
    public void move() {
        position += 3;
        System.out.println("Pitbul berada di posisi " + position);
    }
}

class Siberian_Husky implements Dog{
    private int position = 0;
    private int averageLength;

    @Override
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berada di posisi " + position);
    }

    @Override
    public void describe() {
        System.out.println("Ciri-ciri : Anjing Siberian Husky adalah anjing yang sangat energik dan ramah");
    }    
}

class Bulldog implements Dog {
    private int position = 0;
    private int averageLength;
    @Override
    public void describe(){
        System.out.println("Ciri-ciri : Anjing Bulldog memiliki ekstra kulit yang jatuh berlipat");
    }
    @Override
    public void move(){
        position += 1;
        System.out.println("Bulldog berada di posisi " + position);
    }
}

class German_Shepherd implements Dog{
    private int position = 0;
    private int averageLength;
    @Override
    public void describe(){
        System.out.println("Anjing German Shepherd memiliki struktur tulang yang solid");
    }

    @Override
    public void move(){
        position += 3;
        System.out.println("German Shepherd berada di posisi " + position);
    }
}

class Smartphone extends Alat{
    private int price;
    private String brand;
    public Smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
    public void showDetail(){
        System.out.println("Brand : " + getBrand());
        System.out.println("Price : " + getPrice());
    }
}

class Car extends Alat{
    private int totalForwardGear;
    private String color;
    private int maxSpeed;
    public Car (int totalForwardGear, String color, int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public int getTotalForwardGear() {
        return totalForwardGear;
    }
    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }

    public void showDetail(){
        System.out.println("Color              : " + getColor());
        System.out.println("Total Forward Gear : " + getTotalForwardGear());
        System.out.println("Max Speed          : " + getMaxSpeed() + "km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(500, "Nokia");
        Pitbul pitbul = new Pitbul();
        Car car = new Car(5, "Black", 200);
        System.out.println("========== DOG ==========");
        pitbul.describe();
        pitbul.move();
        System.out.println("\n========== ALAT ==========");
        car.move();
        car.showDetail();
        System.out.println("\n========== ALAT ==========");
        smartphone.showDetail();
        smartphone.move();
    }
}