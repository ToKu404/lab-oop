class Ichitan{
    String rasa;
    int harga;
    String colour;

    public String getRasa () {
        return rasa;
    }

    public int getHarga () {
        return harga;
    }

    public String getColour () {
        return colour;
    }
}

public class No1 {
    public static void main(String[] args) {
        Ichitan drnk = new Ichitan();
        drnk.rasa = "GreenTea";
        drnk.colour = "hijau";
        drnk.harga = 9700;

        System.out.println("hmm rasanya seperti " + drnk.getRasa());
        System.out.println("yang berwarna " + drnk.getColour());
        System.out.println("dengan harga " + drnk.getHarga());
    }
}


