package No2;

class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsis;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Film(){

    }

    public Film(String title, int duration, String director, String genre, String synopsis) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public void displayInfo(){
        String t = title;
        int du = duration;
        String di = director;
        String g = genre;
        String s = synopsis;
        System.out.println(t);
        System.out.println(du);
        System.out.println(di);
        System.out.println(g);
        System.out.println(s);
    }
}
