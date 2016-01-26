package com.example.tacademy.sampletabhost1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-26.
 */
public class TabView extends FrameLayout {
    public TabView(Context context) {
        super(context);
        init();
    }
    TextView text_title;
    private void init(){
        inflate(getContext(),R.layout.tab_title_view, this);
        text_title = (TextView)findViewById(R.id.tab_title_view);
    }

    public void setTitle(String title){
        text_title.setText(title);
    }
}
