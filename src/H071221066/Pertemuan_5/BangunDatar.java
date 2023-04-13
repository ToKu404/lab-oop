package H071221066.Pertemuan_5;
//NO1
public class BangunDatar {
    private double nilaiA;
    private double nilaiB;
    private double nilaiC;
    private double nilaiD;

    protected double keliling;
    protected double luas;

    public BangunDatar(double nilaiA) {
        this.nilaiA = nilaiA;
    }

    public BangunDatar(double nilaiA, double nilaiB) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
    }

    public BangunDatar(double nilaiA, double nilaiB, double nilaiC) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }
 
    public BangunDatar(double nilaiA, double nilaiB, double nilaiC, double nilaiD) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
        this.nilaiD = nilaiD;
    }

    public double getKeliling(){
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
}

class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        super(sisi);
        this.sisi = sisi;
    }
    public double keliling(){
        return 4 * sisi;
    }
    public double luas(){
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        super(panjang, lebar);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double keliling(){
        return 2 * (panjang + lebar );
    }
    public double luas(){
        return panjang * lebar ;
    }
}

class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(double jariJari){
        super(jariJari);
        this.jariJari = jariJari;
    }
    public double keliling(){
        return 2 * Math.PI * jariJari;
    }
    public double luas(){
        return Math.PI * jariJari * jariJari;
    }
}

class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi){
        super(alas, tinggi, sisi);
        this.alas = alas;
        this.tinggi = tinggi; 
    }
    public double keliling(){
        return sisi + tinggi + alas;
    }
    public double luas(){
        return alas * tinggi / 2;
    }
}

class Trapesium extends BangunDatar{
    private double tinggi;
    private double alas;
    private double sisimiring;
    private double atas;

    public Trapesium(double tinggi, double alas, double sisimiring, double atas) {
        super(tinggi, alas, sisimiring, atas);
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisimiring = sisimiring;
        this.atas = atas;
    }
    public double keliling(){
        return alas + sisimiring * 2 + atas;
    }

    public double luas(){
        return ((alas + atas) * tinggi)/2;
    }
}