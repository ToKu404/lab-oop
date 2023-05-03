package H071221028.Pertemuan_5.No1;

public class BangunDatar {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;
    protected double nilaiD;

    // protected double keliling;
    // protected double luas;

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
    
    public double keliling(){
        return 0;
    }

    public double luas(){
        return 0;
    }

}

class Persegi extends BangunDatar {

    public Persegi(double sisi){
        super(sisi);
        
    }
    public double keliling(){
        return 4*nilaiA;
    }
    public double luas(){
        return nilaiA*nilaiB;
    }
}

class PersegiPanjang extends BangunDatar{
   

    public PersegiPanjang(double panjang, double lebar){
        super(panjang, lebar);
       
    }
    public double keliling(){
        return 2 * (nilaiA * nilaiB);
    }

    public double luas(){
        return nilaiA * nilaiB;
    }




}

class Segitiga extends BangunDatar{
    

    public Segitiga( double alas, double tinggi, double sisi){
        super(alas, tinggi, sisi);
        
    }
    public double keliling(){
        return nilaiA + nilaiB + nilaiC;
    }
    public double luas(){
        return  (nilaiA*nilaiB)/2;
        
    }

    
    
}

class Trapesium extends BangunDatar{
 
    public Trapesium (double tinggi, double alas, double atas, double sisimiring){
        super(tinggi, alas, sisimiring, atas);
    }

    public double getLuas(){
        return 0.5*(nilaiA+nilaiB)*nilaiC;
    }

    public double getKeliling(){
        return nilaiA+nilaiB+nilaiC+nilaiD;
    }
}
