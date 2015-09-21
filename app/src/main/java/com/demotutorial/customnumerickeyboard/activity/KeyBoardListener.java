package com.demotutorial.customnumerickeyboard.activity;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.demotutorial.customnumerickeyboard.R;

/**
 * Created by sujata on 12/09/15.
 */
public class KeyBoardListener {

    private final Context context;
    private final RelativeLayout keyBoardContainer;
    private final Button done_btn;
    private final String from;
    private StringBuilder sb;
    private int currentLength;
    private final Button one_btn;
    private final Button two_btn;
    private final Button three_btn;
    private final Button four_btn;
    private final Button five_btn;
    private final Button six_btn;
    private final Button seven_btn;
    private final Button eight_btn;
    private final Button nine_btn;
    private final Button zero_btn;
    private final Button back_btn;
    private int maxLength=10;

    public KeyBoardListener(final Context context, RelativeLayout container, final String from, String editTextAmtValue){
        this.context = context;
        this.keyBoardContainer = container;
        this.from = from;

            if(editTextAmtValue != null) {
                sb = new StringBuilder(editTextAmtValue);
            }else{
                sb=new StringBuilder("");
            }
        currentLength=sb.length();
        one_btn=(Button)keyBoardContainer.findViewById(R.id.one_btn);
        one_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                add("1");
            }
        });
        two_btn=(Button)keyBoardContainer.findViewById(R.id.two_btn);
        two_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("2");
            }
        });
        three_btn=(Button)keyBoardContainer.findViewById(R.id.three_btn);
        three_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("3");

            }
        });
        four_btn=(Button)keyBoardContainer.findViewById(R.id.four_btn);
        four_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("4");
            }
        });
        five_btn=(Button)keyBoardContainer.findViewById(R.id.five_btn);
        five_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("5");

            }
        });
        six_btn=(Button)keyBoardContainer.findViewById(R.id.six_btn);
        six_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                add("6");
            }
        });
        seven_btn=(Button)keyBoardContainer.findViewById(R.id.seven_btn);
        seven_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("7");
            }
        });
        eight_btn=(Button)keyBoardContainer.findViewById(R.id.eight_btn);
        eight_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("8");

            }
        });
        nine_btn=(Button)keyBoardContainer.findViewById(R.id.nine_btn);
        nine_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                add("9");
            }
        });
        zero_btn=(Button)keyBoardContainer.findViewById(R.id.zero_btn);
        zero_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(sb.length()>0)
                    add("0");
            }
        });
        back_btn=(Button)keyBoardContainer.findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(sb.length()>0)
                {
                    currentLength--;
                    sb.deleteCharAt((sb.length())-1);
                    ((MainActivity)   context).backButtonPressed(sb.toString(), from);
                }
            }
        });
        back_btn.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                currentLength=0;
                sb=new StringBuilder();
                ((MainActivity)   context).backLongPressed(from);
                return false;
            }
        });
        done_btn=(Button)keyBoardContainer.findViewById(R.id.done_btn);
        done_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity)   context).doneButtonPressed(sb.toString(), from);
            }
        });

    }

    public interface onKeyBoardEvent
    {
        public void numberIsPressed(String total, String from);
        public void doneButtonPressed(String total, String from);
        public void backLongPressed(String from);
        public void backButtonPressed(String total, String from);
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
    public void add(String num)
    {
        currentLength++;
        if(currentLength<=maxLength)
        {
            sb.append(num);
            ((MainActivity)   context).numberIsPressed(sb.toString(), from);



        }
        else
            currentLength--;
    }




}
