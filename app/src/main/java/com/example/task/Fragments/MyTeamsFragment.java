package com.example.task.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task.Adapter.ProfileViewAdapter;
import com.example.task.ViewClass;
import com.example.task.R;

import java.util.ArrayList;


public class MyTeamsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_teams, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));


        ProfileViewAdapter adapter =new ProfileViewAdapter(requireContext(), weekOffList());
        recyclerView.setAdapter(adapter);

        return view;
    }
    private ArrayList<ViewClass> weekOffList() {
        String names[] = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak", "Harshit", "Anshul"};
        String weekOff[] = {"24-31 Jan", "Today-30Jan", "01 Feb", "02-05 Feb", "Yestarday", "14 Jan", "30 Dec", "28 Dec"};

        ArrayList<ViewClass> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            ViewClass profileClass = new ViewClass(names[i],weekOff[i]);
            list.add(profileClass);
        }


        return list;
    }
}