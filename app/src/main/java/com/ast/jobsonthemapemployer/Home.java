package com.ast.jobsonthemapemployer;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Statement;

public class Home extends AppCompatActivity implements View.OnClickListener {

    String names[];
    DrawerLayout mDrawerLayout;
    ListView mDrawerList;
    ImageView notify;
    LinearLayout newPost, activPost;
    FrameLayout Chat;

int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //custom tool bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toobarhome);
        setSupportActionBar(toolbar);

        ImageView drawer = (ImageView) findViewById(R.id.imageView77);
        notify = (ImageView) findViewById(R.id.imageView78);
        Chat = (FrameLayout) findViewById(R.id.chatbtn);



        ///Side Drawer///

        names = new String[]{"Home", "Profile", "Previous Post" , "Payment Information", "Rate Agents", "Statement" , "Logout" , };
        int img[] = {R.mipmap.profile_icon, R.mipmap.profile_icon, R.mipmap.profile_icon, R.mipmap.payment_icon , R.mipmap.rate_icon ,  R.mipmap.statements_icon, R.mipmap.logout_icon};
        //mPlanetTitles = getResources().getStringArray(R.array.planets_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerList.setFitsSystemWindows(true);

        mDrawerList.setAdapter(new Drawer_Class(this, img, names));
        ViewGroup header = (ViewGroup) getLayoutInflater().inflate(R.layout.drawer_nav, mDrawerList, false);
        mDrawerList.addHeaderView(header, null, false);

        View footer = getLayoutInflater().inflate(R.layout.drawer_footer, null);
        mDrawerList.addFooterView(footer);

        ImageView imageViewhead = (ImageView) header.findViewById(R.id.proImg);

        drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mDrawerLayout.isDrawerOpen(Gravity.LEFT))
                {
                    mDrawerLayout.closeDrawer(mDrawerList);
                    // getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
                    // getSupportActionBar().setCustomView(R.layout.menu_title);
                    // getSupportActionBar().show();


                }
                else {
                    mDrawerLayout.openDrawer(Gravity.LEFT);
                    //getSupportActionBar().hide();
                    // requestWindowFeature(Window.FEATURE_NO_TITLE);
                }

            }
        });

        newPost = (LinearLayout) findViewById(R.id.newPOst);
        activPost = (LinearLayout) findViewById(R.id.activepost);
        newPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Check", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Home.this,New_Post.class);
                startActivity(i);
            }
        });

        activPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,ActivePost_fragement.class);
                startActivity(i);
            }
        });

        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Notification.class);
                startActivity(i);
            }
        });

        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Chat.class);
                startActivity(i);
            }
        });




        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

    }

    @Override
    public void onClick(View v) {

    }


    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    private void selectItem(int position)
    {
        Intent i;

        switch (position)
        {
            case 1:
//                i = new Intent(Home.this, HomeShowAll.class);
//                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
//                break;

            case 2:
                //                i = new Intent(Home.this, Job_Offer.class);
//                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
                break;

            case 3:
                i = new Intent(Home.this, PreviousPost_fragment.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

                break;

            case 4:
                i = new Intent(Home.this, Payment_Information.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
//                i = new Intent(Home.this, Job_Offer.class);
//                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
                break;

            case 5:
//                i = new Intent(Home.this, Statements.class);
//                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
                break;

            case 6:
                i = new Intent(Home.this, Statements.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;

            case 7:
//                firebaseAuth.signOut();
//                finish();
                i = new Intent(Home.this, Login.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
//                Log.i("test","check");
                break;

        }


    }

}
