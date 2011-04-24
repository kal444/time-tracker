package com.yellowaxe.timetracker.test;

import android.net.Uri;
import android.test.ProviderTestCase2;
import android.test.mock.MockContentResolver;

import com.yellowaxe.timetracker.TimeTrackerProvider;

public class TimeTrackerProviderTest extends ProviderTestCase2<TimeTrackerProvider> {

    private static final Uri INVALID_URL =
        Uri.withAppendedPath(TimeTrackerProvider.Contract.URI_ENTRIES, "invalid_url");

    private MockContentResolver mockContentResolver;

    public TimeTrackerProviderTest() {

        super(TimeTrackerProvider.class, TimeTrackerProvider.Contract.AUTHORITY);
    }

    public void testInvalidUriGetType() {

        assertNull(mockContentResolver.getType(INVALID_URL));
    }

    public void testEntriesUriGetType() {

        String mimeType = mockContentResolver.getType(TimeTrackerProvider.Contract.URI_ENTRIES);
        assertEquals(TimeTrackerProvider.Contract.TYPE_ENTRIES, mimeType);
    }

    public void testTasksUriGetType() {

        String mimeType = mockContentResolver.getType(TimeTrackerProvider.Contract.URI_TASKS);
        assertEquals(TimeTrackerProvider.Contract.TYPE_TASKS, mimeType);
    }

    public void testCategoriesUriGetType() {

        String mimeType = mockContentResolver.getType(TimeTrackerProvider.Contract.URI_CATEGORIES);
        assertEquals(TimeTrackerProvider.Contract.TYPE_CATEGORIES, mimeType);
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
