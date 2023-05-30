public class Lingkaran extends BangunDatar{
    public Lingkaran (double jarijari){
        super(jarijari);
    }
    public double getLuas (){
        return Math.PI*nilai1*nilai1;
    }
    public double getKeliling (){
        return 2*Math.PI*nilai1;
    }
}
