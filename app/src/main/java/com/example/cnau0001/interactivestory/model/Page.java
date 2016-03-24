package com.example.cnau0001.interactivestory.model;

/**
 * Created by cnau0001 on 23/03/16.
 */
public class Page {
    private int mImageId;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2){
        mImageId = imageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int imageId, String text){
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public int getImageId() {

        return mImageId;
    }

    public void setImageId(int imageId)
    {
        mImageId = imageId;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
