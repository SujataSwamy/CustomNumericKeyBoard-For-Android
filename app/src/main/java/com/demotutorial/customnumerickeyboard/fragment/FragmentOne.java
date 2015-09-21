package com.demotutorial.customnumerickeyboard.fragment;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.demotutorial.customnumerickeyboard.R;
import com.demotutorial.customnumerickeyboard.activity.EditTextNoKeyBoard;
import com.demotutorial.customnumerickeyboard.activity.KeyBoardListener;
import com.demotutorial.customnumerickeyboard.utilities.AppConstant;

/**
 * Created by sujata on 20/09/15.
 */
public class FragmentOne extends Fragment {

    private EditTextNoKeyBoard numericEditText;
    private RelativeLayout keyBoardContainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        numericEditText = (EditTextNoKeyBoard) getView().findViewById(R.id.fragOneEditText);
        keyBoardContainer = (RelativeLayout) getView().findViewById(R.id.keyBoardContainer);
        numericEditText.setFocusable(false);

        LayoutTransition transition = keyBoardContainer.getLayoutTransition();
        transition.enableTransitionType(LayoutTransition.CHANGING);

        numericEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericEditText.requestFocus();
                numericEditText.requestFocusFromTouch();
                KeyBoardListener listener = new KeyBoardListener(getActivity(), keyBoardContainer, AppConstant.FRAGMENT_ONE, numericEditText.getText().toString());
                if (keyBoardContainer.getVisibility() == View.GONE) {
                    showCustomKeyBoard();
                } else {
                    hideCustomKeyBoard();
                }
            }
        });
    }

    public void setEditTextValue(int value){
        if(value == 0){
            numericEditText.setText("");
        }else {
            numericEditText.setText(value+"");
        }
    }

    public void showCustomKeyBoard(){
        keyBoardContainer.setVisibility(View.VISIBLE);
    }

    public void hideCustomKeyBoard(){
        keyBoardContainer.setVisibility(View.GONE);
    }

    public void clearEditTextFocus() {
        numericEditText.clearFocus();
    }
}
