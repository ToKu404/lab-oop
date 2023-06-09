public class Book {
    String tittle;
    String author;
    String type;
    int yearPublished;
    int price;
    // public Object setTittle;
    // public Object setPrice;
    // public Object setYearPublished;
    // public Object setType;
    public Book(){}
    
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String tittle, String author, String type, int yearPublished, int price) {
        this.tittle = tittle;
        this.author = author;
        this.type = type;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println(tittle);
        System.out.println(author);
        System.out.println(type);
        System.out.println(yearPublished);
        System.out.println(price);
    }

    public void setAuthor() {
    }

    public void setTittle() {
    }

    public void setType() {
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getPrice() {
        return price;
    }

}