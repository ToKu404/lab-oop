public class Tabung extends BangunRuang{
    public Tabung (double tinggi, double jarijari) {
        super(tinggi, jarijari); //dia akan panggil nilai4
    }
    public double getVolume (){
        return Math.PI*nilai2*nilai2*nilai1;
    }
    public double getLuasPermukaan(){
        return (2*Math.PI*nilai2)*(nilai2*nilai1);
    }
}