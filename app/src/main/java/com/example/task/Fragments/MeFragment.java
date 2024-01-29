package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.task.R;


public class MeFragment extends Fragment {

    String holidays [] = {"Maha Shivaratri", "Holi", "Good Friday", "Ugadi", "Eid AI Fitr", "Ram Navami","Bakrid/Eid al Adha",
            "Independence Day", "Rakshabandhan", "Krishna Jayanti/Janmashtmi"};
    String dates[] = {"Fri, 08 March 2024", "Mon, 25 March 2024", "Fri, 29 March 2024", "Tue, 09 April 2024", "Wed, 10 April 2024", "Wed, 17 April 2024", "Mon, 17 June 2024",
            "Thu, 15 August 2024", "Mon, 19 August 2024", "Mon, 26 August 2024"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);


        LinearLayout linearLayout = view.findViewById(R.id.horizontalLinearLayout);
        for (int i = 0; i < holidays.length; i++) {
            View listItem = LayoutInflater.from(requireContext()).inflate(R.layout.activity_holdiay, linearLayout, false);
            TextView holiday = listItem.findViewById(R.id.holidayText);
            TextView date = listItem.findViewById(R.id.dateText);
            holiday.setText(holidays[i]);
            date.setText(dates[i]);

            // Add the listItem to the horizontalLinearLayout
            linearLayout.addView(listItem);
        }
        return view;
    }
}