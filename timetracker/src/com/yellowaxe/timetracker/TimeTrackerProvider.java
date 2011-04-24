package com.yellowaxe.timetracker;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class TimeTrackerProvider extends ContentProvider {

    private static final UriMatcher URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);

    private static final int ENTRIES_1 = 1;

    private static final int TASKS_2 = 2;

    private static final int CATEGORIES_3 = 3;

    static {
        URI_MATCHER.addURI(Contract.AUTHORITY, "entries", ENTRIES_1);
        URI_MATCHER.addURI(Contract.AUTHORITY, "tasks", TASKS_2);
        URI_MATCHER.addURI(Contract.AUTHORITY, "categories", CATEGORIES_3);
    }

    public static class Contract {

        public static final String AUTHORITY = "com.yellowaxe.timetracker";

        private static final String SCHEME = "content://";

        private static final String PATH_ENTRIES = "/entries";

        private static final String PATH_TASKS = "/tasks";

        private static final String PATH_CATEGORIES = "/categories";

        public static final Uri URI_ENTRIES = Uri.parse(SCHEME + AUTHORITY + PATH_ENTRIES);

        public static final Uri URI_TASKS = Uri.parse(SCHEME + AUTHORITY + PATH_TASKS);

        public static final Uri URI_CATEGORIES = Uri.parse(SCHEME + AUTHORITY + PATH_CATEGORIES);

        public static final String TYPE_ENTRIES = "vnd.android.cursor.dir/vnd.timetracker.entry";

        public static final String TYPE_TASKS = "vnd.android.cursor.dir/vnd.timetracker.task";

        public static final String TYPE_CATEGORIES =
            "vnd.android.cursor.dir/vnd.timetracker.category";

    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
                        String sortOrder) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {

        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {

        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean onCreate() {

        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getType(Uri uri) {

        switch (URI_MATCHER.match(uri)) {
        case ENTRIES_1:
            return Contract.TYPE_ENTRIES;
        case TASKS_2:
            return Contract.TYPE_TASKS;
        case CATEGORIES_3:
            return Contract.TYPE_CATEGORIES;
        default:
            return null;
        }
    }

}
