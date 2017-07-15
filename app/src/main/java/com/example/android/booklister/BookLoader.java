package com.example.android.booklister;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by FEY-AGAPE on 14/07/2017.
 */

/**
 * Loads a list of books by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class BookLoader extends AsyncTaskLoader<List<Book>> {

    final private String mUrl;

    BookLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */

    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        // Perform the network request, parse the response, and extract a list of books.
        return QueryUtils.fetchBookData(mUrl);
    }
}