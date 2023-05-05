abstract class Dog implements MoveAble{
    protected int position;
    protected int averageLength;

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
    void describe() {
        System.out.println("Pitbull memiliki tubuh yang berotot");
    }

    @Override
    public void move() {
        setPosition(getPosition()+3);
        System.out.println("Pitbull bergerak ke kanan sebanyak " + getPosition() + " kali");
    }
}

class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Siberian Husky berasal dari Siberia");
    }

    @Override
    public void move() {
        setPosition(getPosition()+2);
        System.out.println("Siberian Husky bergerak ke kanan sebanyak "+ getPosition());
    }
}

class Bulldog extends Dog{

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Bulldog memiliki tubuh yang pendek");
    }

    @Override
    public void move() {
        setPosition(getPosition()+1);
        System.out.println("Bulldog bergerak ke kanan sebanyak "+ getPosition());    
    }
}

class GermanShepherd extends Dog{

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("German Shepherd berasal dari Jerman");
    }

    @Override
    public void move() {
        setPosition(getPosition()+3);
        System.out.println("German Shepherd bergerak ke kanan sebanyak "+ getPosition());
    }
}