package com.example.prohect_g;

import android.provider.ContactsContract;

public class OverView {

    private int mImage;
    private String mName;
    private String mClassName;

    public OverView(int Image, String Name,String ClassName ){
        mImage = Image;
        mName = Name;
        mClassName = ClassName;
    }

    public int getmImage() {
        return mImage;
    }
    public String getmName(){
        return mName;
    }
    public String getmClassName(){
        return mClassName;
    }
}
