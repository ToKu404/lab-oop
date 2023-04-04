class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume(){
    return height * widht * length;
    }
}

public class No4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid ();
        cuboid.height = 10.0;
        cuboid.widht  = 30.0;
        cuboid.length = 15.0;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}