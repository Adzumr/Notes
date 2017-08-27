package adzumrjada.notes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class NewNoteActivity extends Activity {

    public static final String DebugTag = "TWP";
    public static final String descrpFile = "Notes.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        SaveButton();
        loadSavedFile();
    }

    private void loadSavedFile() {
        try {
            FileInputStream fileInputStream = openFileInput(descrpFile);
            BufferedReader Reader = new BufferedReader(new InputStreamReader(new DataInputStream(fileInputStream)));

            EditText editText = (EditText)findViewById(R.id.Description);

            String line;
            while ((line = Reader.readLine()) != null){
                editText.append(line);
                editText.append("\n");
            }
            fileInputStream.close();
        }
        catch (Exception e) {
            Log.d(descrpFile, "Error Fetching File");
        }
    }

    private void SaveButton(){
        FloatingActionButton floatingactionbutton = (FloatingActionButton)findViewById(R.id.Save);
        floatingactionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.Description);
                String string = editText.getText().toString();
                try {
                    FileOutputStream openFileoutPut = openFileOutput(descrpFile, Context.MODE_PRIVATE);
                    openFileoutPut.write(string.getBytes());
                    openFileoutPut.close();
                } catch (Exception e) {
                    Log.d(descrpFile, "Error Saving");
                }

                Log.d(descrpFile, "Save Clicked" + string);
            }
        });
    }

    public void Back(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        startActivity(i);
        }

    }







