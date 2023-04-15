package H071221088.Pertemuan_5;

public class Bangun {
}

class BangunDatar extends Bangun {
    int getvolume() {
        return 1;
    }
    int getluasPermukaan() {
        return 1;
    }
}
class BangunRuang extends Bangun {
    int getluas() {
        return 1;
    }
    int getkeliling() {
        return 1;
    }
}

class Kubus extends BangunRuang {
    int sisi;
    int getvolume() {
        return sisi*sisi*sisi;
    }
    int getluasPermukaan() {
        return 6*(sisi*sisi);
    } 
}
class Balok extends BangunRuang {
    int panjang;
    int lebar;
    int tinggi;

    int getvolume() {
        return panjang*lebar*tinggi;
    }
    int getluasPermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
class Bola extends Bangun {
    int jari;
    double getvolumebola() {
        return 4*Math.PI*(jari*jari);
    }
    double getluasPermukaanbola() {
        return (Math.PI*(jari*jari*jari)*4)/3;
    }
}
class Tabung extends Bangun {
    int jari;
    int tinggi;

    double getvolumetabung() {
        return Math.PI*(jari*jari)*tinggi;
    }
    double getluasPermukaantabung() {
        return (2*Math.PI*jari*tinggi) + (2*Math.PI*(jari*jari));
    }
}
class Persegi extends BangunDatar {
    int sisi;

    int getluas() {
        return sisi*sisi;
    }
    int getkeliling() {
        return 4*sisi;
    }
}
class persegiPanjang extends BangunDatar {
    int panjang;
    int lebar;

    int getluas() {
        return panjang*lebar;
    }
    int getkeliling() {
        return 2*(panjang+lebar);
    }
}
class Lingkaran extends Bangun {
    int jari;

    double getluaslingkaran() {
        return Math.PI*(jari*jari);
    }
    double getkelilinglingkaran() {
        return 2*Math.PI*jari;
    }
}
class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    int sisi;

    int getluas() {
        return 1/2*(alas*tinggi);
    }
    int getkeliling() {
        return 3*sisi;
    }
}
class Trapesium extends BangunDatar {
    int alas1;
    int alas2;
    int tinggi;
    int rusuk1;
    int rusuk2;

    int getluas() {
        return 1/2*(alas1+alas2)*tinggi;
    }
    int getkeliling() {
        return rusuk1+rusuk2+alas1+alas2;
    }
}
