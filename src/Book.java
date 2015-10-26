/**
 * Created by YB on 21.10.2015.
 */
public class Book {

    private String bookName;
    private String authorName;
    private Genres bookGenre;

    Book () {}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Genres getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(Genres bookGenre) {
        this.bookGenre = bookGenre;
    }
}
