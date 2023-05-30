class Bulldog extends Dog {
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }
    @Override
    public void move() {
        position +=1;
    }
    @Override
    void describe() {
        System.out.println("Memiliki mata yang bulat, berkaki pendek, hidung berwarna hitam, dll.");
    }
}