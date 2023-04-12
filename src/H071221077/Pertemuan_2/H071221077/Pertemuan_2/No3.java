package H071221077.Pertemuan_2;

class Produk{
    String id;  //ini atribut 
    String nama;
    int stok;
    int harga;
  
  
    public void  isAvailable(){ 
        if (stok > 0) {
          System.out.println("Tersedia");
      
        } else {
          System.out.println("Tidak tersedia");
        }
    }
    public void displayProduk() {
      System.out.println("Nama produk : " + nama);
      System.out.println("ID Produk : " + id);
      System.out.println("Stok produk : " + stok);
      System.out.println("Harga produk : " + harga);
  
    }
  
    public String getId(){  
        return id;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
  }
  
  public class No3{
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        Produk produk2 = new Produk();
  
        produk1.id = "H0001";
        produk1.nama = "Baju kaos";
        produk1.stok = 1;
        produk1.harga = 50000;

        produk1.stok = produk1.getStok() - 1;
  
        produk2.id = "H0002";
        produk2.nama = "Celana pendek";
        produk2.stok = 12;
        produk2.harga = 35000;
  
        produk1.displayProduk();
        produk1.isAvailable();  //untuk pemanggilan
        System.out.println("");
        produk2.displayProduk(); 
        produk2.isAvailable();
        
  
    }
  }