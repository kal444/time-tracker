package com.yellowaxe.timetracker.test;

import android.net.Uri;
import android.test.ProviderTestCase2;
import android.test.mock.MockContentResolver;

import com.yellowaxe.timetracker.Contract;
import com.yellowaxe.timetracker.TimeTrackerProvider;

public class TimeTrackerProviderTest extends ProviderTestCase2<TimeTrackerProvider> {

    private static final Uri INVALID_URL =
        Uri.withAppendedPath(Contract.URI_ENTRIES, "invalid_url");

    private MockContentResolver mockContentResolver;

    public TimeTrackerProviderTest() {

        super(TimeTrackerProvider.class, Contract.AUTHORITY);
    }

    public void testInvalidUriGetType() {

        assertNull(mockContentResolver.getType(INVALID_URL));
    }

    public void testEntriesUriGetType() {

        String mimeType = mockContentResolver.getType(Contract.URI_ENTRIES);
        assertEquals(Contract.TYPE_ENTRIES, mimeType);
    }

    public void testEntryUriGetType() {

        String mimeType =
            mockContentResolver.getType(Uri.withAppendedPath(Contract.URI_ENTRY, "4"));
        assertEquals(Contract.TYPE_ENTRY, mimeType);
    }

    public void testTasksUriGetType() {

        String mimeType = mockContentResolver.getType(Contract.URI_TASKS);
        assertEquals(Contract.TYPE_TASKS, mimeType);
    }

    public void testTaskUriGetType() {

        String mimeType = mockContentResolver.getType(Uri.withAppendedPath(Contract.URI_TASK, "4"));
        assertEquals(Contract.TYPE_TASK, mimeType);
    }

    public void testCategoriesUriGetType() {

        String mimeType = mockContentResolver.getType(Contract.URI_CATEGORIES);
        assertEquals(Contract.TYPE_CATEGORIES, mimeType);
    }

    public void testCategoryUriGetType() {

        String mimeType =
            mockContentResolver.getType(Uri.withAppendedPath(Contract.URI_CATEGORY, "4"));
        assertEquals(Contract.TYPE_CATEGORY, mimeType);
    }

    @Override
    protected void setUp() throws Exception {

        super.setUp();
        mockContentResolver = getMockContentResolver();
    }

    @Override
    protected void tearDown() throws Exception {

        super.tearDown();
    }

}
