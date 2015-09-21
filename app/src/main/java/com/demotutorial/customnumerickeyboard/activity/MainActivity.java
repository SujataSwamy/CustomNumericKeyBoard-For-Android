package com.demotutorial.customnumerickeyboard.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.demotutorial.customnumerickeyboard.R;
import com.demotutorial.customnumerickeyboard.fragment.FragmentOne;
import com.demotutorial.customnumerickeyboard.fragment.FragmentThree;
import com.demotutorial.customnumerickeyboard.utilities.AppConstant;

/**
 * Created by sujata on 20/09/15.
 */
public class MainActivity extends FragmentActivity implements KeyBoardListener.onKeyBoardEvent {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void numberIsPressed(String value, String from) {
        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_ONE)){
            FragmentOne fragmentOne = (FragmentOne)  getSupportFragmentManager().findFragmentById(R.id.fragmentOne);
            if(fragmentOne != null){
                if(value.length() == 0){
                    fragmentOne.setEditTextValue(0);
                }else {
                    fragmentOne.setEditTextValue((int) Long.parseLong(value));
                }
            }
        }

        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_THREE)){
            FragmentThree fragmentThree = (FragmentThree)  getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
            if(fragmentThree != null){
                if(value.length() == 0){
                    fragmentThree.setEditTextValue(0);
                }else {
                    fragmentThree.setEditTextValue((int) Long.parseLong(value));
                }
            }
        }
    }

    @Override
    public void doneButtonPressed(String value, String from) {
        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_ONE)){
            FragmentOne fragmentOne = (FragmentOne)  getSupportFragmentManager().findFragmentById(R.id.fragmentOne);
            if(fragmentOne != null){
                if(value.length() == 0){
                    fragmentOne.setEditTextValue(0);
                }else {
                    fragmentOne.setEditTextValue((int) Long.parseLong(value));
                }
                fragmentOne.hideCustomKeyBoard();
            }
        }

        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_THREE)){


            FragmentThree fragmentThree = (FragmentThree)  getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
            if(fragmentThree != null){
                if(value.length() == 0){
                    fragmentThree.setEditTextValue(0);
                }else {
                    fragmentThree.setEditTextValue((int) Long.parseLong(value));
                }
                fragmentThree.hideCustomKeyBoard();
            }
        }
    }

    @Override
    public void backLongPressed(String from) {

        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_ONE)){
            FragmentOne fragmentOne = (FragmentOne)  getSupportFragmentManager().findFragmentById(R.id.fragmentOne);
            if(fragmentOne != null){
                fragmentOne.setEditTextValue(0);
            }
        }

        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_THREE)){
            FragmentThree fragmentThree = (FragmentThree)  getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
            if(fragmentThree != null){
                fragmentThree.setEditTextValue(0);
            }
        }
    }

    @Override
    public void backButtonPressed(String value, String from) {

        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_ONE)){
            FragmentOne fragmentOne = (FragmentOne)  getSupportFragmentManager().findFragmentById(R.id.fragmentOne);
            if(fragmentOne != null){
                if(value.length() == 0){
                    fragmentOne.setEditTextValue(0);
                }else {
                    fragmentOne.setEditTextValue((int) Long.parseLong(value));
                }
            }
        }

        if(from!= null && from.equalsIgnoreCase(AppConstant.FRAGMENT_THREE)){
            FragmentThree fragmentThree = (FragmentThree)  getSupportFragmentManager().findFragmentById(R.id.fragmentThree);
            if(fragmentThree != null){
                if(value.length() == 0){
                    fragmentThree.setEditTextValue(0);
                }else {
                    fragmentThree.setEditTextValue((int) Long.parseLong(value));
                }
            }
        }

    }
}
