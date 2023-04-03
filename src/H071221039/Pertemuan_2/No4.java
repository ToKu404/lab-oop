package H071221039.Pertemuan_2;
// pembuatan class
class Cuboid{
    // attribute
    double height;
    double width;
    double length;

    double getVolume(){
        return height*width*length; // rumus balok
    }
}

// pembuatan class utama
public class No4 {
    // pembuatan class untuk memanggil objek cuboid
    public static void main(String[] args) {
        // pemmanggilan objek cuboid
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15.00;
        cuboid.width = 15.00;
        cuboid.length = 20.00;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}