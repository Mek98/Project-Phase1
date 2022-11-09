public class AudioBook extends BookType{
    private String Narrator;

    public AudioBook(){

    }
    public AudioBook(String title, String author, String publisher, double price, String genre, int noOfPages, String narrator) {
        super(title, author, publisher, price, genre, noOfPages);
        Narrator = narrator;
    }

    public String getNarrator() {
        return Narrator;
    }

    public void setNarrator(String narrator) {
        Narrator = narrator;
    }
}
