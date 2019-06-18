package com.example.creativedesgin.Views;

import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.creativedesgin.Adapter.ViewPagerAdapter;
import com.example.creativedesgin.R;

public class MainActivity extends AppCompatActivity implements FragmentTabOne.OnFragmentInteractionListener,
        FragmentTabTwo.OnFragmentInteractionListener,FragmentTabThree.OnFragmentInteractionListener{

    Button ferganyButton , othersButton;
    ImageView plusImageView ,backImageView ;
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniate();
    }

    public void iniate() {
        ferganyButton = findViewById(R.id.fergany_button);
        othersButton = findViewById(R.id.others_button);
        plusImageView = findViewById(R.id.plus_imageView);
        backImageView = findViewById(R.id.back_imageView);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab3));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        ferganyButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                ferganyButton.setBackground(getResources().getDrawable(R.drawable.button_one_white_bachground));
                Toast.makeText(MainActivity.this, "أضف طلبك فى قائمة قيد الانتظار ", Toast.LENGTH_SHORT).show();

            }

        });

        othersButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                othersButton.setBackground(getResources().getDrawable(R.drawable.button_two_white_bachground));
                Toast.makeText(MainActivity.this, "أضف طلبك فى قائمة قيد الانتظار ", Toast.LENGTH_SHORT).show();
            }
        });


    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
