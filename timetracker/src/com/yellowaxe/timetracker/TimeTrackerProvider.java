package com.yellowaxe.timetracker;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class TimeTrackerProvider extends ContentProvider {

    private static final UriMatcher URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);

    private static final int ENTRIES_URL_MATCHED = 1;

    private static final int TASKS_URL_MATCHED = 2;

    private static final int CATEGORIES_URL_MATCHED = 3;

    private static final int ENTRY_URL_MATCHED = 4;

    private static final int TASK_URL_MATCHED = 5;

    private static final int CATEGORY_URL_MATCHED = 6;

    private DatabaseOpenHelper dbOpenHelper;

    static {
        URI_MATCHER.addURI(Contract.AUTHORITY, "entries", ENTRIES_URL_MATCHED);
        URI_MATCHER.addURI(Contract.AUTHORITY, "tasks", TASKS_URL_MATCHED);
        URI_MATCHER.addURI(Contract.AUTHORITY, "categories", CATEGORIES_URL_MATCHED);
        URI_MATCHER.addURI(Contract.AUTHORITY, "entries/#", ENTRY_URL_MATCHED);
        URI_MATCHER.addURI(Contract.AUTHORITY, "tasks/#", TASK_URL_MATCHED);
        URI_MATCHER.addURI(Contract.AUTHORITY, "categories/#", CATEGORY_URL_MATCHED);
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
                        String sortOrder) {

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

        dbOpenHelper = new DatabaseOpenHelper(getContext());

        return true;
    }

    @Override
    public String getType(Uri uri) {

        switch (URI_MATCHER.match(uri)) {
        case ENTRIES_URL_MATCHED:
            return Contract.TYPE_ENTRIES;
        case ENTRY_URL_MATCHED:
            return Contract.TYPE_ENTRY;
        case TASKS_URL_MATCHED:
            return Contract.TYPE_TASKS;
        case TASK_URL_MATCHED:
            return Contract.TYPE_TASK;
        case CATEGORIES_URL_MATCHED:
            return Contract.TYPE_CATEGORIES;
        case CATEGORY_URL_MATCHED:
            return Contract.TYPE_CATEGORY;
        default:
            return null;
        }
    }

}
