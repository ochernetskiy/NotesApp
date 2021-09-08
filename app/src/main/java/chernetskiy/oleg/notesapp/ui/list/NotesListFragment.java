package chernetskiy.oleg.notesapp.ui.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

import chernetskiy.oleg.notesapp.R;
import chernetskiy.oleg.notesapp.domain.DeviceNotesRepository;
import chernetskiy.oleg.notesapp.domain.Note;
import chernetskiy.oleg.notesapp.ui.details.NoteDetailsActivity;

public class NotesListFragment extends Fragment implements NotesListView {

    private NotesListPresenter presenter;

    private LinearLayout container;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new NotesListPresenter(this, new DeviceNotesRepository());
    }

    public NotesListFragment() {
        super(R.layout.fragment_notes_list);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        container = view.findViewById(R.id.root);

        presenter.requestNotes();


    }

    @Override
    public void showNotes(List<Note> notes) {

        for (Note note: notes) {

            View noteItem = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, container, false);


            noteItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(requireContext(), NoteDetailsActivity.class);
                    intent.putExtra(NoteDetailsActivity.ARG_NOTE, note);
                    startActivity(intent);
                }
            });

            TextView noteTitle = noteItem.findViewById(R.id.note_title);

            noteTitle.setText(note.getTitle());

            container.addView(noteItem);

        }

    }
}
