package adzumrjada.notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewNoteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

    }
    public void Back(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        startActivity(i);
        }

    }




