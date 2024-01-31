package com.example.task.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.DataModel.ViewClass;
import com.example.task.R;
import com.example.task.ViewHolder.HolidayViewHolder;
import com.example.task.ViewHolder.ProfileViewHolder;

import java.util.ArrayList;

public class ViewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private ArrayList<ViewClass> viewClasses;
    private Context context;
    String type;

    public ViewsAdapter(Context context, ArrayList<ViewClass> viewClasses,String type) {
        this.viewClasses = viewClasses;
        this.context = context;
        this.type = type;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (type) {
            case "Profile":
                View view1 = inflater.inflate(R.layout.profile_view, parent, false);
                return new ProfileViewHolder(view1);

            case "Holidays":
                View view2 = inflater.inflate(R.layout.activity_holdiay, parent, false);
                return new HolidayViewHolder(view2);


            default:
                throw new IllegalArgumentException("Invalid view type");
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (type) {
            case "Profile":
                ((ProfileViewHolder) holder).getName().setText(viewClasses.get(position).getNameText());
                ((ProfileViewHolder) holder).getDate().setText(viewClasses.get(position).getWeekOffText());
                break;

            case "Holidays":
                ((HolidayViewHolder) holder).getHolidayText().setText(viewClasses.get(position).getNameText());
                ((HolidayViewHolder) holder).getDateText().setText(viewClasses.get(position).getWeekOffText());
                break;

        }

    }

    @Override
    public int getItemCount() {
        return viewClasses.size();
    }

}
