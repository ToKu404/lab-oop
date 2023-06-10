
abstract class Dog {
    int position;
    int averageLenght;
    abstract void move();
    abstract void describe();
}

class Pitbull extends Dog {

    @Override
    void move() {
        position=3;
        System.out.println("Pitbull bergerak " + position + "langkah");
    }

    @Override
    void describe() {
        System.out.println("Pitbull biasanya memiliki otot yang kekar");
    }

}

class siberianHusky extends Dog {

    @Override
    void move() {
        position=2;
        System.out.println("Siberian Husky bergerak " + position + " langkah");
    }

    @Override
    void describe() {
        System.out.println("Siberian Husky biasanya terlihat seperti serigala");
    }

}

class Bulldog extends Dog {

    @Override
    void move() {
        position=1;
        System.out.println("Bulldog bergerak " + position + "langkah");
    }

    @Override
    void describe() {
        System.out.println("Bulldog memiliki tubuh yang kecil atau pendek");
    }

}

class germanShepherd extends Dog {

    @Override
    void move() {
        position=3;
        System.out.println("German Shepherd bergerak " + position + "langkah");
    }

    @Override
    void describe() {
        System.out.println("German Shepherd memiliki berat antara 34-43kg");
    }

}

interface SC {
    void move();
}

class Smartphone implements SC {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements SC {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
