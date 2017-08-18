package adzumrjada.notes.Data;

import android.provider.BaseColumns;

/**
 * Created by Heart on 8/18/2017.
 */

public final class NoteContract {
    private NoteContract(){}

    public static final class NotesEntry implements BaseColumns {

        public static final String TABLE_NAME = "NotesDb";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NOTES_TITLE = "Title";
        public static final String COLUMN_NOTES_DESCRIPTION = "Description";
    }
}
