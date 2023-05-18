package H071221039.Pertemuan_6;
class Smartphone implements Moveable {
    protected int price;
    protected String brand;

    Smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone Berpindah");
    }
}
