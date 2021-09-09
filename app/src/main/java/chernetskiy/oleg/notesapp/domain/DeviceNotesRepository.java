package chernetskiy.oleg.notesapp.domain;

import java.util.ArrayList;
import java.util.List;

import chernetskiy.oleg.notesapp.R;

public class DeviceNotesRepository implements NotesRepository {

    @Override
    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();

        notes.add(new Note(R.string.note_1, R.string.note_1_dsc, R.string.note_1_date));
        notes.add(new Note(R.string.note_2, R.string.note_2_dsc, R.string.note_2_date));
        notes.add(new Note(R.string.note_3, R.string.note_3_dsc, R.string.note_3_date));
        notes.add(new Note(R.string.note_4, R.string.note_4_dsc, R.string.note_4_date));
        notes.add(new Note(R.string.note_5, R.string.note_5_dsc, R.string.note_5_date));
        notes.add(new Note(R.string.note_6, R.string.note_6_dsc, R.string.note_6_date));

        return notes;
    }
}
