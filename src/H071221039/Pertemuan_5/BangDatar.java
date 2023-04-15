package H071221039.Pertemuan_5;
public class BangDatar {
    public double hitungKeliling(){
        return 0;
    }
    public double hitungLuas(){
        return 0;
    }
}

class Persegi extends BangDatar {
    private double sisi;

    public Persegi() {}

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang() {}

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Lingkaran extends BangDatar {
    private double jari;

    public Lingkaran() {}

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jari * jari;
    }
}

class Segitiga extends BangDatar {
    private double alas;
    private double sisikiri;
    private double sisikanan;
    private double tinggi;

    public Segitiga() {}

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setSisikiri(double sisikiri) {
        this.sisikiri = sisikiri;
    }
    public void setSisikanan(double sisikanan) {
        this.sisikanan = sisikanan;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + sisikiri + sisikanan;
    }

    @Override
    public double hitungLuas() {
        return (alas * tinggi)/2;
    }
}

class Trapesium extends BangDatar {
    private double alas;
    private double sisimiring;
    private double atas;
    private double tinggi;

    public Trapesium() {}

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }
    public void setAtas(double atas) {
        this.atas = atas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + (sisimiring * 2) + atas;
    }

    @Override
    public double hitungLuas() {
        return ((alas + atas) * tinggi)/2;
    }
}