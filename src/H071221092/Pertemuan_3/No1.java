public class No1 {
    public static void main(String[] args) {
        Stationary produk1 = new Stationary ("Pulpen", 3, 4000, new Diskon(90, "Diskon Ramadhan"));
        Stationary produk2 = new Stationary ("Penggaris", 2, 2000, new Diskon(50, "Diskon Ramadhan"));

        produk1.tampilkanRincian();
        produk2.tampilkanRincian();

        produk1.tambahBarang(4);
        System.out.println("Setelah ditambahkan barang: " + "\n");
        produk2.tambahBarang(3);
        System.out.println("Setelah ditambahkan barang: " + "\n");

        produk1.tampilkanRincian();
    }
}

class Stationary {
    String barang ;
    int jumlah ;
    int harga  ;
    Diskon diskon ;

    public Stationary () {}
    public Stationary (String barang, int jumlah, int harga, Diskon diskon ){
        this.barang = barang;
        this.jumlah = jumlah;
        this.harga  = harga;
        this.diskon = diskon;
    }
    public void setBarang (String barang){
        this.barang = barang;
    }
    public String getBarang () {
        return barang;
    }
    public void setHarga (int harga){
        this.harga = harga;
    }
    public int getHarga (){
        return harga;
    }
    public void setJumlah (int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah (){
        return jumlah;
    }
    public void setDiskon (Diskon diskon){
        this.diskon = diskon;
    }
    public Diskon getdiskon () {
        return diskon;
    }
    //Behavior
    public void tambahBarang(int barangTambahan) {
        jumlah += barangTambahan;
    }
    public int diskonBarang () {
        harga = harga-(diskon.persentaseDiskon * harga/100);
        return harga;
    }
    public void tampilkanRincian (){
        System.out.println("========== Rincian Produk 1 ==========");
        System.out.println("Nama barang   : " + barang);
        System.out.println("Jumlah barang : " + jumlah);
        System.out.println("Harga barang : " + harga); 
    }
}
     
class Diskon {
    int persentaseDiskon;
    String namaDiskon;
    public Diskon (int persentaseDiskon, String namaDiskon) {
    this.persentaseDiskon = persentaseDiskon;
    this.namaDiskon = namaDiskon;
    }
}
