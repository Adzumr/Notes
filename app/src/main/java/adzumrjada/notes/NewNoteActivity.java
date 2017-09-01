package adzumrjada.notes;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import adzumrjada.notes.Data.NoteContract;
import adzumrjada.notes.Data.NoteDbHelper;

public class NewNoteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

    }

    private void InsertNote() {
    }

    public void Back(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        startActivity(i);
        }

    }







