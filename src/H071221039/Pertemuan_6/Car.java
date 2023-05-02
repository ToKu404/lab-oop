package H071221039.Pertemuan_6;
class Car implements Moveable{
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    Car(int totalForwardGear, String color,int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move(){
        System.out.println("Mobil Berakselerasi");
    }
}
