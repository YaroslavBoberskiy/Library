/**
 * Created by YB on 21.10.2015.
 */
public class Demo {


    public static void main(String[] args) {

        DataStore db = new DataStore();

        db.sortBooksBy();

        db.findBooksByAuthor("Tim Cook");
        db.findBooksByBookName("Mort");

        db.findBooksByGenre("HISTORY");
        db.setFindBooksByGenreIteration(db.getFindBooksByGenreIteration() + 1);

        db.findBooksByGenre("HISTORY");
        db.setFindBooksByGenreIteration(db.getFindBooksByGenreIteration() + 1);

    }
}
