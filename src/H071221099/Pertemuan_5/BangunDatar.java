public class BangunDatar { 
        double keliling, luas;
        
        public double getKeliling() {
            return keliling;
        }
    
        public double getLuas() {
            return luas;
        }
    
        double ni1, ni2, ni3, ni4;
    
        public BangunDatar(double ni1, double ni2, double ni3, double ni4) {
            this.ni1 = ni1;
            this.ni2 = ni2;
            this.ni3 = ni3;
            this.ni4 = ni4;
        }
    
        public BangunDatar(double ni1, double ni2, double ni3) {
            this.ni1 = ni1;
            this.ni2 = ni2;
            this.ni3 = ni3;
        }
    
        public BangunDatar(double ni1, double ni2) {
            this.ni1 = ni1;
            this.ni2 = ni2;
        }
    
        public BangunDatar(double ni1) {
            this.ni1 = ni1;
        }
    }

    class Persegi extends BangunDatar {
        public Persegi (double ni1){
            super(ni1);
        }
        public double getKeliling(){
            return ni1+ni1+ni1+ni1;
        }
        public double getLuas(){
            return ni1*ni1;
        }
    }

    class PersegiPanjang extends BangunDatar {
        public PersegiPanjang (double ni1, double ni2){
            super(ni1, ni2);
        }
        public double getKeliling(){
            return 2*(ni1+ni2);
        }
        public double getLuas(){
            return ni1*ni2;
        }
    }

    class Lingkaran extends BangunDatar {
        public Lingkaran (double ni1){
            super(ni1);
        }
        public double getKeliling(){
            return 2*Math.PI*ni1;
        }
        public double getLuas(){
            return Math.PI*ni1*ni1;
        }
    }

    class Segitiga extends BangunDatar {
        public Segitiga (double ni1,double ni2, double ni3){
            super(ni2, ni3);
        }
        public double getKeliling(){
            return ni1+ni1+ni1;
        }
        public double getLuas(){
            return 0.5 *ni2*ni3;
        }
    }

    class Trapesium extends BangunDatar {
        public Trapesium (double ni1, double ni2){
            super(ni1, ni2);
        }
        public double getKeliling(){
            return ni1+ni1+ni1+ni1;
        }
        public double getLuas(){
            return 0.5*(ni1+ni1)*ni2;
        }
    }