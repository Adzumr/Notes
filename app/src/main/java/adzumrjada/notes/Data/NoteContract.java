package adzumrjada.notes.Data;

import android.provider.BaseColumns;

/**
 * Created by adzumr on 9/1/17.
 */

public final class NoteContract {

    private NoteContract() {
    }

    public static final class NoteEntry implements BaseColumns {

        public static final String TABLE_NAME = "Notes";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NOTE_TITLE = "title";
        public static final String COLUMN_NOTE_DESCRIPTION = "description";
    }
}
