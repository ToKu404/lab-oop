package H071221066.Pertemuan_2;

//NO.4

class Cuboid {
    double height;
    double width;
    double lenght;

    double getVolume(){
        return height*width*lenght;
    }
}

public class No4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10.0;
        cuboid.width = 15.0;
        cuboid.lenght = 30.0;

        System.out.printf("Volume = %.2f", cuboid.getVolume()); 

    }
}