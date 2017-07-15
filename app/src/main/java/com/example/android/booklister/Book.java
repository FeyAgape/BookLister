package com.example.android.booklister;

/**
 * Created by FEY-AGAPE on 14/07/2017.
 */

/**
 * An {@link Book} object contains information related to a single book.
 */
public class Book {
    private final String mTitle,
            mSubtitle,
            mAuthors,
            mDescription,
            mImageUrl;

    /**
     * Constructs a new {@link Book} object
     */

    Book(String title, String subtitle, String authors, String description, String imageUrl) {
        mTitle = title;
        mSubtitle = subtitle;
        mAuthors = authors;
        mDescription = description;
        mImageUrl = imageUrl;
    }

    /**
     * Returns the image, title, subtitle, description and author of the book.
     */
    String getTitle() {
        return mTitle;
    }

    String getSubtitle() {
        return mSubtitle;
    }

    String getAuthors() {
        return mAuthors;
    }

    String getDescription() {
        return mDescription;
    }

    String getImageUrl() {
        return mImageUrl;
    }
}