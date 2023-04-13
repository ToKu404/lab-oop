package No2;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        System.out.println("Film pertama: ");
        film.setTitle("Avengers");
        film.setDuration(130);
        film.setDirector("Cheryl");
        film.setGenre("Action");
        film.setSynopsis("Perkelahian Avengers dan Musuh");
        film.displayInfo();

        System.out.println();
        Film film2 = new Film("Black Panther", 115, "Fadillah Cheryl", "Action", "Black Panther bergabung dengan Avengers");
        System.out.println("Film kedua: ");
        System.out.println(film2.getTitle());
        System.out.println(film2.getDuration());
        System.out.println(film2.getDirector()); 
        System.out.println(film2.getGenre());
        System.out.println(film2.getSynopsis());

        System.out.println();
        System.out.println("Data diri: ");
        SelfUtils.displaySelfData();
    }
}
