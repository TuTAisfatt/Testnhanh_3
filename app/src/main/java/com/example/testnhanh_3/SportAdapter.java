package com.example.testnhanh_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {

    private List<Sports> sportsList;

    public SportAdapter(List<Sports> sportsList) {
        this.sportsList = sportsList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sport, parent, false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        Sports sport = sportsList.get(position);
        holder.textView.setText(sport.getName());
        holder.imageView.setImageResource(sport.getImageResId());
    }

    @Override
    public int getItemCount() {
        return sportsList.size();
    }

    static class SportViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSport);
            textView = itemView.findViewById(R.id.textViewSportName);
        }
    }
}
