class Produk{
    int id;
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
    public void display() {
      System.out.println("Nama : " + nama);
      System.out.println(id);
      System.out.println(stok);
      System.out.println(harga);
  
    }
  
    public int getId(){  
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
        Produk proone = new Produk();
        Produk protwo = new Produk();
  
        proone.id = 12097;
        proone.nama = "Baju kaos";
        proone.stok = 0;
        proone.harga = 50000;
  
        protwo.id = 10927;
        protwo.nama = "Celana pendek";
        protwo.stok = 0;
        protwo.harga = 35000;
  
        
        proone.isAvailable();  //untuk pemanggilan 
        proone.display();
        protwo.isAvailable();
        protwo.display();
  
    }
  }