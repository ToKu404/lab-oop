package H071221087.Pertemuan_2;
class Produk {
    String id;
    String nama;
    int stok;
    int harga;   
    public void setID(String idProduk){
        id = idProduk;
    }
    public void setnama(String namaProduk){
        nama = namaProduk;
    }
    public void setstok(int stokProduk){
        stok = stokProduk;
    }
    public void setharga(int hargaProduk){
        harga = hargaProduk;
    }
    public void cekstok(){
        if(stok == 0){
            System.out.println("\n===================");
            System.out.println("Stok Tidak Tersedia");    
            System.out.println("===================");;
        }else{
            System.out.println
            ("\n===================");
            System.out.println("Stok Tersedia");
            System.out.println("===================");
        }
    }
    public void detail(){
    System.out.printf("ID Produk : %s\nNama Produk : %s\nStok : %d kg\nHarga : Rp.%d/kg",id,nama,stok,harga);
    }
}

public class No3 {
    public static void main(String[] args) {
        Produk objekproduk = new Produk();
        objekproduk.setID("A5");
        objekproduk.setnama("Daging Wagyu");
        objekproduk.setstok(100);
        objekproduk.setharga(6500000);
        objekproduk.detail();
        objekproduk.cekstok();
    }
}
