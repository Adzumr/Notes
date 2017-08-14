package adzumrjada.notes.Data;

import android.provider.BaseColumns;

/**
 * Created by Heart on 8/14/2017.
 */

public final class NotesContract {
    private NotesContract(){}
    public static final class NotesEntry implements BaseColumns{
        public final static String TABLE_NAME = "MyNotes";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TITLE = "TITLES";
        public final static String COLUMN_NOTES = "NOTES";
    }
}
