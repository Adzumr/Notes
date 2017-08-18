package adzumrjada.notes.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Heart on 8/18/2017.
 */

public class NoteDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "NotesDb.db";
    public static final int DATABASE_VERSION = 1;

    public NoteDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_NOTES_TABLE = "CREATE TABLE " + NoteContract.NotesEntry.TABLE_NAME + "("
                + NoteContract.NotesEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + NoteContract.NotesEntry.COLUMN_NOTES_TITLE + "TEXT NOT NULL"
                + NoteContract.NotesEntry.COLUMN_NOTES_DESCRIPTION + "TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_NOTES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

