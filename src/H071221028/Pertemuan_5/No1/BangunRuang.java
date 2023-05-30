package H071221028.Pertemuan_5.No1;

public class BangunRuang {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;
   
    
    protected double keliling;
    protected double luas;
    protected double volume;
    
    public BangunRuang(double nilaiA) {
        this.nilaiA = nilaiA;
    }
    public BangunRuang(double nilaiA, double nilaiB) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
    }
    public BangunRuang(double nilaiA, double nilaiB, double nilaiC) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }
    
    
 
    
}
class Kubus extends BangunRuang{

    public Kubus (double sisi){
    super(sisi);
    }

    public double volume(){
        return 3*nilaiA;
    }

    public double luasPermukaan(){
        return 6*nilaiA*nilaiA;
    }
}

class Balok extends BangunRuang{

    public Balok (double panjang, double lebar, double tinggi){
        super(panjang, lebar, tinggi);
    }

    public double volume(){
        return nilaiA*nilaiB*nilaiC;
    }
    public double luasPermukaan(){
        return (2*nilaiA*nilaiB)+(2*nilaiA*nilaiC)+(2*nilaiB*nilaiC);
    }
}

class Bola extends BangunRuang{

    public Bola (double sisi){
        super(sisi);
    }
 
    public double volume(){
        return (4*Math.PI/3);
    }

    public double luasPermukaan(){
        return (4*Math.PI*nilaiA);
    }
}

class Tabung extends BangunRuang{

    public Tabung (double jariJari, double tinggi){
        super(jariJari, tinggi);
    }

    public double volume(){
        return (Math.PI*nilaiA*nilaiA*nilaiB);
    }

    public double luasPermukaan(){
        return (2*Math.PI*nilaiA*(nilaiA+nilaiB));
    }
}
