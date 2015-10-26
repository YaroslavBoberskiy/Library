/**
 * Created by YB on 21.10.2015.
 */
public class LibraryBusinessLogic {

    private String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private Book [] sortedByAuthorName = new Book [200];
    private Book [] sortedByBookNameBooks = new Book [200];
    private Book [] sortedByGenreNameBooks = new Book [200];

    int counter = 0;

    public Book[] sortByAuthorNameBooks(Book [] books) {

        counter = 0;

        for(int i = 0; i < alphabet.length; i ++) {
            for (int k = 0; k < books.length; k ++) {
                if (books[k].getAuthorName().substring(0, 1).equals(alphabet[i])) {
                    sortedByAuthorName[counter] = books[k];
                    counter ++;
                }
            }
        }
        return sortedByAuthorName;
    }

    public Book[] sortByBookNameBooks(Book [] books) {

        counter = 0;

        for(int i = 0; i < alphabet.length; i ++) {
            for (int k = 0; k < books.length; k ++) {
                if (books[k].getBookName().substring(0, 1).equals(alphabet[i])) {
                    sortedByBookNameBooks[counter] = books[k];
                    counter ++;
                }
            }
        }
        return sortedByBookNameBooks;
    }

    public Book[] sortByGenreNameBooks(Book [] books) {

        counter = 0;

        for(int i = 0; i < alphabet.length; i ++) {
            for (int k = 0; k < books.length; k ++) {
                if (books[k].getBookGenre().toString().substring(0, 1).equals(alphabet[i])) {
                    sortedByGenreNameBooks[counter] = books[k];
                    counter ++;
                }
            }
        }
        return sortedByGenreNameBooks;
    }
}
