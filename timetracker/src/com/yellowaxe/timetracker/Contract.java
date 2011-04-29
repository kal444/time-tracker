package com.yellowaxe.timetracker;

import android.net.Uri;

public final class Contract {

    public static final String AUTHORITY = "com.yellowaxe.timetracker";

    private static final String URL_PREFIX = "content://" + AUTHORITY;

    private static final String PATH_ENTRIES = "/entries";

    public static final Uri URI_ENTRIES = Uri.parse(URL_PREFIX + PATH_ENTRIES);

    public static final Uri URI_ENTRY = Uri.parse(URL_PREFIX + PATH_ENTRIES + "/");

    public static final String TYPE_ENTRIES = "vnd.android.cursor.dir/vnd.yellowaxe.entry";

    public static final String TYPE_ENTRY = "vnd.android.cursor.item/vnd.yellowaxe.entry";

    private static final String PATH_TASKS = "/tasks";

    public static final Uri URI_TASKS = Uri.parse(URL_PREFIX + PATH_TASKS);

    public static final Uri URI_TASK = Uri.parse(URL_PREFIX + PATH_TASKS + "/");

    public static final String TYPE_TASKS = "vnd.android.cursor.dir/vnd.yellowaxe.task";

    public static final String TYPE_TASK = "vnd.android.cursor.item/vnd.yellowaxe.task";

    private static final String PATH_CATEGORIES = "/categories";

    public static final Uri URI_CATEGORIES = Uri.parse(URL_PREFIX + PATH_CATEGORIES);

    public static final Uri URI_CATEGORY = Uri.parse(URL_PREFIX + PATH_CATEGORIES + "/");

    public static final String TYPE_CATEGORIES = "vnd.android.cursor.dir/vnd.yellowaxe.category";

    public static final String TYPE_CATEGORY = "vnd.android.cursor.item/vnd.yellowaxe.category";

    private Contract() {

    }

}
