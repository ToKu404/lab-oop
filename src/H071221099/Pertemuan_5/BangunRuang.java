class BangunRuang {
    double volume, luaspermukaan;
    
    public double getLuaspermukaan() {
        return luaspermukaan;
    }

    public double getVolume() {
        return volume;
    }

    double n1, n2, n3, n4;

    public BangunRuang(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public BangunRuang(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public BangunRuang(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public BangunRuang(double n1) {
        this.n1 = n1;
    }
}

class Kubus extends BangunRuang {
    public Kubus (double sisi){
        super(sisi);
    }
    public double getVolume(){
        return n1*n1*n1;
    }
    public double getLuaspermukaan(){
        return 6*n1*n1;
    }
}
    
class Balok extends BangunRuang{
    public Balok (double n2, double n3, double n4){
        super(n2, n3, n4);
    }
    public double getVolume(){
        return n2*n3*n4;
    }
    public double getLuaspermukaan(){
        return 2*n2*n3+ n2*n4+n3*n4;
    }
    
} 

class Bola extends BangunRuang{
    public Bola ( double n2){
        super(n2);
    }
    public double getVolume(){
        return 4/3 *Math.PI*n2*n2*n2;
    }
    public double getLuaspermukaan(){
        return 4*Math.PI*n2*n2;
    }
}

class Tabung extends BangunRuang{
    public Tabung (double n3,double n4){
        super(n3, n4);
    }
    public double getLuaspermukaan(){
        return 2*Math.PI*n3*(n3+n4);
    }
    public double getVolume(){
        return Math.PI*n3*n3*n4;
    }
}