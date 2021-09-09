package chernetskiy.oleg.notesapp.domain;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.IntegerRes;
import androidx.annotation.StringRes;

public class Note implements Parcelable {

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };
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

    protected Note(Parcel in) {
        date = in.readInt();
        title = in.readInt();
        description = in.readInt();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(date);
        dest.writeInt(title);
        dest.writeInt(description);
    }
}
