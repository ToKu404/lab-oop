abstract class Dog implements Moveable {
    protected int position;
    protected int averageLength;

    abstract void describe();// disimpan di abstract karena sebagai implementasi untuk child class
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
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

