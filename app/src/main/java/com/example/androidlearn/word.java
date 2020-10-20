package com.example.androidlearn;

public class word {
//    Default Translation for the words
    private String mDefaultTranslation;
//    Mewok Translation for the words
    private String mMiwokTranslation;

//    Get Default Translation of the word.
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

//    Get Mewok Translation of the word.
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
}
