package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task.Adapter.ViewsAdapter;
import com.example.task.DataModel.ViewClass;
import com.example.task.R;

import java.util.ArrayList;


public class MeFragment extends Fragment {

    String holidays [] = {"Maha Shivaratri", "Holi", "Good Friday", "Ugadi", "Eid AI Fitr", "Ram Navami","Bakrid/Eid al Adha",
            "Independence Day", "Rakshabandhan", "Krishna Jayanti/Janmashtmi"};
    String dates[] = {"Fri, 08 March 2024", "Mon, 25 March 2024", "Fri, 29 March 2024", "Tue, 09 April 2024", "Wed, 10 April 2024", "Wed, 17 April 2024", "Mon, 17 June 2024",
            "Thu, 15 August 2024", "Mon, 19 August 2024", "Mon, 26 August 2024"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);


        RecyclerView holidayRecyclerView = view.findViewById(R.id.meHolidayRecyclerView);
        holidayRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        ViewsAdapter adapter2 =new ViewsAdapter(requireContext(), holidayList(),"Holidays");
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
}