package com.demotutorial.customnumerickeyboard.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demotutorial.customnumerickeyboard.R;

/**
 * Created by sujata on 20/09/15.
 */
public class FragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two,container,false);
        return view;

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
