package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String m_word, String d_word){
        mMiwokTranslation = m_word;
        mDefaultTranslation = d_word;
    }

    public String getMiwok_word() {
        return mMiwokTranslation;
    }

    public String getDefault_word() {
        return mDefaultTranslation;
    }
}
