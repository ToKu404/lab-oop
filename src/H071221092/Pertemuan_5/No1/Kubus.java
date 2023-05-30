public class Kubus extends BangunRuang{
    public Kubus (double sisi){
        super(sisi); //dia akan panggil nilai1
    }
    public double getVolume (){
        return nilai1*nilai1*nilai1;
    }
    public double getLuasPermukaan(){
        return 6*nilai1*nilai1;
    }
}
