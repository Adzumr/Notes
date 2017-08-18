package adzumrjada.notes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }
    public void AddNewNote (View view) {
        Intent i = new Intent(this, NewNoteActivity.class);
        startActivity(i);
    }
    public void MyNotes (View view) {
        Intent i = new Intent(this, MyNotesActivity.class);
        startActivity(i);
    }
    public void About (View view) {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }
}
