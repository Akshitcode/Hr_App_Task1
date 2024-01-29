package com.example.task.Model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task.R;

public class ProfileViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView date;

    public ProfileViewHolder(@NonNull View itemView) {
        super(itemView);
//        imageView = itemView.findViewById(R.id.imageProfile);
        name =(TextView) itemView.findViewById(R.id.nameText);
        date = (TextView) itemView.findViewById(R.id.daysOffText);
    }


    public TextView getName() {
        return name;
    }

    public TextView getDate() {
        return date;
    }
}
