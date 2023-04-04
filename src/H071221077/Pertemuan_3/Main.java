import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KonserMusik musik = new KonserMusik("Konser", "Free");
        List<String> penyanyi = new ArrayList<>();
        penyanyi.add("Opick");
        penyanyi.add("Dewa19");
        penyanyi.add("Raisa");
        musik.setPenyanyi(penyanyi);
        System.out.println(musik.getNama());
        System.out.println(musik.getStatus());
        musik.displayPenyanyi();
    }
}