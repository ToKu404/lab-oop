package H071221039.Pertemuan_6;
interface Moveable{
    void move();
    // void describe();
}

abstract class Dog {
    protected int position;
    protected int averageLength;
   
    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }
    public abstract void describe();
}

class Pitbull extends Dog implements Moveable{
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move(){
        position+=3;
    }

    @Override
    public void describe(){
        System.out.println("Ras\t\t: Pitbull");
        System.out.println("Rata panjang\t: " + this.averageLength);
        System.out.println("Sifat\t\t: Agresif");
        System.out.println("Asal\t\t: Amerika Serikat");
        System.out.println("Posisi\t\t: " + this.position);
    }   
}

class SiberianHusky extends Dog implements Moveable{
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move(){
        position+=2;
    }

    @Override
    public void describe(){
        System.out.println("Ras\t\t: Siberian Husky");
        System.out.println("Rata panjang\t: " + this.averageLength);
        System.out.println("Sifat\t\t: Ramah");
        System.out.println("Asal\t\t: Siberia");
        System.out.println("Posisi\t\t: " + this.position);
    }   
}

class Bulldog extends Dog implements Moveable{
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void describe(){
        System.out.println("Ras\t\t: Bulldog");
        System.out.println("Rata panjang\t: " + this.averageLength);
        System.out.println("Sifat\t\t: Bersahabat");
        System.out.println("Asal\t\t: Inggris");
        System.out.println("Posisi\t\t: " + this.position);
    }

    @Override
    public void move() {
        position+=1;
    }   
}

class GermanShepherd extends Dog implements Moveable{
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move(){
        position+=3;
    }

    @Override
    public void describe(){
        System.out.println("Ras\t\t: German Shepherd");
        System.out.println("Rata panjang\t: " + this.averageLength);
        System.out.println("Sifat\t\t: Pandai");
        System.out.println("Asal\t\t: Jerman");
        System.out.println("Posisi\t\t: " + this.position);
    }   
}
