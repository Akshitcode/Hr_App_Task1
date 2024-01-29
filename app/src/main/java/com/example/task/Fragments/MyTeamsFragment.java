package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.task.R;


public class MyTeamsFragment extends Fragment {
    String names [] = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak","Harshit", "Anshul"};
    String weekOff [] = {"24-31 Jan", "Today-30Jan", "01 Feb", "02-05 Feb", "Yestarday", "14 Jan", "30 Dec", "28 Dec"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_teams, container, false);

        LinearLayout linearLayout = view.findViewById(R.id.horizontalWeekOffView);
        for (int i = 0; i < weekOff.length; i++) {
            View listItem = LayoutInflater.from(requireContext()).inflate(R.layout.profile_view, linearLayout, false);
            TextView holiday = listItem.findViewById(R.id.nameText);
            TextView date = listItem.findViewById(R.id.daysOffText);
            holiday.setText(names[i]);
            date.setText(weekOff[i]);

            linearLayout.addView(listItem);
        }

        return view;
    }
}