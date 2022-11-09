public class BookType {
    private String Title;
    private String Author;
    private String Publisher;
    private double price;
    private String Genre;
    private int NoOfPages;

    public BookType() {
    }

    public BookType(String title, String author, String publisher, double price, String genre, int noOfPages) {
        Title = title;
        Author = author;
        Publisher = publisher;
        this.price = price;
        Genre = genre;
        NoOfPages = noOfPages;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getNoOfPages() {
        return NoOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        NoOfPages = noOfPages;
    }
}
