package chernetskiy.oleg.notesapp.ui;

import java.util.List;

import chernetskiy.oleg.notesapp.domain.Note;

public interface NotesListView {

    void showNotes(List<Note> notes);
}
