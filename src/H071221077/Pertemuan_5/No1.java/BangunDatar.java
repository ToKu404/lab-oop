class BangunDatar {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;
    protected double nilaiD;

    protected double luas;
    protected double keliling;

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

    public double getLuas() {
        return luas;
    }

    public double getKeliling(){
        return keliling;
    }

}

class Persegi extends BangunDatar{

    public Persegi(double nilaiA) {
        super(nilaiA);
    }

    public double luas(){
        return nilaiA * nilaiA;
    }

    public double keliling(){
        return 4 * nilaiA;
    }
}

class PersegiPanjang extends BangunDatar{

    public PersegiPanjang(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
    }

    public double luas(){
        return nilaiA * nilaiB;
    }

    public double keliling(){
        return 2 * (nilaiA + nilaiB);
    }
}

class Lingkaran extends BangunDatar{

    public Lingkaran(double nilaiA) {
        super(nilaiA);
    }

    public double luas(){
        return Math.PI * nilaiA * nilaiA;
    }

    public double keliling(){
        return 2 * Math.PI * nilaiA;
    }
}

class Segitiga extends BangunDatar{


    public Segitiga(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA, nilaiB, nilaiC);
    }
    
    public double luas(){
        return nilaiB * nilaiC / 2;
    }

    public double keliling(){
        return nilaiA + nilaiC + nilaiB;
    }
}

class Trapesium extends BangunDatar{

    public Trapesium(double nilaiA, double nilaiB, double nilaiC, double nilaiD) {
        super(nilaiA, nilaiB, nilaiC, nilaiD);
    }

    public double luas(){
        return (nilaiA + nilaiB) * nilaiD / 2;
    }

    public double keliling(){
        return nilaiB + nilaiC * 2 + nilaiA;
    }
}
