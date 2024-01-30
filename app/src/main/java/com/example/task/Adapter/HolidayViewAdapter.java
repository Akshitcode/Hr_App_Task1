package com.example.task.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.ViewHolder.HolidayViewHolder;
import com.example.task.R;
import com.example.task.DataModel.ViewClass;

import java.util.ArrayList;

public class HolidayViewAdapter extends RecyclerView.Adapter<HolidayViewHolder> {

    private ArrayList<ViewClass> viewClasses;
    private Context context;

    public HolidayViewAdapter(Context context, ArrayList<ViewClass> viewClasses) {
        this.viewClasses = viewClasses;
        this.context = context;
    }
    @NonNull
    @Override
    public HolidayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_holdiay, parent, false);
        return new HolidayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayViewHolder holder, int position) {
        holder.getHolidayText().setText(viewClasses.get(position).getNameText());
        holder.getDateText().setText(viewClasses.get(position).getWeekOffText());
    }

    @Override
    public int getItemCount() {
        return viewClasses.size();
    }
}
