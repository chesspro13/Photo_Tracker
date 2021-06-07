package com.example.photothingplease;

import android.content.Context;
import android.widget.Toast;

public class generator {

    private int length = 8;
    private char [] digits;
    private Context context;

    public generator(Context ct)
    {
        digits = new char[length];
        this.context = ct;
    }

    public String generateURL()
    {

        String newStr = "";
        for( int i = 0; i < this.digits.length; i++ )
        {
            this.digits[i] = (char) Math.floor(Math.random()*(63));
            newStr += this.digits[i];
        }


        return newStr;
    }
}
