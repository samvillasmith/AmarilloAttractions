package com.example.android.amarilloattractions;


/**
 * {@link Location}
 */
public class Location {

    /** String resource IDs for the description and identity of the location */
    private int mSecondaryId;

    private int mPrimaryId;

    /** Image resource ID for the locations */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param secondaryId is the string resource ID for primary location identifier.
     * @param primaryId is the string resource Id for the location description.
     * @param imageResourceId is the resource ID for the image of the location.
     */
    public Location(int secondaryId, int primaryId, int imageResourceId) {
        mSecondaryId = secondaryId;
        mPrimaryId = primaryId;
        mImageResourceId = imageResourceId;
    }

    public int getSecondaryId() {
        return mSecondaryId;
    }

    public int getPrimaryId() {
        return mPrimaryId;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}