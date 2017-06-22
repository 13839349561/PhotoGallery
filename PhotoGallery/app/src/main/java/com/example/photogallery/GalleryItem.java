package com.example.photogallery;

import android.net.Uri;

/**
 * Created by 邢仁琦 on 2017/6/14.
 */

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUri;
    private String mOwner;

    public String getmOwner() {
        return mOwner;
    }

    public void setmOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public Uri getPhotoPageUri(){
       return Uri.parse("http://www.flickr.com/photos/")
               .buildUpon()
               .appendPath(mOwner)
               .appendPath(mId)
               .build();
    }


    @Override
    public String toString(){
        return mCaption;
    }
    public String getmCaption() {
        return mCaption;
    }

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUri() {
        return mUri;
    }

    public void setmUri(String mUri) {
        this.mUri = mUri;
    }

}
