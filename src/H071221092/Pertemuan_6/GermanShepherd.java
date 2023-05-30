public class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
 public void move() {
     position +=3;
 }
 @Override
 void describe() {
     System.out.println("Memiliki tubuh yang panjang, mata berbentuk almond, Telinga tegak, dll.");
 }
}