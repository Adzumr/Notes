package adzumrjada.notes;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import adzumrjada.notes.Data.NoteContract;
import adzumrjada.notes.Data.NoteDbHelper;

public class MyNotesActivity extends AppCompatActivity {

    private NoteDbHelper mNoteDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);

        displayDataInfo();
        mNoteDbHelper = new NoteDbHelper(this);
        NoteDbHelper mNoteDnHelper = new NoteDbHelper(this);
        SQLiteDatabase db = mNoteDnHelper.getReadableDatabase();
    }

    private void displayDataInfo() {
        NoteDbHelper mNoteDnHelper = new NoteDbHelper(this);
        SQLiteDatabase db = mNoteDnHelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + NoteContract.NoteEntry.TABLE_NAME, null);

        try {
            TextView displayView = (TextView) findViewById(R.id.text_view);
            displayView.setText("NUmber Of Row In NoteDb Table: " + cursor.getCount());
        } finally {
            cursor.close();
        }
    }

    public void AddNewNote (View view) {
        Intent i = new Intent(this, NewNoteActivity.class);
        startActivity(i);
    }

    public void SaveNote() {
        SQLiteDatabase db = mNoteDbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(NoteContract.NoteEntry.COLUMN_NOTE_TITLE, "First Title");
        contentValues.put(NoteContract.NoteEntry.COLUMN_NOTE_DESCRIPTION, "The First Data To Be Inputed");

        long NewRowId = db.insert(NoteContract.NoteEntry.TABLE_NAME, null, contentValues);
        Log.v("MyNotesActivity", "New Row Id " + NewRowId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_my_notes, menu);
        return true;
    }
}




