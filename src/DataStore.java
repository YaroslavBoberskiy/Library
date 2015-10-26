import java.util.Random;

/**
 * Created by YB on 21.10.2015.
 */
public class DataStore {

    private String[] authors = {
            "Leroy Sherman",
            "Victoria Schwartz",
            "Israel Warner",
            "Mark Harmon",
            "Eduardo Cobb",
            "Cristina Smith",
            "Benny Day",
            "Winifred Cortez",
            "Brendan Lloyd",
            "Anthony Kelly",
            "Latoya Strickland",
            "Enrique Mckinney",
            "Marjorie Edwards",
            "Shelly Foster",
            "Christine Mccoy",
            "Minnie Martin",
            "Clara Bryant",
            "Misty Harrison",
            "Jimmy Hale",
            "Bobby Klein",
            "Terrell Bates",
            "Brandy Mendez",
            "Tim Cook",
            "Darnell Fitzgerald",
            "Ken Love"};

    private String[] bookNames = {
            "Bridget Jones’s Diary",
            "Little Women",
            "Romeo and Juliet",
            "Dracula",
            "The Secret Garden",
            "George’s Marvellous Medicine",
            "Time Travellers Wife",
            "The Hunger Games",
            "The Catcher in the Rye",
            "David Copperfield",
            "Lovely Bones",
            "The Picture of Dorian Gray",
            "Emma",
            "Lord of the Flies",
            "The Story of Tracy Beaker",
            "The shining",
            "Confessions of a shopaholic",
            "Game of Thrones",
            "Life of Pi",
            "Memoirs of a Geisha",
            "Far from the Madding Crowd",
            "The Magic Faraway Tree",
            "Silence of the Lambs",
            "My Sisters keeper",
            "Is It Just Me?",
            "Mort",
            "One Day",
            "The Kite Runner",
            "Moby Dick",
            "My Booky Wook",
            "The Perks of Being a Wallflower",
            "Wolf Hall",
            "Brief history of time",
            "Men are from Mars Women are from Venus",
            "Kane and Abel",
            "America Psycho",
            "Artemis Fowl",
            "Diary of Wimpy Kid",
            "Gone Girl",
            "The Princess Diaries",
            "Life and Laughing",
            "Wonders of the Universe",
            "Call The Midwife",
            "One The Road",
            "Being Jordan",
            "Bradley Wiggins",
            "Cloud Atlas",
            "Secret diary of a call girl",
            "How to be a Woman",
            "The Casual Vacancy"};

    Book[] sortedAuthors;
    Book[] sortedBookNames;
    Book[] sortedGenres;

    int bookCounter = 0;
    int findBooksByGenreIteration = 0;

    LibraryBusinessLogic bi = new LibraryBusinessLogic();
    private Book[] booksDatastoreArray = new Book[200];

    Random randomNum = new Random();

    public Book[] fillLibraryDB() {
        for (int i = 0; i < 200; i++) {
            Book book = new Book();
            book.setAuthorName(authors[randomNum.nextInt(authors.length)]);
            book.setBookName(bookNames[randomNum.nextInt(bookNames.length)]);
            book.setBookGenre(Genres.getGenres(randomNum.nextInt(5)));
            booksDatastoreArray[i] = book;
        }
        return booksDatastoreArray;
    }

    public void sortBooksBy() {
        Book[] books = fillLibraryDB();
        sortedAuthors = bi.sortByAuthorNameBooks(books);
        sortedBookNames = bi.sortByBookNameBooks(books);
        sortedGenres = bi.sortByGenreNameBooks(books);
    }


    public void findBooksByAuthor(String authorName) {
        for (int i = 0; i < 200; i++) {
            if (authorName.equals(sortedAuthors[i].getAuthorName())) {
                System.out.println(
                        "Author: " +
                                sortedAuthors[i].getAuthorName() + ", Book: " +
                                sortedAuthors[i].getBookName() + ", Genre: " +
                                sortedAuthors[i].getBookGenre().toString());
            }
        }
    }

    public void findBooksByBookName(String bookName) {
        for (int i = 0; i < 200; i++) {
            if (bookName.equals(sortedBookNames[i].getBookName())) {
                System.out.println(
                        "Book: " +
                                sortedBookNames[i].getBookName() + ", Author: " +
                                sortedBookNames[i].getAuthorName() + ", Genre: " +
                                sortedBookNames[i].getBookGenre().toString());
            }
        }
    }

    public int getFindBooksByGenreIteration() {
        return findBooksByGenreIteration;
    }

    public void setFindBooksByGenreIteration(int findBooksByGenreIteration) {
        this.findBooksByGenreIteration = findBooksByGenreIteration;
    }

    public void findBooksByGenre(String bookGenre) {
        for (; findBooksByGenreIteration < 200; findBooksByGenreIteration++) {
            if (bookGenre.toString().equals(sortedGenres[findBooksByGenreIteration].getBookGenre().toString())) {
                System.out.println(
                        "Genre: " +
                                sortedGenres[findBooksByGenreIteration].getBookGenre() + ", Author: " +
                                sortedGenres[findBooksByGenreIteration].getAuthorName() + ", Book: " +
                                sortedGenres[findBooksByGenreIteration].getBookName().toString());
                bookCounter ++;
                if (bookCounter % 5 == 0) {
                    System.out.println("==========================");
                    bookCounter = 0;
                    break;
                }
            }
        }
    }
}
