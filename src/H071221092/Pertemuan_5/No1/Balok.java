public class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;
    public Balok (double panjang, double lebar, double tinggi){
        super(panjang, lebar, tinggi); //dia akan panggil nila3
    }
    public double getVolume (){
        return panjang*lebar*tinggi;
    }
    public double getLuasPermukaan(){
        return 2+panjang*lebar+lebar*tinggi*panjang*tinggi;
    }
}