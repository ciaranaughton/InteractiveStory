package com.example.cnau0001.interactivestory.model;

/**
 * Created by cnau0001 on 23/03/16.
 */
public class Choice {
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){

        mText=text;
        mNextPage=nextPage;
    }



    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int text) {
        mNextPage = text;
    }


}
