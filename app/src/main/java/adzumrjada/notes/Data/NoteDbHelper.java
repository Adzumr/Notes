package adzumrjada.notes.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import adzumrjada.notes.Data.NoteContract.NoteEntry;

/**
 * Created by adzumr on 9/1/17.
 */

public class NoteDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "NotesDB.db";
    private static final int DATABASE_VERSION = 1;

    public NoteDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_NOTES_TABLE = "CREATE TABLE " + NoteEntry.TABLE_NAME + "("
                + NoteEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + NoteEntry.COLUMN_NOTE_TITLE + "TEXT NOT NULL"
                + NoteEntry.COLUMN_NOTE_DESCRIPTION + "TEXT NOT NULL)";

        db.execSQL(SQL_CREATE_NOTES_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
