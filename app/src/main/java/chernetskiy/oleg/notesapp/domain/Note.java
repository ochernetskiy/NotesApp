package chernetskiy.oleg.notesapp.domain;

import androidx.annotation.IntegerRes;
import androidx.annotation.StringRes;

public class Note {

    @IntegerRes
    private final int date;

    @StringRes
    private int title;

    @StringRes
    private int description;


    public Note(int title, int description, int date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getDate() {
        return date;
    }
}
