package com.ast.jobsonthemapemployer;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ActivePost_fragement extends AppCompatActivity {

    ImageView Filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_post_fragement);

        Toolbar toolbar = (Toolbar) findViewById(R.id.active);
        setSupportActionBar(toolbar);

        Filter = (ImageView) findViewById(R.id.filteimg);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager2);
        Active_PagerAdapter adapter = new Active_PagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one
        adapter.addFragment(new Active_Map(), "MAP");
        adapter.addFragment(new  Active_List(), "LIST");
        //adapter.addFragment(new FragmentThree(), "FRAG3");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout2);
        tabLayout.setupWithViewPager(viewPager);

        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivePost_fragement.this,Filter_ac.class);
                startActivity(i);

            }
        });


    }
}
