public class Book extends BookType{
    private String CoverType;

    public Book(){

    }
    public Book(String title, String author, String publisher, double price, String genre, int noOfPages, String coverType) {
        super(title, author, publisher, price, genre, noOfPages);
        CoverType = coverType;
    }

    public String getCoverType() {
        return CoverType;
    }

    public void setCoverType(String coverType) {
        CoverType = coverType;
    }

}
