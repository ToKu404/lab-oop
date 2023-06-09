public class Main2 {
    
    public static void main(String[] args) {
        Book book = new Book();
        book.setTittle("Palangga");
        book.setAuthor("Rafylo");
        book.setType("Komedi");
        book.setYearPublished(2020);
        book.setPrice(1000000);
        book.displayInfo();
        System.out.println("=============");
        Book book2 = new Book ( "AB", "Rukont", "Romance",2022, 10000);
        System.out.println(book2.getTittle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getType());
        System.out.println(book2.getYearPublished());
        System.out.println(book2.getPrice());
        SelfUtils.displaySelfData();
    }
}


