package com.ast.jobsonthemapemployer;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Agents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agents);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarafent);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager3);
        PreviousJob_PagerAdapter adapter = new PreviousJob_PagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one
        adapter.addFragment(new Favorites(), "Favorites");
        adapter.addFragment(new  Agency_List(), "Agency");
        //adapter.addFragment(new FragmentThree(), "FRAG3");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.agent_tab);
        tabLayout.setupWithViewPager(viewPager);

    }
}
