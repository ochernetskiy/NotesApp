package chernetskiy.oleg.notesapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import chernetskiy.oleg.notesapp.R;
import chernetskiy.oleg.notesapp.domain.Note;
import chernetskiy.oleg.notesapp.ui.details.NoteDetailsActivity;
import chernetskiy.oleg.notesapp.ui.list.NotesListFragment;

public class MainActivity extends AppCompatActivity implements NotesListFragment.OnNoteClicked {

    private static final String ARG_NOTE = "ARG_NOTE";

    private Note selectedNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//
//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                if (item.getItemId() == R.id.about_app) {
//                    Toast.makeText(MainActivity.this, "About App", Toast.LENGTH_SHORT).show();
//                    return true;
//                }
//
//                if (item.getItemId() == R.id.settings) {
//                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
//                    return true;
//                }
//
//                return false;
//            }
//        });

    }

    @Override
    public void onNoteOnClicked(Note note) {

        selectedNote = note;

        Intent intent = new Intent(this, NoteDetailsActivity.class);
            intent.putExtra(NoteDetailsActivity.ARG_NOTE, note);
            startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        if (selectedNote != null) {
            outState.putParcelable(ARG_NOTE, selectedNote);
        }
        super.onSaveInstanceState(outState);
    }
}