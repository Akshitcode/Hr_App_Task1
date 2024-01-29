package com.example.task.Model;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;

public class HolidayViewHolder extends RecyclerView.ViewHolder {

    private TextView holidayText, dateText;
    public HolidayViewHolder(@NonNull View itemView) {
        super(itemView);

        holidayText = itemView.findViewById(R.id.holidayText);
        dateText = itemView.findViewById(R.id.dateText);
    }

    public TextView getHolidayText() {
        return holidayText;
    }

    public TextView getDateText() {
        return dateText;
    }
}
