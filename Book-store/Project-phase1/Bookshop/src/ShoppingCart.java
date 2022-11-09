import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Book> BookList;
    private double BookPrice;
    private ArrayList<AudioBook> AudioBookList;
    private double AudioBookPrice;
    private double Total;
    public ShoppingCart() {

    }
    private void addBook (Book book){
        BookList.add(book);
        BookPrice++;
    }
    private void addAudioBook (AudioBook abook){
        AudioBookList.add(abook);
        AudioBookPrice++;
    }
    private void removeBook (Book book){
        BookList.remove(book);
        BookPrice--;
    }
    private void removeAudioBook (AudioBook abook){
        AudioBookList.remove(abook);
        AudioBookPrice--;
    }


    private void Checkout (){
        this.Total = AudioBookPrice + BookPrice;
    }
    private void payAmount (PaymentMethod payment){

    }
}
