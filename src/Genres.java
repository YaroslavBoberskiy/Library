/**
 * Created by YB on 21.10.2015.
 */
public enum Genres {
    FICTION, BIOGRAPHY, HISTORY, CRIME, POLITICS, POETRY;

    public static Genres getGenres(int i) {
        switch (i) {
            case 0:
                return Genres.FICTION;
            case 1:
                return Genres.BIOGRAPHY;
            case 2:
                return Genres.HISTORY;
            case 3:
                return Genres.CRIME;
            case 4:
                return Genres.POLITICS;
            case 5:
                return Genres.POETRY;
            default:
                return null;
        }
    }
}
