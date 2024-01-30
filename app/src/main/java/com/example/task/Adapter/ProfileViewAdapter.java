package com.example.task.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.ViewHolder.ProfileViewHolder;
import com.example.task.DataModel.ViewClass;

import java.util.ArrayList;

public class ProfileViewAdapter extends RecyclerView.Adapter<ProfileViewHolder> {

    private ArrayList<ViewClass> viewClasses;
    private Context context;

    public ProfileViewAdapter(Context context, ArrayList<ViewClass> viewClasses) {
        this.viewClasses = viewClasses;
        this.context = context;
    }


    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(com.example.task.R.layout.profile_view, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        ViewClass currentProfile = viewClasses.get(position);
        holder.getName().setText(currentProfile.getNameText());
        holder.getDate().setText(currentProfile.getWeekOffText());

    }


    @Override
    public int getItemCount() {
        return viewClasses.size();
    }
}
