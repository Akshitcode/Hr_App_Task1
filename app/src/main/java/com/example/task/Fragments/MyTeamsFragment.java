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


public class MyTeamsFragment extends Fragment {
    String names[] = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak", "Harshit", "Anshul"};
    String weekOff[] = {"24-31 Jan", "Today-30Jan", "01 Feb", "02-05 Feb", "Yestarday", "14 Jan", "30 Dec", "28 Dec"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_teams, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));
        ViewsAdapter adapter =new ViewsAdapter(requireContext(), createList(names,weekOff), "Profile");
        recyclerView.setAdapter(adapter);

        return view;
    }

    private ArrayList<ViewClass> createList(String[] first, String[] second) {
        ArrayList<ViewClass> list = new ArrayList<>();

        for (int i = 0; i < first.length; i++) {
            ViewClass viewClass = new ViewClass(first[i], second[i]);
            list.add(viewClass);
        }

        return list;
    }
}