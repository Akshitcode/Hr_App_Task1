package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.task.Adapter.MyPagerAdapter;
import com.example.task.Adapter.ViewsAdapter;
import com.example.task.DataModel.ViewClass;
import com.example.task.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class MeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);





        TabLayout tabLayout = view.findViewById(R.id.tabLayout);
        ViewPager2 viewPager = view.findViewById(R.id.viewPager);

        Fragment[] fragments = new Fragment[]{
                new TimeFragment(), new FinancesFragment(),new PerformancesFragment(), new HelpdeskFragment()
        };

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getChildFragmentManager(),getLifecycle(), fragments);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {

            switch (position){
                case 0:
                    tab.setText("Time");
//                    tab.setText("t".toUpperCase()+"ime".toLowerCase());
                    break;
                case 1:
                    tab.setText("f".toUpperCase()+"inances".toLowerCase());
                    break;
                case 2:
                    tab.setText("p".toUpperCase()+"erformance".toLowerCase());
                    break;
                case 3:
                    tab.setText("h".toUpperCase()+"elpdesk".toLowerCase());
                    break;
                default:
                    break;
            }


        }).attach();

//        viewPager.setUserInputEnabled(false);

        return view;
    }



}