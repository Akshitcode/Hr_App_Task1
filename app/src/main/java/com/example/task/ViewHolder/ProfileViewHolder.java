package com.example.task.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;

public class ProfileViewHolder extends RecyclerView.ViewHolder {

    private final TextView name;
    private final TextView date;

    public ProfileViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.nameText);
        date = itemView.findViewById(R.id.daysOffText);
    }


    public TextView getName() {
        return name;
    }

    public TextView getDate() {
        return date;
    }
}
