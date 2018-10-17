package com.mohammadramadan.android.findyourmovie;

import android.widget.ImageView;

public class Items {
    private int mImageResId;
    private String mMovieName;
    private String mRating;
    private String mDescription;

public Items (String MovieName, String Rating, String Description, int ImageResId){
    mImageResId = ImageResId;
    mMovieName = MovieName;
    mRating = Rating;
    mDescription = Description;
}

public  String getmMovieName(){
return mMovieName;}

public String getmRating (){
    return mRating;
}
public String getmDescription(){
    return mDescription;
}
public int getmImageResId(){
    return mImageResId;
}
}
