package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mAudio;
    private int mIcon = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String m_word, String d_word, int audio) {
        mMiwokTranslation = m_word;
        mDefaultTranslation = d_word;
        mAudio = audio;
    }

    public Word(String m_word, String d_word) {
        mMiwokTranslation = m_word;
        mDefaultTranslation = d_word;
    }


    public Word(String m_word, String d_word, int icon, int audio) {
        mMiwokTranslation = m_word;
        mDefaultTranslation = d_word;
        mAudio = audio;
        mIcon = icon;
    }

    public String getMiwok_word() {
        return mMiwokTranslation;
    }

    public String getDefault_word() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mIcon;
    }

    public int getmAudio() {
        return mAudio;
    }

    public boolean hasImage() {
        return mIcon != NO_IMAGE;
    }
}
