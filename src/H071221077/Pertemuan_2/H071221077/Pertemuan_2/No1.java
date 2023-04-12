package H071221077.Pertemuan_2;

class Food {        //nama kelas
    String namaMakanan;     //atribut
    String jenis;
    int harga;

    public String getNama(){
        return namaMakanan;
    }

    public String getJenis(){
        return jenis;
    }

    public int getHarga(){
        return harga;
    }
}

public class No1 {
    public static void main(String[] args) {
        Food food = new Food();     //objek
        Food food2 = new Food();

        food.namaMakanan = "Batagor";       //mengisi nilai atribut
        food.jenis = "Makanan ringan";
        food.harga = 13000;

        food2.namaMakanan = food.getNama();

        System.out.println("Nama makanan : "+ food.getNama());
        System.out.println("Jenis makanan : "+ food.getJenis());
        System.out.println("Harga makananan : "+food.getHarga());
        System.out.println(food2.getNama());
        System.out.println(food2.namaMakanan);
    }
}