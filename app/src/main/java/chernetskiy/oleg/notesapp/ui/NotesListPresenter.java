package chernetskiy.oleg.notesapp.ui;

import java.util.List;

import chernetskiy.oleg.notesapp.domain.Note;
import chernetskiy.oleg.notesapp.domain.NotesRepository;

public class NotesListPresenter {

    private final NotesListView view;

    private final NotesRepository repository;

    public NotesListPresenter(NotesListView view, NotesRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void requestNotes() {
        List<Note> result = repository.getNotes();

        view.showNotes(result);
    }
}
