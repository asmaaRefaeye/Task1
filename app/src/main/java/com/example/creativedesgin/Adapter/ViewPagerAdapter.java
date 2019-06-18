package com.example.creativedesgin.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.creativedesgin.Views.FragmentTabOne;
import com.example.creativedesgin.Views.FragmentTabThree;
import com.example.creativedesgin.Views.FragmentTabTwo;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int numberOfTabs;

    public ViewPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                FragmentTabOne tab1 =new FragmentTabOne();
                return tab1;
            case 1 :
                FragmentTabTwo tab2= new FragmentTabTwo();
                return tab2;
            case 2 :
                FragmentTabThree tab3 = new FragmentTabThree();
                return tab3 ;
                default:
                    return null;
        }


    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
