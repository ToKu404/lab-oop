package H071221077.Pertemuan_2;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height*width*length;
    }
}

public class No4{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 12;
        cuboid.width = 25;
        cuboid.length = 15; 
        System.out.printf("Volume: %.2f", cuboid.getVolume());
    }
}