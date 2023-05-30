class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }
    @Override
    public void move() {
        position +=2;
    }
    @Override
    void describe() {
        System.out.println("Memiliki bulu yang lumayan lebat dan berwarna belang hitam, putih, abu, aktif, ramah, dll");
    }
}