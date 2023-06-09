class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length; // return volume dengan menggunakan rumus dibawah yg berguna mengembalikan nilai
    }
}


public class No4 {
    
    public static void main(String[] args) {
        Cuboid cuboidone = new Cuboid();

        cuboidone.height = 15;
        cuboidone.width = 20; //mengisi value dari ketiga atribut
        cuboidone.length = 15;

        double volume = cuboidone.getVolume();

        System.out.printf("Volume = %.2f", volume);
    }
}
