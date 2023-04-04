class Handphone {
    String merk  ; // atribt 3-6
    String warna ;
    int harga ;

    public String getMerk () {
        return merk;
    }
    public String getWarna () {
        return warna;
    }
    public int getHarga () {
        return harga;
    }
}

public class No1 { // class main method harus public dan public cuma boleh ada satu dalam satu file
    public static void main(String[] args) {
        Handphone hp = new Handphone ();
        hp.merk  = "Iphone";
        hp.warna = "Merah";
        hp.harga = 10000;

        System.out.println("Merk handphone: " + hp.getMerk());
        System.out.println("Warna handphone: " + hp.getWarna());
        System.out.println("Harga handphone: " + hp.getHarga());
     
    }
}
