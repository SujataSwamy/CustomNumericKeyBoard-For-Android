package com.demotutorial.customnumerickeyboard.fragment;

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
public class FragmentThree extends Fragment {

    private EditTextNoKeyBoard numericEditText;
    private RelativeLayout keyBoardContainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        numericEditText = (EditTextNoKeyBoard) getView().findViewById(R.id.fragThreeEditText);
        keyBoardContainer = (RelativeLayout) getView().findViewById(R.id.keyBoardContainer);
        numericEditText.setFocusable(false);
        numericEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericEditText.requestFocus();
                numericEditText.requestFocusFromTouch();
                KeyBoardListener listener = new KeyBoardListener(getActivity(), keyBoardContainer, AppConstant.FRAGMENT_THREE, numericEditText.getText().toString());
                if (keyBoardContainer.getVisibility() == View.GONE) {
                    showCustomKeyBoard();
                } else {
                    hideCustomKeyBoard();
                }
            }
        });
    }

    public void setEditTextValue(int value){
        numericEditText.requestFocus();
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
}
