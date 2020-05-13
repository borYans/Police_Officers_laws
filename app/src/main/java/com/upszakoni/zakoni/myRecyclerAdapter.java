package com.upszakoni.zakoni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class myRecyclerAdapter extends RecyclerView.Adapter<myRecyclerAdapter.myViewHolder> {


    private ArrayList<Offenses> offensesList;


    public static class myViewHolder extends RecyclerView.ViewHolder {

        TextView titleText1;
        TextView descriptionText2;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText1 = itemView.findViewById(R.id.titleText);
            descriptionText2 = itemView.findViewById(R.id.text2);

        }

    }

    public myRecyclerAdapter(ArrayList<Offenses> offenses) {
        offensesList = offenses;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.offenses_item, parent, false);
        myViewHolder mvh = new myViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Offenses currentItem = offensesList.get(position);
        holder.titleText1.setText(currentItem.getTitle());
        holder.descriptionText2.setText(currentItem.getDescription());


    }

    @Override
    public int getItemCount() {
        return offensesList.size();
    }

}
