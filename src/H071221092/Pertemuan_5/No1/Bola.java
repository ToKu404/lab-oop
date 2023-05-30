public class Bola extends BangunRuang{
    public Bola (double jarijari){
        super(jarijari); //dia akan panggil nila1
    }
    public double getVolume (){
        return 1.3*Math.PI*nilai1*nilai1*nilai1;
    }
    public double getLuasPermukaan(){
        return 4*Math.PI*nilai1*nilai1;
    }
}