package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.task.R;


public class HomeFragment extends Fragment {

    String names [] = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak","Harshit", "Anshul"};
    String weekOff [] = {"24-31 Jan", "Today-30Jan", "01 Feb", "02-05 Feb", "Yestarday", "14 Jan", "30 Dec", "28 Dec"};
    String birth[] ={"1 March", "30 Jan", "30 Dec", "28 Dec", "01 Feb", "05 March", "26 Jan", "1 Feb"};

    String holidays [] = {"Maha Shivaratri", "Holi", "Good Friday", "Ugadi", "Eid AI Fitr", "Ram Navami","Bakrid/Eid al Adha",
            "Independence Day", "Rakshabandhan", "Krishna Jayanti/Janmashtmi"};
    String dates[] = {"Fri, 08 March 2024", "Mon, 25 March 2024", "Fri, 29 March 2024", "Tue, 09 April 2024", "Wed, 10 April 2024", "Wed, 17 April 2024", "Mon, 17 June 2024",
            "Thu, 15 August 2024", "Mon, 19 August 2024", "Mon, 26 August 2024"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        LinearLayout linearLayout = view.findViewById(R.id.horizontalProfileView);
        for (int i = 0; i < names.length; i++) {
            View listItem = LayoutInflater.from(requireContext()).inflate(R.layout.profile_view, linearLayout, false);
            TextView holiday = listItem.findViewById(R.id.nameText);
            TextView date = listItem.findViewById(R.id.daysOffText);
            holiday.setText(names[i]);
            date.setText(weekOff[i]);

            linearLayout.addView(listItem);
        }

        LinearLayout wishLinearLayout = view.findViewById(R.id.horizontalWishView);
        for (int i = 0; i < names.length; i++) {
            View listItem = LayoutInflater.from(requireContext()).inflate(R.layout.profile_view, wishLinearLayout, false);
            TextView holiday = listItem.findViewById(R.id.nameText);
            TextView date = listItem.findViewById(R.id.daysOffText);
            holiday.setText(names[i]);
            date.setText(birth[i]);

            wishLinearLayout.addView(listItem);
        }

        LinearLayout holidayLinearLayout = view.findViewById(R.id.horizontalHolidayView);
        for (int i = 0; i < holidays.length; i++) {
            View listItem = LayoutInflater.from(requireContext()).inflate(R.layout.activity_holdiay, holidayLinearLayout, false);
            TextView holiday = listItem.findViewById(R.id.holidayText);
            TextView date = listItem.findViewById(R.id.dateText);
            holiday.setText(holidays[i]);
            date.setText(dates[i]);

            holidayLinearLayout.addView(listItem);
        }

        return view;
    }
}