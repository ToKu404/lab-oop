public class Trapesium extends BangunRuang{
    public Trapesium (double sisi, double tinggi){
        super(sisi, tinggi);
    }
    public double getLuas (){
        return 0.5*(nilai1+nilai1)*nilai2;
    }
    public double getKeliling (){
        return nilai1+nilai1+nilai1+nilai1;
    }
}
