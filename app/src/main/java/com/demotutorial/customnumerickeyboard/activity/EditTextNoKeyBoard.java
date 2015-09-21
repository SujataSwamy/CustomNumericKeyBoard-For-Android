package com.demotutorial.customnumerickeyboard.activity;

/**
 * Created by sujata on 10/09/15.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

public class EditTextNoKeyBoard extends EditText {

    public EditTextNoKeyBoard(Context context) {
        super(context);
    }


    public EditTextNoKeyBoard(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    public EditTextNoKeyBoard(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onCheckIsTextEditor() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK & event.getAction() == KeyEvent.ACTION_UP) {
            clearFocus();
            setFocusable(false);
            setFocusableInTouchMode(false);
            return false;
        }
        return super.dispatchKeyEvent(event);
    }
}
