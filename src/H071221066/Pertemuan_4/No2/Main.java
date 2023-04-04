package H071221066.Pertemuan_4.No2;

public class Main {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.setTitle("Vilandsag");
        anime1.setEpisodeCount(15);
        anime1.setGenre("action");
        anime1.setStudio("WIT Studio");
        anime1.setSynopsis("Viking");

        anime1.displayInfo();
        System.out.println("======================");

        Anime anime2 = new Anime("HxH", 148, "Action", "Madhouse", "Gon cari Bapaknya");
        System.out.println("Title : " + anime2.getTitle());
        System.out.println("Episode : " + anime2.getEpisodeCount());
        System.out.println("Genre : " + anime2.getGenre());
        System.out.println("Studio : " + anime2.getStudio());
        System.out.println("Synopsis : " + anime2.getSynopsis());

        System.out.println("===================");
        SelfUtils.displayInfo();
    }
}
