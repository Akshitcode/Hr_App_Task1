package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task.Adapter.HolidayViewAdapter;
import com.example.task.Adapter.ProfileViewAdapter;
import com.example.task.DataModel.ViewClass;
import com.example.task.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    String[] names = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak","Harshit", "Anshul"};
    String[] weekOff = {"24-31 Jan", "Today-30Jan", "01 Feb", "02-05 Feb", "Yestarday", "14 Jan", "30 Dec", "28 Dec"};
    String[] birth ={"1 March", "30 Jan", "30 Dec", "28 Dec", "01 Feb", "05 March", "26 Jan", "1 Feb"};

    String[] holidays = {"Maha Shivaratri", "Holi", "Good Friday", "Ugadi", "Eid AI Fitr", "Ram Navami","Bakrid/Eid al Adha",
            "Independence Day", "Rakshabandhan", "Krishna Jayanti/Janmashtmi"};
    String[] dates = {"Fri, 08 March 2024", "Mon, 25 March 2024", "Fri, 29 March 2024", "Tue, 09 April 2024", "Wed, 10 April 2024", "Wed, 17 April 2024", "Mon, 17 June 2024",
            "Thu, 15 August 2024", "Mon, 19 August 2024", "Mon, 26 August 2024"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        RecyclerView weekRecyclerView = view.findViewById(R.id.offThisWeekRecyclerView);
        weekRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        ProfileViewAdapter adapter =new ProfileViewAdapter(requireContext(), weekOffList());
        weekRecyclerView.setAdapter(adapter);

        RecyclerView wishRecyclerView = view.findViewById(R.id.wishThemRecyclerView);
        wishRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        ProfileViewAdapter adapter1 =new ProfileViewAdapter(requireContext(), wishThemList());
        wishRecyclerView.setAdapter(adapter1);


        RecyclerView holidayRecyclerView = view.findViewById(R.id.holidayRecyclerView);
        holidayRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        HolidayViewAdapter adapter2 =new HolidayViewAdapter(requireContext(), holidayList());
        holidayRecyclerView.setAdapter(adapter2);

        return view;
    }

    private ArrayList<ViewClass> holidayList() {
        ArrayList<ViewClass> list = new ArrayList<>();

        for (int i = 0; i < holidays.length; i++) {
            ViewClass viewClass = new ViewClass(holidays[i], dates[i]);
            list.add(viewClass);
        }

        return list;
    }

    private ArrayList<ViewClass> weekOffList() {

        ArrayList<ViewClass> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            ViewClass profileClass = new ViewClass(names[i],weekOff[i]);
            list.add(profileClass);
        }

        return list;
    }
    private ArrayList<ViewClass> wishThemList() {

        ArrayList<ViewClass> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            ViewClass profileClass = new ViewClass(names[i],birth[i]);
            list.add(profileClass);
        }
        return list;
    }
}