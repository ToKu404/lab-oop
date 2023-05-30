abstract class Dog implements Moveable {
     protected int position;
     protected int averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

     abstract void describe();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
}
class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Pitbull : ");
        System.out.println("Hewan penyayang");
    }

    @Override
    public void move() {
        position = position+3;
    }
}

class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position = position+2;
    }

    @Override
    void describe() {
        
    }
   
}

class BullDog extends Dog{

    public BullDog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position = position+1;
    }

    @Override
    void describe() {

        
    }
   
}



interface Moveable{
    void move();
}

class Smartphone implements Moveable{
    private int price;
    private String brand;
    public Smartphone(int price, String brand) {
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

}

class Car implements Moveable{
    private int totalForwardGear;
    private String color;
    private int maxSpeed;
    public Car(int totalForwardGear, String color, int maxSpeed) {
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
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
    
}

