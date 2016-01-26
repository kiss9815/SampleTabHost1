package com.example.tacademy.sampletabhost1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;
    private static final String TAB_TAB1 = "tab1";
    private static final String TAB_TAB2 = "tab2";
    private static final String TAB_TAB3 = "tab3";

    private static final String TAB_TAB1_TITLE = "tab1 title";
    private static final String TAB_TAB2_TITLE = "tab2 title";
    private static final String TAB_TAB3_TITLE = "tab3 title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec(TAB_TAB1); // 탭 맨위의 버튼을 설정하는 것이 tabspec
        spec.setIndicator(TAB_TAB1_TITLE);
        spec.setContent(R.id.tab1);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec(TAB_TAB2); // 탭 맨위의 버튼을 설정하는 것이 tabspec
        spec.setIndicator(TAB_TAB2_TITLE);
        spec.setContent(R.id.tab2);
        tabHost.addTab(spec);


        spec = tabHost.newTabSpec(TAB_TAB3); // 탭 맨위의 버튼을 설정하는 것이 tabspec
        spec.setIndicator(TAB_TAB3_TITLE);
        spec.setContent(R.id.tab3);
        tabHost.addTab(spec);



    }
}
