package com.ast.jobsonthemapemployer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    TextView re_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView text = (TextView) findViewById(R.id.textView258);
        re_login = (TextView) findViewById(R.id.textView4);




        //define Html style
        String first = "By signing up, you agree to our  ";
        String second = "Terms of Service";
        String third = " and confirm that you have read our ";
        String fourth = "Privacy Policy";
        String fifth = ". You may receive e-mail notification from Jobs On The Map and can opt out at any time";
        //Spanned spanned = fromHtml(first + second + third + fourth + fifth);

        Spanned spanned = fromHtml(first + second + third + fourth + fifth);
        text.setText(first + second + third + fourth + fifth, TextView.BufferType.SPANNABLE);
        Spannable s = (Spannable) text.getText();
        int start = first.length() + second.length() + third.length();
        int end = start + fourth.length();
        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int start2 = first.length();
        int end2 = start2 + second.length();
        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)), start2, end2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        re_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }



    //html func
    public static Spanned fromHtml(String html){
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}
