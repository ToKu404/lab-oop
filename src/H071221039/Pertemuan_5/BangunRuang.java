package H071221039.Pertemuan_5;
public class BangRuang {
    public double hitungLuas(){
        return 0;
    }
    public double hitungVolume(){
        return 0;
    }
}

class Kubus extends BangRuang {
    private double sisi;

    public Kubus() {}

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 6 * sisi * sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

class Balok extends BangRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok() {}

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) ;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangRuang {
    private double jari;

    public Bola() {}

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungLuas() {
        return 4 * Math.PI * jari * jari;
    }

    @Override
    public double hitungVolume() {
        return 4/3 * Math.PI * jari * jari * jari;
    }
}

class Tabung extends BangRuang {
    private double jari;
    private double tinggi;

    public Tabung() {}

    public void setJari(double jari) {
        this.jari = jari;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }
}