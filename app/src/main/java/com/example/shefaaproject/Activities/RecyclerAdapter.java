package com.example.shefaaproject.Activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shefaaproject.R;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DiseasViewHolder>{
    private List<Advice> advicesList;

    public RecyclerAdapter(List<Advice> advicesList) {
        this.advicesList = advicesList;
    }


    //3 methods
    @NonNull
    @Override
    public DiseasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new DiseasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiseasViewHolder holder, int position) {
        Advice person=advicesList.get(position);
        holder.diseasTitle.setText(person.getDiseasName());
        holder.diseasPhoto.setImageResource(person.getDiseasImage());

    }

    @Override
    public int getItemCount() {
        return advicesList.size();
    }

    public static class DiseasViewHolder extends RecyclerView.ViewHolder{
        public TextView diseasTitle;
        public CircularImageView diseasPhoto;

        public DiseasViewHolder(@NonNull View itemView) {
            super(itemView);
            diseasTitle=itemView.findViewById(R.id.diseas_name);
            diseasPhoto=itemView.findViewById(R.id.diseas_image);


        }
    }
}
