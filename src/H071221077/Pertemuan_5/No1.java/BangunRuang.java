class BangunRuang {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;
    protected double nilaiD;
    protected double nilaiE;

    protected double luasPermukaan;
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

    public BangunRuang(double nilaiA, double nilaiB, double nilaiC, double nilaiD) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
        this.nilaiD = nilaiD;
    }
    
    public BangunRuang(double nilaiA, double nilaiB, double nilaiC, double nilaiD, double nilaiE) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
        this.nilaiD = nilaiD;
        this.nilaiE = nilaiE;
    }
}

class Kubus extends BangunRuang{

    public Kubus(double nilaiA) {
        super(nilaiA);
    }

    public double luasPermukaan(){
        return 6 * nilaiA * nilaiA;
    }

    public double volume(){
        return nilaiA * nilaiA * nilaiA;
    }
}

class Balok extends BangunRuang{

    public Balok(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA, nilaiB, nilaiC);
    }

    public double luasPermukaan(){
        return 2 * (nilaiA * nilaiB + nilaiA * nilaiC + nilaiB * nilaiC);
    }

    public double volume(){
        return nilaiA * nilaiB * nilaiC;
    }
}

class Bola extends BangunRuang{

    public Bola(double nilaiA) {
        super(nilaiA);
    }

    public double luasPermukaan(){
        return 4 * Math.PI * nilaiA * nilaiA;
    }

    public double volume(){
        return 4/3 * Math.PI * nilaiA * nilaiA * nilaiA;
    }
}

class Tabung extends BangunRuang{

    public Tabung(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
    }

    public double getJari() {
        return nilaiA;
    }

    public double getTinggi() {
        return nilaiB;
    }

    public double luasPermukaan(){
        return 2 * Math.PI * nilaiA * (nilaiA * nilaiB);
    }

    public double volume(){
        return Math.PI * nilaiA * nilaiA * nilaiB;
    }
}