package com.ast.jobsonthemapemployer;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Current_Job_Fragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current__job__fragments);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toobarPre);
//        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        PreviousJob_PagerAdapter adapter = new PreviousJob_PagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one
        adapter.addFragment(new Agents_Request_list(), "Agents");
        adapter.addFragment(new Active_Map(), "Map");
        adapter.addFragment(new Current_Job_list(), "Details");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}